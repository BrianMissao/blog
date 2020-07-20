package aplicacao;

import entidades.Comentario;
import entidades.Post;

import java.util.Scanner;

public class Blog {
    private static Post post;
    private static Comentario comentario;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        criarUmPost();
        fazerUmComentario();
        System.out.println(post);
    }

    private static void fazerUmComentario() {
        String autor = obterDados("Qual o seu nome?");
        String conteudo = obterDados("Agora sim, digite o conteúdo do seu comentário:");
        comentario = new Comentario(autor, conteudo);
        post.adicionarComentarios(comentario);
    }

    private static void criarUmPost() {
        String autor = obterDados("Autor do post:");
        String titulo = obterDados("Título: ");
        String conteudo = obterDados("Conteúdo: ");
        post = new Post(autor, titulo, conteudo);
    }

    private static String obterDados(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextLine();
    }
}
