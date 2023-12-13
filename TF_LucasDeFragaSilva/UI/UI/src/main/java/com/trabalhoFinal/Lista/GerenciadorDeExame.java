package com.trabalhoFinal.Lista;

import com.trabalhoFinal.Calculo.CalculaEstatistica;
import com.trabalhoFinal.Dominio.Exame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeExame {

    private List<Exame> exames;

    public GerenciadorDeExame() {
        this.exames = new ArrayList<>();
    }

    public List<Exame> visualizarExames() {
        return Collections.unmodifiableList(exames);
    }

    public Exame procurarExame(String id) {
        for (Exame exame : exames) {
            if (exame.getId().equalsIgnoreCase(id)) {
                return exame;
            }
        }
        return null;
    }

    public void cadastrarExame(Exame exame) {
        exames.add(exame);
    }

    public void exibirEstatisticas() {

        int totalExames = CalculaEstatistica.calcularTotalExames(this.exames);
        int totalExamesSangue = CalculaEstatistica.calcularTotalExamesSangue(this.exames);
        int totalExamesBioquimicos = CalculaEstatistica.calcularTotalExamesBioquimicos(this.exames);
        double somaLeucocitos = CalculaEstatistica.calcularSomaLeucocitos(this.exames);
        double mediaGlicose = CalculaEstatistica.calcularMediaGlicose(this.exames);

        System.out.println("Estatísticas dos Exames:");
        System.out.println("Total de Exames: " + totalExames);
        System.out.println("Total de Exames de Sangue: " + totalExamesSangue);
        System.out.println("Total de Exames Bioquímicos: " + totalExamesBioquimicos);
        System.out.println("Soma dos Leucócitos nos Exames de Sangue: " + somaLeucocitos);
        System.out.println("Média de Glicose nos Exames Bioquímicos: " + mediaGlicose);
    }

    public boolean editarExame(String id, Exame dadosAtualizados) {

        for (int i = 0; i < exames.size(); i++) {
            if (exames.get(i).getId().equalsIgnoreCase(id)) {
                exames.set(i, dadosAtualizados);
                return true;
            }
        }
        return false;
    }

}
