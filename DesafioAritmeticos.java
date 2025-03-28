package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		int a = (int) Math.pow(6 * (3+2), 2);
		int b = 3 * 2;
		
		int c = (1 - 5) * (2 - 7);
		int d = 2;
		
		int e = a / b;
		int f = (int) Math.pow(c / d, 2);
		
		int g = (int) Math.pow(e - f, 3);
		int h = (int) Math.pow(10, 3);
		
		int resultado = g / h;
		
		
		System.out.println("O resultado é" + resultado);
	}
}
