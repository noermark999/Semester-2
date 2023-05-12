package setoperationsopgave;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
		Set<T> result = new HashSet<>();
		result.addAll(s1);
		result.addAll(s2);
		return result;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		Set<T> result = new HashSet<>();
		for (T element : s1) {
			if (!s2.contains(element)) {
				result.add(element);
			}
		}
		for (T element : s2) {
			if (!s1.contains(element)) {
				result.add(element);
			}
		}
		return result;

	}

	public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
		Set<T> result = new HashSet<>();
		for (T element : s1) {
			if (s2.contains(element)) {
				result.add(element);
			}
		}
		for (T element : s2) {
			if (s1.contains(element)) {
				result.add(element);
			}
		}
		return result;

	}

}
