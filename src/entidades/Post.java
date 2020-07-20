package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Post {
    private String autor;
    private String titulo;
    private String conteudo;
    private Date data = new Date();
    private SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Integer numeroDeLikes = 0;
    private List<Comentario> comentarios = new ArrayList<>();

    public Post(String autor, String titulo, String conteudo) {
        this.autor = autor;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public void adicionarComentarios(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public String getAutor() {
        return autor;
    }

    public Date getData() {
        return data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void editarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void editarConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Título: " + titulo);
        stringBuilder.append("\nData: " + dataFormatada.format(data));
        stringBuilder.append("\nNúmero de likes: " + numeroDeLikes);
        stringBuilder.append("\nConteúdo: " + conteudo);
        stringBuilder.append("\n\n*Comentários");
        for (Comentario comentario : comentarios) {
            stringBuilder.append("\n\n");
            stringBuilder.append(dataFormatada.format(data) + " "+comentario.getAutor() + " comentou: " + comentario.getConteudo());
        }
        return stringBuilder.toString();
    }

    public Integer getNumeroDeLikes() {
        return numeroDeLikes;
    }

    public void atualizarNumeroDeLikes(Integer numeroDeLikes) {
        this.numeroDeLikes = numeroDeLikes;
    }

    public List<Comentario> getComentarios() {
        return Collections.unmodifiableList(comentarios);
    }
}