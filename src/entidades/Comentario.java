package entidades;

import java.util.Date;

public class Comentario {
    private String autor;
    private String conteudo;
    private Date data = new Date();

    public Comentario(String autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getData() {
        return data;
    }
}
