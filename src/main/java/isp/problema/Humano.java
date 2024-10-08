package isp.problema;

public class Humano implements Trabalho {
    @Override
    public void comecarATrabalhar() {
        System.out.println("Humano começou a trabalhar");
    }

    @Override
    public void almocar() {
        System.out.println("Humano almocou");
    }

    @Override
    public void carregarBateria() {
        System.out.println("");
    }

    @Override
    public void terminarTrabalho() {
        System.out.println("Humano terminou o trabalho");
    }
}
