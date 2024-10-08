package isp.problema;

public class Robo implements Trabalho{

    @Override
    public void comecarATrabalhar() {
        System.out.println("Robo começou a trabalhar");
    }

    @Override
    public void almocar() {
        System.out.println("");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Robo carregou a bateria");
    }

    @Override
    public void terminarTrabalho() {
        System.out.println("Robo terminou o trabalho");
    }
}
