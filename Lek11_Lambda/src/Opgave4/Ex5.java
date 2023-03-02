package Opgave4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex5 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();

		// OBS: Throws exception.
			/*
		for (Runner runner : runners) {
			if (runner.getLapTime() > 40)
				runners.remove(runner);
		}
			*/

		//Opgave B
		Iterator<Runner> iterator = runners.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getLapTime() >= 40)
				iterator.remove();
		}
		System.out.println(runners);
		System.out.println();

		//Opgave D
		removeIf(runners, runner -> runner.getLapTime() >= 40);
		System.out.println(runners);
		System.out.println();

		//Opgave E
		runners.removeIf(runner -> runner.getLapTime() >= 40);
		System.out.println(runners);
	}

	/**
	 * Opgave C
	 * Removes runners that satisfies the given filter.
	 * Returns true, if any runner is removed.
	 */
	public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter) {
		Iterator<Runner> iterator = runners.iterator();
		while (iterator.hasNext()) {
			if (filter.test(iterator.next())) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
}