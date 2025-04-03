package fundamentos;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o dia da semana: ");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}
		if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}
		if("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia))
		{
			System.out.println(3);
		}
		if("Quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}
		if("Quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}
		if("Sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}
		if("Sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)){
			System.out.println(7);
		} else {
			System.out.println("Dia inválido");
		}
	
		entrada.close();
	}

}
