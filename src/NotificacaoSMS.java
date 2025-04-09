public class NotificacaoSMS extends Notificacao {

    public NotificacaoSMS(String mensagem) {
        super(mensagem);
    }

    @Override
    public void autorizar() {
        System.out.println("Notificacao enviada para SMS, mensagem: " +  mensagem);
    }

}
