package com;

public class MainApp {

	private static int[] flatArray(int[][][] a) {
		int[] result = new int[a.length * a[0].length * a[0][0].length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int p = 0; p < a[i][j].length; p++) {
					result[index] = a[i][j][p];
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][][] a = { { { 2 } }, { { 3 } }, { { 3 }, { 4 } }, { { 67, 5, 3 }, { 6, 8, 3 } } };

		int[] result = flatArray(a);

		System.out.print("[");
		for (int i = 0; i < result.length - 1; i++) {
			System.out.print(result[i]);
			System.out.print(",");
		}
		System.out.print(result[result.length - 1]);
		System.out.print("]");
	}
}
