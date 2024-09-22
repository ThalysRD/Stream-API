import java.util.*;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosMaioresQueCinco = numeros.stream().filter(n -> n > 5).toList();
        Integer media = numerosMaioresQueCinco.stream().reduce(0,Integer::sum) / numerosMaioresQueCinco.size();
        System.out.println(media);
    }
}
