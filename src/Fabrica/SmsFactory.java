package Fabrica;

import Produto.Notificacao;
import Produto.NotificacaoSms;

public class SmsFactory extends NotificacaoFactory{

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoSms();
    }
}
