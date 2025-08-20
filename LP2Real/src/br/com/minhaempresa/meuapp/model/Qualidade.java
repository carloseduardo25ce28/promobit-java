package br.com.minhaempresa.meuapp.model;

public enum Qualidade {
    MUITO_RUIM(1, "Muito ruim"),
    RUIM(2, "Ruim"),
    MEDIO(3, "Médio"),
    BOM(4, "Bom"),
    MUITO_BOM(5, "Muito bom");

    private int nota;
    private String descricao;

    private Qualidade(int nota, String descricao) {
        this.nota = nota;
        this.descricao = descricao;
    }

    public int getNota() {
        return nota;
    } 

    @Override
    public String toString() {
        return descricao;
    }
    
}
