package prac1;

public class Tarai {
		static int tak(int x, int y, int z) {
		if(x <= y)
			return z;
		else
			return tak(tak(x - 1, y, z), tak(y - 1, z, x), tak(z - 1, x, y));
	}

		public static void main(String[] args) {
			System.out.println(tak(22, 11, 0));
		}

}

