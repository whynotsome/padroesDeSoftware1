public class Main {
    public static void main(String[] args) {

        NotificacaoController controller = new NotificacaoController();

        controller.criarNotificacao(1, "Mensagem de teste SMS");
        controller.criarNotificacao(2, "Mensagem de teste Email");

        controller.listarNotificacoes();

        controller.atualizarNotificacao(1, "Nova mensagem SMS atualizada");

        controller.removerNotificacao(0);

        controller.listarNotificacoes();

    }
}