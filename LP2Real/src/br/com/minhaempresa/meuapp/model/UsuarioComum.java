package br.com.minhaempresa.meuapp.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioComum extends Usuario{

	private List<Post> postsUsuario;
	private List<Avaliacao> avaliacoesUsuario;
	private List<Post> postsSalvos;
	
	public UsuarioComum(String nome, String email, String senha) {
		super(nome, email, senha);
		this.postsUsuario = new ArrayList<> ();
		this.avaliacoesUsuario = new ArrayList<> ();
		this.postsSalvos = new ArrayList<> ();
		this.tipo = "comum";
		
	}
	
	@Override
	public void exibirFuncionalidades() {
		System.out.printf("[Usuário comum] Adicionar/Remover Post - Adicionar/Remover avaliação - Adicionar/Remover post salvo \n ");
	}
	
	public void userAdicionarPost(Post post) {
		postsUsuario.add(post);
	}
	
	public void userRemoverPost(Post post) {
		if(postsUsuario.contains(post)) {
			postsUsuario.remove(post);
		}
		if(postsSalvos.contains(post)) {
			postsSalvos.remove(post);
		}
	}
	
	public void userAdicionarAvaliacao(Avaliacao avaliacao) {
		avaliacoesUsuario.add(avaliacao);
	}
	
	public void userRemoverAvaliacao(Avaliacao avaliacao) {
		avaliacoesUsuario.remove(avaliacao);
	}

	public void userSalvarPost(Post post) {
		postsSalvos.add(post);
	}
	
	public void userRemoverPostSalvo(Post post) {
		postsSalvos.remove(post);
	}
	
	public void exibirListaPost() {
		for(Post p : postsUsuario) {
			p.exibirInformacoes();
		}
	}
	
	public List<Post> getPostsUsuario() {
		return postsUsuario;
	}
	
	public List<Post> getPostsSalvos(){
		return postsSalvos;
	}
}
