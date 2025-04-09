public class NotificacaoFactory {
    private static NotificacaoFactory instancia;

    private NotificacaoFactory() {
    }

    public static NotificacaoFactory getInstance() {
        if (instancia == null) {
            instancia = new NotificacaoFactory();
        }
        return instancia;
    }

    public Notificacao obterFormaNotificacao(int tipo, String mensagem) {
        switch (tipo) {
            case 1:
                return new NotificacaoSMS(mensagem);
            case 2:
                return new NotificacaoEmail(mensagem);
            default:
                throw new IllegalArgumentException("Tipo de notificacao invalido");
        }
    }
}