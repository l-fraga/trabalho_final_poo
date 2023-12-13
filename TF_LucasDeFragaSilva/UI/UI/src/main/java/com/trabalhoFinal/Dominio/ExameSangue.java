package com.trabalhoFinal.Dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExameSangue extends Exame {

    private double hemoglobina;

    private double leucocitos;

    private double plaquetas;

    public ExameSangue(String id, Date data, String nomePaciente, String cpfPaciente,
            double hemoglobina, double leucocitos, double plaquetas) {
        super(id, data, nomePaciente, cpfPaciente);
        this.hemoglobina = hemoglobina;
        this.leucocitos = leucocitos;
        this.plaquetas = plaquetas;
    }

    public double getHemoglobina() {
        return hemoglobina;
    }

    public double getLeucocitos() {
        return leucocitos;
    }

    public double getPlaquetas() {
        return plaquetas;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "ID: " + getId() + "\n"
                + " Data: " + dateFormat.format(getData())
                + " Nome: " + getNomePaciente() + "\n"
                + " CPF: " + getCpfPaciente() + "\n"
                + " Hemoglobina: " + hemoglobina + "\n"
                + " Leucócitos: " + leucocitos + "\n"
                + " Plaquetas: " + plaquetas;
    }

}
