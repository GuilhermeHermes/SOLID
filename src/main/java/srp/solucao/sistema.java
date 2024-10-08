package srp.solucao;

import java.util.Arrays;

public class sistema {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Fulano", "email.com", "123");
        Database database = new Database();
        database.save(usuario);
        Notificador notificador = new Notificador();
        notificador.enviarEmail(usuario);
        notificador.enviarPromocao(usuario);
        GeradorDeRelatorio geradorDeRelatorio = new GeradorDeRelatorio();
        geradorDeRelatorio.gerarRelatorio(usuario);
        Usuario usuario2 = new Usuario("Ciclano", "email2.com", "123");
        geradorDeRelatorio.gerarRelatorios(Arrays.asList(usuario, usuario2));
        ;

    }
}
