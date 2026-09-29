import Fabrica.EmailFactory;
import Fabrica.NotificacaoFactory;
import Fabrica.PushFactory;
import Fabrica.SmsFactory;

public class Main {
    public static void main(String[] args) {
        NotificacaoFactory email = new EmailFactory();
        NotificacaoFactory sms = new SmsFactory();
        NotificacaoFactory push = new PushFactory();

        email.notificar("rikelme@email.com", "Seu pedido foi confirmado!");
        sms.notificar("+55 11 99999-0000", "Seu código é 123456");
        push.notificar("device-abc-123", "Você tem uma nova mensagem");
    }
}