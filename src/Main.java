import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotificacaoController controller = new NotificacaoController();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Criar Notificacao");
            System.out.println("2. Listar Notificacoes");
            System.out.println("3. Atualizar Notificacao");
            System.out.println("4. Remover Notificacao");
            System.out.println("5. Enviar Notificacao (sem salvar)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Tipo (1 = SMS, 2 = Email): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Mensagem: ");
                    String mensagem = scanner.nextLine();
                    controller.criarNotificacao(tipo, mensagem);
                }

                case 2 -> controller.listarNotificacoes();

                case 3 -> {
                    controller.listarNotificacoes();
                    System.out.print("Indice da notificacao para atualizar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nova mensagem: ");
                    String novaMensagem = scanner.nextLine();
                    controller.atualizarNotificacao(indice, novaMensagem);
                }

                case 4 -> {
                    controller.listarNotificacoes();
                    System.out.print("Indice da notificacao para remover: ");
                    int indice = scanner.nextInt() - 1;
                    controller.removerNotificacao(indice);
                }

                case 5 -> {
                    System.out.print("Tipo (1 = SMS, 2 = Email): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Mensagem: ");
                    String mensagem = scanner.nextLine();
                    controller.enviarNotificacao(tipo, mensagem);
                }

                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}