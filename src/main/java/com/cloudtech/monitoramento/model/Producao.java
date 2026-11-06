package com.cloudtech.monitoramento.model;

public class Producao {

    private Long machineId;
    private double consumoKw;
    private String horarioAtivacao;
    private int pecasProduzidas;

    public Producao() {
    }

    public Producao(Long machineId, double consumoKw,
                    String horarioAtivacao, int pecasProduzidas) {
        this.machineId = machineId;
        this.consumoKw = consumoKw;
        this.horarioAtivacao = horarioAtivacao;
        this.pecasProduzidas = pecasProduzidas;
    }

    public Long getMachineId() {
        return machineId;
    }

    public void setMachineId(Long machineId) {
        this.machineId = machineId;
    }

    public double getConsumoKw() {
        return consumoKw;
    }

    public void setConsumoKw(double consumoKw) {
        this.consumoKw = consumoKw;
    }

    public String getHorarioAtivacao() {
        return horarioAtivacao;
    }

    public void setHorarioAtivacao(String horarioAtivacao) {
        this.horarioAtivacao = horarioAtivacao;
    }

    public int getPecasProduzidas() {
        return pecasProduzidas;
    }

    public void setPecasProduzidas(int pecasProduzidas) {
        this.pecasProduzidas = pecasProduzidas;
    }
}
