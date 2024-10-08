package srp.solucao;

public class Notificador {

    public void enviarEmail(Usuario usuario){
        System.out.println("Enviando email para o usuário " + usuario.getEmail());
    }

    public void enviarPromocao(Usuario usuario){
        System.out.println("Enviando email de promoção para o usuário " + usuario.getEmail());
    }
}
