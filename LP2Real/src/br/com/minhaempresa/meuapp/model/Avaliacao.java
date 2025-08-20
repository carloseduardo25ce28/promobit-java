package br.com.minhaempresa.meuapp.model;

import br.com.minhaempresa.meuapp.service.*;

public class Avaliacao {
    private static int contador = 1;

    private String id;
    private Usuario usuarioRemetente;
    private Qualidade qualidade;
    private String comentario;
    private Post postAvaliado;

    public Avaliacao(Usuario usuarioRemetente, Qualidade qualidade, String comentario, Post postAvaliado) {
        this.id = "AV" + contador++;
        this.usuarioRemetente = usuarioRemetente;
        this.qualidade = qualidade;
        this.comentario = comentario;
        this.postAvaliado = postAvaliado;
    }

    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuarioRemetente;
    }

    public Qualidade getQualidade() {
        return qualidade;
    }

    public String getComentario() {
        return comentario;
    }

    public Post getPost() {
        return postAvaliado;
    }

    public void setRemetente(Usuario remetente) {
        this.usuarioRemetente = remetente;
    }

    public void setPost(Post postAvaliado) {
        this.postAvaliado = postAvaliado;
    }

    public void exibirInformacoesA() {
        System.out.println("Avaliação ID: " + id);
        System.out.println("Usuário remetente: " + usuarioRemetente.getNome());
        System.out.println("Qualidade: " + qualidade);
        System.out.println("Comentário: " + comentario);
        System.out.println("Post avaliado ID: " + postAvaliado.getId());
    }
}








