package fundamentos;

import java.util.Scanner;

public class DesafioLeituraTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o primeiro número que seja convertido ao quadrado:");
		String primeiroNum = entrada.next().replace(",", ".");

		System.out.print("Informe o segundo número que seja covertido ao cubo:");
		String segundoNum = entrada.next().replace(",", ".");
		
		double InformeNumber1 = Double.parseDouble(primeiroNum);
		double InformeNumber2 = Double.parseDouble(segundoNum);
		
		double resultado = (InformeNumber1 * InformeNumber1);
		double resultado2 = (InformeNumber2* InformeNumber2* InformeNumber2);
		
		System.out.println("Resultado ao quadrado é: " + resultado);
		System.out.println("Resultado ao cubo é: " +  resultado2);

		entrada.close();
	}
}
