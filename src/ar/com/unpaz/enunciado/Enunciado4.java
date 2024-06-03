package ar.com.unpaz.enunciado;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Enunciado4 {
    public static List<Integer> encontrarNrosPrimos(int inicio, int fin) {
        return IntStream.rangeClosed(inicio, fin)
                        .parallel()
                        .filter(Enunciado4::esPrimo)
                        .boxed()
                        .sorted()
                        .collect(Collectors.toList());
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                        .noneMatch(n -> num % n == 0);
    }
}