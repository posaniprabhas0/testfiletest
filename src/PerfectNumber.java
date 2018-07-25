
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j=28, sum = 0;
		for (i = 1; i < j; i++) {
			if (j % i == 0)
				sum = sum + i;
		}
		if (sum == j)
			System.out.println("perfect number");
		else

			System.out.println("not perfect number");

	}
}
