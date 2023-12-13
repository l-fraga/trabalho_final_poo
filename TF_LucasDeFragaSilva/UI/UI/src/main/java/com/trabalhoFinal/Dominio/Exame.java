package com.trabalhoFinal.Dominio;

import java.util.Date;

public abstract class Exame {

    private String id;

    private Date data;

    private String nomePaciente;

    private String cpfPaciente;

    public Exame(String id, Date data, String nomePaciente, String cpfPaciente) {
        this.id = id;
        this.data = data;
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;

    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpfPaciente() {
        return this.cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    @Override
    public String toString() {
        return "Exame{"
                + "id='" + id + '\''
                + ", data=" + data
                + ", nomePaciente='" + nomePaciente + '\''
                + ", cpfPaciente='" + cpfPaciente + '\''
                + '}';
    }

}
