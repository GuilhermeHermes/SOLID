package srp.problema;

public class sistema {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Fulano", "email.com", "123");
        usuario.save();
        usuario.enviaEmailBoasVindas();
        usuario.enviaEmailPromocao();
        usuario.geraRelatorioSobreUsuarios();
    // Toda a lógica de negócio está concentrada na classe Usuario, o que viola o princípio SRP
    }
}
