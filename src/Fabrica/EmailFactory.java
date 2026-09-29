package Fabrica;

import Produto.Notificacao;
import Produto.NotificacaoEmail;

public class EmailFactory extends NotificacaoFactory {

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
