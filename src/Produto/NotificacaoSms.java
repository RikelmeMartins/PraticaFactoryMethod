package Produto;

public class NotificacaoSms implements Notificacao{
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[SMS] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}
