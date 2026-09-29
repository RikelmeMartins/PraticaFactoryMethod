package Fabrica;
import Produto.Notificacao;

public abstract class NotificacaoFactory {
    protected abstract Notificacao criarNotificacao();

    public void notificar(String destinatario, String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(destinatario, mensagem);
    }
}
