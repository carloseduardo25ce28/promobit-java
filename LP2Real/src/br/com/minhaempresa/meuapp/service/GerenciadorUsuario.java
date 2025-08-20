package br.com.minhaempresa.meuapp.service;

import java.util.ArrayList;
import java.util.List;

import br.com.minhaempresa.meuapp.model.*;
import br.com.minhaempresa.meuapp.util.Validador;

public class GerenciadorUsuario {

	private List<Usuario> todosUsuarios;
	private GerenciadorPost gerenciadorPost;
	private GerenciadorAvaliacao gerenciadorAvaliacao;

	public GerenciadorUsuario(GerenciadorPost gp, GerenciadorAvaliacao ga) {
		this.todosUsuarios = new ArrayList<>();
		this.gerenciadorPost = gp;
		this.gerenciadorAvaliacao = ga;
	}

	public Usuario fazerLogin(String email, String senha) {
		if (email == null || email.isBlank() || senha == null || senha.isBlank()) {
			return null;
		}
		for (Usuario u : todosUsuarios) {
			if (email.equals(u.getEmail()) && u.isSenhaCorreta(senha)) {
				return u;
			}
		}
		return null;
	}

	public boolean adicionarUsuario(Usuario usuarioNovo) {
		if (usuarioNovo == null)
			return false;
		for (Usuario u : todosUsuarios) {
			if (u.getEmail().equals(usuarioNovo.getEmail())) {
				return false;
			}
		}
		todosUsuarios.add(usuarioNovo);
		return true;
	}

	public boolean usuarioExiste(int id) {
		return buscarUsuario(id) != null;
	}

	public boolean removerUsuario(int idParaRemover, Usuario solicitante) {
		Usuario u = buscarUsuario(idParaRemover);
		if (u == null || solicitante == null) return false;

		if (!(solicitante instanceof UsuarioAdministrador)) {
			System.out.println("Apenas administradores podem remover usuários.");
			return false;
		}

		// Remover posts e avaliações
		gerenciadorPost.removerTodosPosts(u);
		gerenciadorAvaliacao.removerTodasAvaliacoes(u);

		todosUsuarios.remove(u);
		((UsuarioAdministrador) solicitante).userRegistrarUsuarioRemovido(u);
		return true;
	}

	public Usuario buscarUsuario(int id) {
		for (Usuario u : todosUsuarios) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}

	public Usuario buscarUsuario(String email) {
		if (email == null || email.isBlank())
			return null;
		for (Usuario u : todosUsuarios) {
			if (u.getEmail().equals(email)) {
				return u;
			}
		}
		return null;
	}

	public List<Usuario> getTodosUsuarios() {
		return todosUsuarios;
	}
	
	public void listarUsuarioPost() {
		for(Usuario u : todosUsuarios) {
			if(u instanceof UsuarioComum) {
				System.out.println(u.getNome());
				System.out.println(((UsuarioComum) u).getPostsUsuario().size());
				System.out.println();
			}
		}
	}
}











