package dip.solucao;

public interface EmailSenderGateway {
    void enviar(String email, String mensagem, String destino);
}
