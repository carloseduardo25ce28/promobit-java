package br.com.minhaempresa.meuapp.model;

import java.util.ArrayList;
import java.util.List;

public class Post implements IntefaceExibirInformacoes{
	private int id;
	private Item item;
	private double precoOriginal;
	private double precoComDesconto;
	private String link;
	private String descricao;
	private List<Avaliacao> avaliacoes;
	private Usuario usuario;
	private static int postsCriados = 1;
	
	public Post(Item item, double precoOriginal, double precoComDesconto, String link, String descricao, Usuario usuario) {
		this.item = item;
		this.precoOriginal = precoOriginal;
		this.precoComDesconto = precoComDesconto;
		this.link = link;
		this.descricao = descricao;
		this.usuario = usuario;
		avaliacoes = new ArrayList<>();
		id = postsCriados;
		postsCriados += 1;
		
	}
	
	public void exibirInformacoes() {
		System.out.println("-------------------------------------------------------");
		item.exibirInformacoes();
		System.out.println();
	
		//System.out.println("Postado por " + usuario.getNome() + "\n");
		
		System.out.printf("Id: %d\nPorcentagem de Desconto: %.2f\nPreço original: %.2f\tPreço com desconto: %.2f\nLink: %s\tDescrição: %s\n", id, calcularPorcentagemDeDesconto(), precoOriginal, precoComDesconto, link, descricao);
		System.out.println();
		if(!avaliacoes.isEmpty()) {
			System.out.println("Avaliações do post:");
		}
		for(Avaliacao a : this.avaliacoes) {
			a.exibirInformacoesA();
		}
		if(!avaliacoes.isEmpty()) {
			System.out.println();
		}
		System.out.println("Postado por " + usuario.getNome() + "\n");
		//System.out.println("______________________________________________________________");
	}
	
	public double calcularPorcentagemDeDesconto() {
		return ((precoOriginal - precoComDesconto) / precoOriginal) * 100;
		
	}
	
	public int getId() {
		return id;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public Item getItem() {
		return item;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public List<Avaliacao> getAvaliacoes(){
		return avaliacoes;
	}
}
