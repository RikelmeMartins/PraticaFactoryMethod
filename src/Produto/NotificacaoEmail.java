package Produto;

public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[EMAIL] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}
