/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabalhoFinal.Dados;

/**
 *
 * @author lucas
 */
import com.trabalhoFinal.Dominio.ExameSangue;
import com.trabalhoFinal.Dominio.ExameBioquimico;
import java.util.*;

public class GeraDados {
    private static Random random = new Random();

    public static ExameSangue gerarExameSangueAleatorio() {
        String id = "S" + random.nextInt(10000);
        Date data = new Date();
        String nomePaciente = "Paciente S" + id;
        String cpf = gerarCpfAleatorio();
        double hemoglobina = 10 + random.nextDouble() * 5;
        double leucocitos = 4 + random.nextDouble() * 3;
        double plaquetas = 150 + random.nextDouble() * 100;

        return new ExameSangue(id, data, nomePaciente, cpf, hemoglobina, leucocitos, plaquetas);
    }

    public static ExameBioquimico gerarExameBioquimicoAleatorio() {
        String id = "B" + random.nextInt(10000);
        Date data = new Date();
        String nomePaciente = "Paciente B" + id;
        String cpf = gerarCpfAleatorio();
        String resultado = "Resultado " + (random.nextBoolean() ? "Positivo" : "Negativo");
        double glicose = 70 + random.nextDouble() * 30;
        double colesterol = 100 + random.nextDouble() * 50;
        double triglicerideos = 100 + random.nextDouble() * 50;

        return new ExameBioquimico(id, data, nomePaciente, cpf, glicose, colesterol, triglicerideos);
    }

    private static String gerarCpfAleatorio() {
        return String.format("%03d.%03d.%03d-00", random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
    }
    
    /*
    public static List<ExameSangue> gerarExamesSangue(int quantidade) {
        List<ExameSangue> examesSangue = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            examesSangue.add(gerarExameSangueAleatorio());
        }
        return examesSangue;
    }

    public static List<ExameBioquimico> gerarExamesBioquimicos(int quantidade) {
        List<ExameBioquimico> examesBioquimicos = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            examesBioquimicos.add(gerarExameBioquimicoAleatorio());
        }
        return examesBioquimicos;
    }
    */
}

