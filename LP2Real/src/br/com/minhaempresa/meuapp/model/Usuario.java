package br.com.minhaempresa.meuapp.model;

import br.com.minhaempresa.meuapp.util.*;

public abstract class Usuario {
	
	protected int id;
	protected static int usuariosCriados = 1;
	protected String nome;
	protected String senha;
	protected String email;
	protected String tipo;
	
	
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.id = usuariosCriados;
		usuariosCriados++;
	}

	public boolean mudarEmail(String novoEmail) {
		if(novoEmail == null || novoEmail.isBlank()) return false;
		if(!Validador.isEmail(novoEmail)) return false;
		this.email = novoEmail;
		return true;
	}
	
	public boolean mudarSenha(String senhaAntiga, String novaSenha) {
		if(!senhaAntiga.equals(this.senha)) return false;
		this.senha = novaSenha;
		return true;
	}
	
	public boolean isSenhaCorreta(String senha) {
		return(senha.equals(this.senha));
	}

	public abstract void exibirFuncionalidades();
	
	public void exibirUsuario() {
		System.out.printf("Tipo: %s - Id: %d - Nome: %s - Email: %s\n", this.tipo, this.id, this.nome, this.email);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTipo() {
		return tipo;
	}
	
}
