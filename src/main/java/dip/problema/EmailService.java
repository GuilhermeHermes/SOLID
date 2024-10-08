package dip.problema;

public class EmailService {
    private final JavaMailSender enviadorDeEmail;

    public EmailService(JavaMailSender enviadorDeEmail) {
        this.enviadorDeEmail = enviadorDeEmail;
    }

    public void enviarEmail(String email, String mensagem, String destino) {
        enviadorDeEmail.enviar(email, mensagem, destino);
    }
//O problema desse código está na dependência na biblioteca JavaMailSender, imagine que a biblioteca seja descontinuada ou qualquer outro tipo de problema, precisáriamos reescrever toda a classe para trocar esta biblioteca, trocar para o Amazon SES, mailgun.
}
