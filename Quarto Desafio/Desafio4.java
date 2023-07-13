import java.util.Scanner;

public class Desafio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String entradaTexto = scanner.nextLine();
		
		String primeiraMetade = entradaTexto.substring(0, entradaTexto.length() / 2);
		String segundaMetade = entradaTexto.substring(entradaTexto.length() / 2);
		
		String PrimeiraMetadeInvertido = new StringBuilder(primeiraMetade).reverse().toString();
		
		String SegundaMetadeInvertido = new StringBuilder(segundaMetade).reverse().toString();
		
		System.out.println(PrimeiraMetadeInvertido + SegundaMetadeInvertido);
		scanner.close();
    }
}
