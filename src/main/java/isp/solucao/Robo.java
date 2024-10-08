package isp.solucao;

import isp.solucao.Trabalho;

public class Robo implements Trabalho {

    @Override
    public void comecarATrabalhar() {
        System.out.println("Robo começou a trabalhar");
    }

    public void carregarBateria() {
        System.out.println("Robo carregou a bateria");
    }

    @Override
    public void terminarTrabalho() {
        System.out.println("Robo terminou o trabalho");
    }
}
