package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
