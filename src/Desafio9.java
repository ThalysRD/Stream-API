import java.util.*;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Boolean todosDistintos = numeros.stream().distinct().count() == numeros.size();

        if(todosDistintos){
            System.out.println("Nenhum número se repete");
        } else {
            System.out.println("Há números repetidos");
        }
    }
}
