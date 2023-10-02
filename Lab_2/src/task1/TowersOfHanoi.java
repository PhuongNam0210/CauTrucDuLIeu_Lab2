package task1;

public class TowersOfHanoi {
	public static void moveTower(int disk, char source, char dest, char space) {
		if (disk==1) {
			System.out.println("Move disk 1 from source " + source + " to dest " + dest);
			return;
		}
		moveTower(disk-1, source, dest, space);
		System.out.println("Move disk " + disk + " from source " + source + " to dest " + dest);
		moveTower(disk-1, space, dest, source);
	}
	public static void main(String[] args) {
		int disk = 3;
		moveTower(disk, 'A', 'B', 'C');
	}
}
