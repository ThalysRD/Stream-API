import java.util.*;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Integer somaDosDigitos = numeros.stream().flatMapToInt(n -> String.valueOf(n).chars().map(c -> c - '0')).sum();

        System.out.println(somaDosDigitos);
    }
}
