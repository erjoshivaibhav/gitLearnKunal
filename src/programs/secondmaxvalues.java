package programs;

import java.util.Arrays;

public class secondmaxvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 45, 50, 35 };
		int temp;
		// find 2nd max value
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] <= a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(a));
	}
}
