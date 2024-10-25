import java.util.Scanner;

public class Main {
    private static Biblioteca ufra_biblio = new Biblioteca();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Incluir Livro");
            System.out.println("2. Excluir Livro");
            System.out.println("3. Alterar Livro");
            System.out.println("4. Listar Livros");
            System.out.println("5. Detalhes de um Livro");
            System.out.println("6. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    incluirLivro();
                    break;
                case 2:
                    excluirLivro();
                    break;
                case 3:
                    alterarLivro();
                    break;
                case 4:
                    listarLivros();
                    break;
                case 5:
                    detalhesLivro();
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);
        scanner.close();
    }

    private static void incluirLivro() {
        System.out.print("Digite um Código novo (numérico): ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        if (ufra_biblio.livroExiste(codigo)) {
            System.out.println("Infelizmente já existe um livro cadastrado nesse código!");
            ufra_biblio.pegarDadosDeUmLivro(codigo);
        } else {
            System.out.print("Código disponível. Adicione detalhes do livro.\nDigite o título do livro: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite o nome do autor do livro: ");
            String autor = scanner.nextLine();
            System.out.print("Digite o ano de publicação do livro: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            ufra_biblio.adicionarLivro(codigo, new Livro(titulo, autor, ano));
            System.out.println("Livro adicionado com sucesso.");
        }
    }

    private static void excluirLivro() {
        System.out.print("Digite Código do livro (numérico): ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        if (ufra_biblio.livroExiste(codigo)) {
            ufra_biblio.excluirLivro(codigo);
            System.out.println("Livro excluído com sucesso.");
        } else {
            System.out.println("Livro não encontrado.");
        }
        
    }

    private static void alterarLivro() {
        String titulo;
        String autor;
        int ano;
        Integer codigo;
        System.out.print("Digite o código do livro: ");
        codigo = scanner.nextInt();
        scanner.nextLine();

        if (ufra_biblio.livroExiste(codigo)) {
            System.out.println("O que você deseja alterar?");
            System.out.println("[1] - Título -> " + ufra_biblio.pegarDadosDeUmLivro(codigo).getNome());
            System.out.println("[2] - Autor -> " + ufra_biblio.pegarDadosDeUmLivro(codigo).getAutor());
            System.out.println("[3] - Publicação -> " + ufra_biblio.pegarDadosDeUmLivro(codigo).getPublicacao());
            System.out.println("[4] - Tudo");
        } else {
            System.out.println("Livro não encontrado.");
        }
        int opt = scanner.nextInt();
        scanner.nextLine();
        switch (opt) {
                case 1:
                    System.out.println("Digite o novo Título:");
                    titulo = scanner.nextLine();
                    scanner.nextLine();
                    autor = (ufra_biblio.pegarDadosDeUmLivro(codigo)).getAutor();
                    ano = (ufra_biblio.pegarDadosDeUmLivro(codigo)).getPublicacao();
                    ufra_biblio.alterarLivro(codigo, new Livro(titulo, autor, ano));
                    System.out.println("Livro alterado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o novo nome do Autor:");
                    autor = scanner.nextLine();
                    scanner.nextLine();
                    titulo = (ufra_biblio.pegarDadosDeUmLivro(codigo)).getNome();
                    ano = (ufra_biblio.pegarDadosDeUmLivro(codigo)).getPublicacao();
                    ufra_biblio.alterarLivro(codigo, new Livro(titulo, autor, ano));
                    System.out.println("Livro alterado com sucesso.");
                    break;
                case 3:
                    System.out.println("Digite o novo ano de publicação");
                    ano = scanner.nextInt();
                    scanner.nextLine();
                    titulo = (ufra_biblio.pegarDadosDeUmLivro(codigo)).getNome();
                    autor = (ufra_biblio.pegarDadosDeUmLivro(codigo)).getAutor();
                    ufra_biblio.alterarLivro(codigo, new Livro(titulo, autor, ano));
                    System.out.println("Livro alterado com sucesso.");
                    break;
                case 4:
                    System.out.print("Digite o novo título do livro: ");
                    titulo = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Digite o novo nome do autor do livro: ");
                    autor = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Digite o novo ano de publicação do livro: ");
                    ano = scanner.nextInt();
                    scanner.nextLine();
                    ufra_biblio.alterarLivro(codigo, new Livro(titulo, autor, ano));
                    System.out.println("Livro alterado com sucesso.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
    }

    private static void listarLivros() {
        ufra_biblio.listarLivros();
    }

    private static void detalhesLivro() {
        System.out.print("Digite Código do livro (numérico): ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        if (ufra_biblio.livroExiste(codigo)) {
            System.out.println(ufra_biblio.pegarDadosDeUmLivro(codigo));
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
