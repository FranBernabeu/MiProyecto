import java.util.Scanner;

public class FBFunciona {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		String num = sc.next();
		ASumar j = new ASumar(num);
		System.out.println(j.mostrar());
	}
}
