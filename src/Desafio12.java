import java.util.*;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Integer somaDosQuadrados = numeros.stream().reduce(1, (n1 ,n2) -> n1 * n2);
        System.out.println(somaDosQuadrados);

    }
}
