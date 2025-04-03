package fundamentos;

import java.util.Scanner;

public class FormulaDeBhaskara {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de c: ");
        int c = scanner.nextInt();

        int delta = (b * b) - (4 * a * c);

        System.out.println("O valor de Δ (delta) é: " + delta);

        scanner.close();
		
	}
}
