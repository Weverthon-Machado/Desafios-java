package fundamentos;

public class DesafioImc {

	public static void main(String[] args) {
		final double Altura = 1.80 * 2;
		double Peso = 85;
		final double IMC = Peso / Altura;
		double Resultado = IMC;
		
		System.out.printf("Seu IMC é: %.2f%n" , Resultado);
		
	}
}
