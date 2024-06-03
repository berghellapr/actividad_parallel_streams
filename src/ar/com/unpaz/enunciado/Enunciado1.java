package ar.com.unpaz.enunciado;
import java.util.stream.IntStream;

public class Enunciado1 {

	public static int calcularSumaCuadrados() {
		return IntStream.rangeClosed(1, 100)
	                        .parallel()
	                        .map(n -> n * n)
	                        .sum();
	    }
}
