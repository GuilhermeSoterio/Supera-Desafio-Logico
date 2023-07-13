import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }

        numeros.stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        numeros.stream()
                .filter(num -> num % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        scanner.close();
	}
}
