package task2;

public class Pyramid {
	public static void drawPyramid(int n) {
		int k = 0;
		for (int i = 1; i <= n; ++i, k=0) {
			for (int j = 1; j <= n -i; ++j) {
				System.out.print(" ");
			}
			while (k != 2 * i -1 ) {
				System.out.print("X");
				++k;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n =4;
		drawPyramid(n);
	}
}
