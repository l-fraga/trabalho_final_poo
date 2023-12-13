package com.trabalhoFinal.Calculo;

import java.util.List;

import com.trabalhoFinal.Dominio.Exame;
import com.trabalhoFinal.Dominio.ExameBioquimico;
import com.trabalhoFinal.Dominio.ExameSangue;

public class CalculaEstatistica {

	public static int calcularTotalExames(List<Exame> exames) {
		return exames.size();
	}

	public static int calcularTotalExamesSangue(List<Exame> exames) {
		return (int) exames.stream()
				.filter(exame -> exame instanceof ExameSangue)
				.count();
	}

	public static int calcularTotalExamesBioquimicos(List<Exame> exames) {
		return (int) exames.stream()
				.filter(exame -> exame instanceof ExameBioquimico)
				.count();
	}

	public static double calcularSomaLeucocitos(List<Exame> exames) {
		return exames.stream()
				.filter(exame -> exame instanceof ExameSangue)
				.mapToDouble(exame -> ((ExameSangue) exame).getLeucocitos())
				.sum();
	}

	public static double calcularMediaGlicose(List<Exame> exames) {
		return exames.stream()
				.filter(exame -> exame instanceof ExameBioquimico)
				.mapToDouble(exame -> ((ExameBioquimico) exame).getGlicose())
				.average()
				.orElse(0.0); // Retorna 0.0 se não houver exames bioquímicos
	}

}
