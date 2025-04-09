public abstract class Notificacao {
    protected String mensagem;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public abstract void autorizar();
}