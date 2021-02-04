package fit.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtils {

	public static <T> List<T> sort(List<T> names, Comparator<T> comp) {
		Collections.sort(names, comp);
		return names;
	}

}
