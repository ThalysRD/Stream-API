import java.util.*;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
        Integer somaDosPares = pares.stream().reduce(0, Integer::sum);
        System.out.println(somaDosPares);
    }
}
