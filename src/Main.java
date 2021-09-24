import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double R, Volume;
		
		R = sc.nextDouble();
		
		Volume = Math.pow(R, 3) * 3.14159 * 4.0 / 3.0;
		
		System.out.printf("VOLUME = %.3f%n" , Volume);
		
		sc.close();
	}

}
