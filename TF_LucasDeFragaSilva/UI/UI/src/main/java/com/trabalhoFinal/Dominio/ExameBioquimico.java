package com.trabalhoFinal.Dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExameBioquimico extends Exame {

    private double glicose;

    private double colesterol;

    private double triglicerideos;

    public ExameBioquimico(String id, Date data, String nomePaciente, String cpfPaciente,
            double glicose, double colesterol, double triglicerideos) {
        super(id, data, nomePaciente, cpfPaciente);
        this.glicose = glicose;
        this.colesterol = colesterol;
        this.triglicerideos = triglicerideos;
    }

    public double getGlicose() {
        return glicose;
    }

    public double getColesterol() {
        return colesterol;
    }

    public double getTriglicerideos() {
        return triglicerideos;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "ID: " + getId() + "\n"
                + " Data: " + dateFormat.format(getData()) + "\n"
                + " Nome: " + getNomePaciente() + "\n"
                + " CPF: " + getCpfPaciente() + "\n"
                + " Glicose: " + glicose + "\n"
                + " Colesterol: " + colesterol + "\n"
                + " Triglicerídeos: " + triglicerideos;
    }

}
