package Fabrica;

import Produto.Notificacao;
import Produto.NotificacaoPush;

public class PushFactory extends NotificacaoFactory{

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
