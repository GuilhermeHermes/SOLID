package srp.solucao;

import java.util.List;

public class GeradorDeRelatorio {

    public void gerarRelatorio(Usuario usuario){
        System.out.println("Gerando relatório para o usuário " + usuario.getNome());
    }

    public void gerarRelatorios(List<Usuario> usuarios){
        for(Usuario usuario : usuarios){
            gerarRelatorio(usuario);
        }
    }

}
