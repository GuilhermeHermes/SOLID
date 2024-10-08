package srp.problema;

public class Usuario {

    private String nome;
    private String email;
    private String senha;


    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void save() {
        System.out.println("Salvando usuario no banco de dados");
    }

    public void enviaEmailBoasVindas() {
        System.out.println("Enviando email de boas vindas");
    }

    public void enviaEmailPromocao() {
        System.out.println("Enviando email de promocao");
    }

    public void geraRelatorioSobreUsuarios() {
        System.out.println("Gerando relatorio sobre usuarios");
    }

}
