import java.util.ArrayList;
import java.util.List;

public class NotificacaoController {
    private final NotificacaoFactory notificacaoFactory;
    private final List<Notificacao> notificacoes;

    public NotificacaoController() {
        this.notificacaoFactory = NotificacaoFactory.getInstance();
        this.notificacoes = new ArrayList<>();
    }

    public void criarNotificacao(int tipo, String mensagem) {
        Notificacao nova = notificacaoFactory.obterFormaNotificacao(tipo, mensagem);
        notificacoes.add(nova);
    }

    public void listarNotificacoes() {
        if (notificacoes.isEmpty()) {
            System.out.println("Nenhuma notificacao cadastrada.");
            return;
        }

        int i = 1;
        for (Notificacao n : notificacoes) {
            System.out.println("[" + i + "] " + n.getClass().getSimpleName() + " - Mensagem: " + n.getMensagem());
            i++;
        }
    }

    public void atualizarNotificacao(int indice, String novaMensagem) {
        if (indice >= 0 && indice < notificacoes.size()) {
            notificacoes.get(indice).setMensagem(novaMensagem);
            System.out.println("Notificacao atualizada.");
        } else {
            System.out.println("Indice invalido.");
        }
    }

    public void removerNotificacao(int indice) {
        if (indice >= 0 && indice < notificacoes.size()) {
            notificacoes.remove(indice);
            System.out.println("Notificacao removida.");
        } else {
            System.out.println("Indice invalido.");
        }
    }

    public void enviarNotificacao(int tipo, String mensagem) {
        try {
            Notificacao notificacao = notificacaoFactory.obterFormaNotificacao(tipo, mensagem);
            notificacao.autorizar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao enviar notificacao: " + e.getMessage());
        }
    }

}