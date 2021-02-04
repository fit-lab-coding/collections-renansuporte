package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {

	public static Map<String, Boolean> random(int numeroPessoas, int percentualPessoasPresente) {

		Map<String, Boolean> map = new HashMap<>();
		
		int bool = numeroPessoas * percentualPessoasPresente / 100;
		for(int i = 0; i < numeroPessoas; i++) {
			map.put("test "+i, i < bool ? true: false);
		}
		return map;
	}

}
