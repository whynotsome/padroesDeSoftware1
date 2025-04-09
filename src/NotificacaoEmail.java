public class NotificacaoEmail extends Notificacao {

        public NotificacaoEmail(String mensagem) {
            super(mensagem);
        }

        @Override
        public void autorizar() {
            System.out.println("Notificacao enviada para Email, mensagem: " +  mensagem);
        }

}
