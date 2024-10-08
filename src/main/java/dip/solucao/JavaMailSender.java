package dip.solucao;

public class JavaMailSender implements EmailSenderGateway{

    public void enviar(String email, String mensagem, String destino) {
        System.out.println("Enviando email...");
    }
}
