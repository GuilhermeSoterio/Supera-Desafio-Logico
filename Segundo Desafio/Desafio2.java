import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		Double leitura = scanner.nextDouble();
        List<Double> Notas = Arrays.asList(100.00, 50.00, 20.00, 10.00, 5.00, 2.00);
        List<Double> Moedas = Arrays.asList(1.0, 0.50, 0.25, 0.10, 0.05, 0.01);
        
        System.out.println("NOTAS:");
        for (Double nota : Notas) {
            int qtdNota = (int) (leitura / nota);
            System.out.printf("%d nota(s) de R$ %.2f%n", qtdNota, nota);
            leitura -= qtdNota * nota;
        }
        
        System.out.println("MOEDAS:");
        for (Double moeda : Moedas) {
            int qtdMoeda = (int) (leitura / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoeda, moeda);
            leitura -= qtdMoeda * moeda;
        }
        
        scanner.close();
	}
}
