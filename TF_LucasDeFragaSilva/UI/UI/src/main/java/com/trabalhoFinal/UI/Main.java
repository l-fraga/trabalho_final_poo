package com.trabalhoFinal.UI;

import com.trabalhoFinal.Lista.GerenciadorDeExame;
import com.trabalhoFinal.Dados.GeraDados;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        GerenciadorDeExame gerenciadorDeExame = new GerenciadorDeExame();

        // Gerando e cadastrando 10 exames de sangue
        for (int i = 0; i < 10; i++) {
            gerenciadorDeExame.cadastrarExame(GeraDados.gerarExameSangueAleatorio());
        }

        // Gerando e cadastrando 10 exames bioquímicos
        for (int i = 0; i < 10; i++) {
            gerenciadorDeExame.cadastrarExame(GeraDados.gerarExameBioquimicoAleatorio());
        }

        App mainApp = new App(gerenciadorDeExame);
    }
}
