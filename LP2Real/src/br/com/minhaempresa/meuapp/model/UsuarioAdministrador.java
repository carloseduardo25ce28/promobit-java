package br.com.minhaempresa.meuapp.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAdministrador extends Usuario{

	private List<Post> postsRemovidos;
	private List<Avaliacao> avaliacoesRemovidas;
	private List<Usuario> usuariosRemovidos;
	
	public UsuarioAdministrador(String nome, String email, String senha) {
		super(nome, email, senha);
		this.postsRemovidos = new ArrayList<> ();
		this.avaliacoesRemovidas = new ArrayList<> ();
		this.usuariosRemovidos = new ArrayList<> ();
		this.tipo = "administrador";
	}
	
	@Override
	public void exibirFuncionalidades() {
		System.out.printf("[Usuário Administrador] Remover usuário - Remover Post - Remover avaliação\n ");
	}
	
	public void userRegistrarPostRemovido(Post post) {
		postsRemovidos.add(post);
	}
	
	public void userRegistrarAvaliacaoRemovida(Avaliacao avaliacao) {
		avaliacoesRemovidas.add(avaliacao);
	}
	
	public void userRegistrarUsuarioRemovido(Usuario usuario) {
		usuariosRemovidos.add(usuario);
	}
	
}
