import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] entradaTamanhoEvalorPar = scanner.nextLine().split(" ");
		int[] tamanhoEK = Arrays.stream(entradaTamanhoEvalorPar).mapToInt(Integer::parseInt).toArray();
		
		String[] entradaNumeros = scanner.nextLine().split(" ");
		int[] valoresNumericos = Arrays.stream(entradaNumeros).mapToInt(Integer::parseInt).toArray();

		int numeroPares  = 0;
        int tamanho = valoresNumericos.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (valoresNumericos[i] - valoresNumericos[j] == tamanhoEK[1]) {
                	numeroPares++;
                }
            }
        }

        System.out.println(numeroPares);
        
        scanner.close();
    }
}
