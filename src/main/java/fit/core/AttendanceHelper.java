package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {

	public static Map<String, Boolean> random(int numeroPessoas, int percentualPessoasPresente) {

		Map<String, Boolean> map = new HashMap<>();
		
		int resultado = calculatePercentual(numeroPessoas, percentualPessoasPresente);
		for(int i = 0; i < numeroPessoas; i++) {
			map.put("test "+i, i < resultado);
		}
		return map;
	}

	private static int calculatePercentual(int numeroPessoas, int percentualPessoasPresente) {
		return numeroPessoas * percentualPessoasPresente / 100;
	}

}
