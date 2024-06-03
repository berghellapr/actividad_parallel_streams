package ar.com.unpaz.enunciado;

import java.util.List;
import java.util.stream.Collectors;

public class Enunciado2 {
    public static List<String> buscarPalabras(List<String> palabras, String subcadena) {
        return palabras.parallelStream()
                       .filter(p -> p.contains(subcadena))
                       .collect(Collectors.toList());
    }
}