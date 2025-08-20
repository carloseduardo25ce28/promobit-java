package br.com.minhaempresa.meuapp.service;

import java.util.ArrayList;
import java.util.List;

import br.com.minhaempresa.meuapp.model.*;

public class GerenciadorPost {
	private List<Post> listaPost;

	public GerenciadorPost() {
		listaPost = new ArrayList<>();
	}

	public void adicionar(Post post, Usuario usuario) {
		if (post == null || usuario == null || listaPost.contains(post)) {
			return;
		}
		if (usuario instanceof UsuarioComum) {
			((UsuarioComum) usuario).userAdicionarPost(post);
		}
		listaPost.add(post);
	}

	public boolean remover(int idPost, Usuario solicitante, GerenciadorUsuario gerenciadorUsuario) {
		Post postEncontrado = buscarPost(idPost);
		if (postEncontrado == null || solicitante == null) {
			return false;
		}

		Usuario autor = postEncontrado.getUsuario();

		if (solicitante instanceof UsuarioComum) {
			if (autor.equals(solicitante)) {
				((UsuarioComum) solicitante).userRemoverPost(postEncontrado);
				listaPost.remove(postEncontrado);
				for(Usuario u : gerenciadorUsuario.getTodosUsuarios()) {
					if(u instanceof UsuarioComum) {
						((UsuarioComum) u).userRemoverPost(postEncontrado);
					}
				}
				return true;
			}
		} else if (solicitante instanceof UsuarioAdministrador) {
			if (autor instanceof UsuarioComum) {
				((UsuarioComum) autor).userRemoverPost(postEncontrado);
			}
			((UsuarioAdministrador) solicitante).userRegistrarPostRemovido(postEncontrado);
			listaPost.remove(postEncontrado);
			for(Usuario u : gerenciadorUsuario.getTodosUsuarios()) {
				if(u instanceof UsuarioComum) {
					((UsuarioComum) u).userRemoverPost(postEncontrado);
				}
			}
			return true;
		}

		return false;
	}

	public Post buscarPost(int idPost) {
		for (Post p : listaPost) {
			if (p.getId() == idPost) {
				return p;
			}
		}
		return null;
	}

	public boolean salvarPost(Usuario usuario, Post post) {
		if (usuario == null || post == null || !listaPost.contains(post)) return false;
		if (!post.getUsuario().equals(usuario) && usuario instanceof UsuarioComum) {
			((UsuarioComum) usuario).userSalvarPost(post);
			return true;
		}
		return false;
	}

	public boolean removerPostSalvo(Usuario solicitante, int idPost) {
		Post postEncontrado = buscarPost(idPost);
		if (postEncontrado == null || solicitante == null) {
			return false;
		}
		
		if (solicitante instanceof UsuarioComum && ((UsuarioComum) solicitante).getPostsSalvos().contains(postEncontrado)) {
			((UsuarioComum) solicitante).userRemoverPostSalvo(postEncontrado);
			return true;
		}
		return false;
	}

	public void removerTodosPosts(Usuario usuario) {
		if (usuario == null) return;
		List<Post> postsParaRemover = new ArrayList<>();
		for (Post p : listaPost) {
			if (p.getUsuario().equals(usuario)) {
				postsParaRemover.add(p);
			}
		}
		for (Post p : postsParaRemover) {
			if (usuario instanceof UsuarioComum) {
				((UsuarioComum) usuario).userRemoverPost(p);
			}
			listaPost.remove(p);
		}
	}

	public List<Post> listarTodos() {
		return listaPost;
	}
	
	
	
	public List<Post> listarPostsSalvos(Usuario usuario){
		return ((UsuarioComum) usuario).getPostsSalvos();
	}
	
	public void exibirPostsPorCategoria(Categoria categoria) {
	    if (categoria == null) {
	        System.out.println("Categoria inválida.");
	        return;
	    }
	    
	    
	    
	    boolean encontrou = false;
	    System.out.println("=== PROMOÇÕES DA CATEGORIA: " + categoria + " ===\n");

	    for (Post post : listarTodos()) {
	        if (categoria.equals(post.getItem().getCategoria())) {
	            encontrou = true;
	            //System.out.println("-----------------------------------");
	            //System.out.println("Título: " + post.getItem().getNome());
	            //System.out.println("Descrição: " + post.getDescricao());

	            Item item = post.getItem();
	            if (item != null) {
	                post.exibirInformacoes();
	            }

	            //System.out.println("Publicado por: " + post.getUsuario().getNome());
	            //for(Avaliacao a : post.getAvaliacoes()) {
	            //	a.exibirInformacoes();
	            //}
	        }
	    }

	    if (!encontrou) {
	        System.out.println("Nenhuma promoção encontrada para essa categoria.");
	    }

	    System.out.println("-----------------------------------\n");
	}
}





