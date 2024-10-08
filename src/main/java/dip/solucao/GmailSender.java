package dip.solucao;

public class GmailSender implements EmailSenderGateway {

    public void enviar(String email, String mensagem, String destino) {
        System.out.println("Enviando email...");
    }
}
