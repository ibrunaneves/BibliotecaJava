package biblioteca;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final LivroDAO livroDAO = new LivroDAO();

    public static void main(String[] args) {
        System.out.println("====== BIBLIOTECA DA BRU =====");
        while (true) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> inserirLivro();
                case 2 -> listarLivros();
                case 3 -> atualizarLivro();
                case 4 -> excluirLivro();
                case 5 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Adicionar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Atualizar livro");
        System.out.println("4 - Excluir livro");
        System.out.println("5 - SAIR");
    }

    private static void inserirLivro() {
        System.out.print("Digite o título: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Digite o ano de publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Livro livro = new Livro(titulo, autor, genero, ano);
        livroDAO.inserir(livro);
    }

    private static void listarLivros() {
        List<Livro> livros = livroDAO.listar();
        livros.forEach(livro -> System.out.println(livro.getId() + ": " + livro.getTitulo() + " - " + livro.getAutor()));
    }

    private static void atualizarLivro() {
        System.out.print("Digite o ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o novo título: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o novo autor: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o novo gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Digite o novo ano: ");
        int ano = scanner.nextInt();

        Livro livro = new Livro(id, titulo, autor, genero, ano);
        livroDAO.atualizar(livro);
    }

    private static void excluirLivro() {
        System.out.print("Digite o ID do livro: ");
        int id = scanner.nextInt();
        livroDAO.excluir(id);
    }
}
