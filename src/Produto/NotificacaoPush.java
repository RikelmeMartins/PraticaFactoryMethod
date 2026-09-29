package Produto;

public class NotificacaoPush implements Notificacao{
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[PUSH] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}
