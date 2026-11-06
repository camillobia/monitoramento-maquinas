package com.cloudtech.monitoramento.model;

public class Maquina {

    private Long id;
    private String identificacao;
    private String tipo;
    private String setor;
    private String status;

    public Maquina() {
    }

    public Maquina(Long id, String identificacao, String tipo, String setor, String status) {
        this.id = id;
        this.identificacao = identificacao;
        this.tipo = tipo;
        this.setor = setor;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}