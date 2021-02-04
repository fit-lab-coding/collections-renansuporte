package fit.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtils {

	public static List<String> sort(List<String> names, Comparator<String> comp) {
		Collections.sort(names, comp);
		return names;
	}

}
