package Opgave3;

import java.util.ArrayList;

public class FletteSorteringHul {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private void merge1(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> temp1 = new ArrayList<>();
		ArrayList<Integer> temp2 = new ArrayList<>();

		int n1 = middle - low + 1;
		int n2 = high - middle;

		for (int i = 0; i < n1; i++)
			temp1.add(list.get(low+i));
		for (int j = 0; j < n2; j++)
			temp2.add(list.get(middle+1+j));

		int i = 0;
		int j = 0;
		int k = low;
		while (i < n1 && j < n2) {
			if (temp1.get(i) <= temp2.get(j)) {
				list.set(k,temp1.get(i));
				i++;
			} else {
				list.set(k,temp2.get(j));
				j++;
			}
			k++;
		}

		while (i < n1) {
			list.set(k,temp1.get(i));
			i++;
			k++;
		}

		while (j < n2) {
			list.set(k,temp2.get(j));
			j++;
			k++;
		}
	}
	private void merge(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> temp1 = new ArrayList<>();
		int j = middle+1;
		int i = low;

		while (i <= middle && high >= j) {
			if (list.get(i) <= list.get(j)) {
				temp1.add(list.get(i));
				i++;
			} else {
				temp1.add(list.get(j));
				j++;
			}
		}

		while (i <= middle) {
			temp1.add(list.get(i));
			i++;
		}
		while (high >= j) {
			temp1.add(list.get(j));
			j++;
		}

		for (int ij = 0; ij < temp1.size(); ij++) {
			list.set(low+ij, temp1.get(ij));
		}
	}
	}
