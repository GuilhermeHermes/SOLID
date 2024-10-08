package dip.solucao;


public class EmailService {

    private EmailSenderGateway enviadorDeEmail;

    public EmailService(EmailSenderGateway enviadorDeEmail) {
        this.enviadorDeEmail = enviadorDeEmail;
    }

    public void enviarEmail(String email, String mensagem, String destino) {
        enviadorDeEmail.enviar(email, mensagem, destino);
    }
    //AGORA NOSSO SERVICE PODE RECEBER QUALQUER IMPLEMENTAÇÃO DE ENVIADOR DE EMAIL, NÃO DEPENDENDO DE CLASSE NENHUMA.
}
