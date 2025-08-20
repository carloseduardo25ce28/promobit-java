package br.com.minhaempresa.meuapp.model;

public class Item implements IntefaceExibirInformacoes{
   
    private String nome;
    private int id;
    private String descricao;
    private static int itensCriados = 1;
    private Categoria categoria;

    public Item(String nome, String descricao, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        id = itensCriados;
        itensCriados += 1;
    }

   
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println(categoria.toString());;
        //System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
    }
    
    public String getNome() {
    	return nome;
    }
    
    public Categoria getCategoria() {
    	return categoria;
    }
    
    public int getId() {
    	return id;
    }
}
