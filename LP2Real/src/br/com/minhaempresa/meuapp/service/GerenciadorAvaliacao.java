package br.com.minhaempresa.meuapp.service;

import java.util.ArrayList;
import java.util.List;

import br.com.minhaempresa.meuapp.model.Avaliacao;
import br.com.minhaempresa.meuapp.model.Usuario;
import br.com.minhaempresa.meuapp.model.UsuarioAdministrador;
import br.com.minhaempresa.meuapp.model.UsuarioComum;


public class GerenciadorAvaliacao {
    private List<Avaliacao> todasAvaliacoes;

    public GerenciadorAvaliacao() {
        todasAvaliacoes = new ArrayList<>();
    }

    public boolean adicionarAvaliacao(Avaliacao avaliacao1) {
        if (avaliacao1 == null || todasAvaliacoes.contains(avaliacao1)) return false;

        Usuario remetente = avaliacao1.getUsuario();
        if (remetente instanceof UsuarioComum) {
            ((UsuarioComum) remetente).userAdicionarAvaliacao(avaliacao1);
        }
        
        avaliacao1.getPost().getAvaliacoes().add(avaliacao1);
        todasAvaliacoes.add(avaliacao1);
        return true;
    }

    public boolean removerAvaliacao(String idAvaliacao, Usuario solicitante) {
        Avaliacao alvo = buscarAvaliacao(idAvaliacao);
        if (alvo == null || solicitante == null) return false;

        Usuario autor = alvo.getUsuario();

        if (solicitante instanceof UsuarioComum) {
            if (autor.equals(solicitante)) {
                ((UsuarioComum) solicitante).userRemoverAvaliacao(alvo);
                todasAvaliacoes.remove(alvo);
                return true;
            }
        } else if (solicitante instanceof UsuarioAdministrador) {
            if (autor instanceof UsuarioComum) {
                ((UsuarioComum) autor).userRemoverAvaliacao(alvo);
            }
            ((UsuarioAdministrador) solicitante).userRegistrarAvaliacaoRemovida(alvo);
            todasAvaliacoes.remove(alvo);
            return true;
        }

        return false;
    }

    public void removerTodasAvaliacoes(Usuario usuario) {
        if (usuario == null) return;

        List<Avaliacao> paraRemover = new ArrayList<>();
        for (Avaliacao a : todasAvaliacoes) {
            if (a.getUsuario().equals(usuario)) {
                paraRemover.add(a);
            }
        }

        for (Avaliacao a : paraRemover) {
            if (usuario instanceof UsuarioComum) {
                ((UsuarioComum) usuario).userRemoverAvaliacao(a);
            }
            todasAvaliacoes.remove(a);
        }
    }

    public Avaliacao buscarAvaliacao(String id) {
        for (Avaliacao a : todasAvaliacoes) {
            if (a.getId().equals(id)) return a;
        }
        return null;
    }

    public List<Avaliacao> listarTodas() {
        return new ArrayList<>(todasAvaliacoes);
    }
}
