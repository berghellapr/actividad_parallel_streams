package ar.com.unpaz.enunciado;

import java.util.List;

public class Enunciado3 {
    public static int calcularProducto(List<Integer> numeros) {
        return numeros.parallelStream()
                      .reduce(1, (a, b) -> a * b);
    }
}
