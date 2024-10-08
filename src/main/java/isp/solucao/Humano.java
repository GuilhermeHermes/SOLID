package isp.solucao;

public class Humano implements Trabalho {
    @Override
    public void comecarATrabalhar() {
        System.out.println("Começando a trabalhar");
    }

    public void almocar(){
        System.out.println("Humano almoçando");
    }

    @Override
    public void terminarTrabalho() {
        System.out.println("Terminando o trabalho");
    }
}
