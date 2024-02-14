package JavaBasics;

public class countChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int upper = 0;
		int lower = 0;
		int number = 0;
		int special = 0;

		String v = "yGHYUYJuiwd1223&^%*&123";

		for (int i = 0; i < v.length(); i++) {

			if (v.charAt(i) >= 'a' && v.charAt(i) <= 'z') {
				lower++;
			} else if (v.charAt(i) >= 'A' && v.charAt(i) <= 'Z') {
				upper++;
			} else if (v.charAt(i) >= '0' && v.charAt(i) <= '9') {
				number++;
			}

			else {
				special++;
			}

		}
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(number);
		System.out.println(special);
	}
}
