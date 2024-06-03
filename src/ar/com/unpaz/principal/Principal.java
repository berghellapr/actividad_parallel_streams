package ar.com.unpaz.principal;

import ar.com.unpaz.enunciado.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Principal {
    public static void main(String[] args) {
    	
        /*"Implementa un programa en Java que utilice parallel streams 
         * para calcular la suma de los cuadrados de 
         * los números enteros del 1 al 100 de manera paralela."*/
    	
        int sumaCuadrados = Enunciado1.calcularSumaCuadrados();
        System.out.println("La suma de los cuadrados de los números del 1 al 100 es = " + sumaCuadrados);
        //-----------------------------------------------------------------------------------------------------------------------------
        
        /* "Desarrolla una aplicación en Java que procese una lista de strings y busque las palabras 
         * que contienen una determinada subcadena utilizando parallel streams para mejorar la eficiencia del proceso." */
        
        List<String> palabras = Arrays.asList("vestido", "abeja", "beber", "berghella", "led", "zeppelin");
        String subcadena = "be";
        
        List<String> palabrasConSubcadena = Enunciado2.buscarPalabras(palabras, subcadena);
        System.out.println("\nLas palabras que contienen la subcadena \"" + subcadena + "\" son: " + palabrasConSubcadena);
        //-----------------------------------------------------------------------------------------------------------------------------

        /* "Escribe un programa en Java que utilice parallel streams para calcular el producto de los elementos 
         * de una lista de números enteros generados aleatoriamente y mostrar el resultado por pantalla." */
        
        List<Integer> numeros = IntStream.range(0, 10)
                                         .map(i -> new Random().nextInt(10) + 1) //+1 para que sea hasta el 10
                                         .boxed() //convierto int -> integer
                                         .collect(Collectors.toList());
        int producto = Enunciado3.calcularProducto(numeros);
        System.out.println("\nLa lista de números es --> " + numeros);
        System.out.println("El producto de los elementos es = " + producto);
        //-----------------------------------------------------------------------------------------------------------------------------

        /* "Crea una aplicación en Java que utilice parallel streams para encontrar los números primos en un rango dado
         *  y mostrarlos en orden ascendente, aprovechando la capacidad de procesamiento paralelo para 
         *  mejorar el rendimiento del cálculo." */ 
        
        int inicio = 1;
        int fin = 30;
        List<Integer> primos = Enunciado4.encontrarNrosPrimos(inicio, fin);
        System.out.println("\nLos números primos en el rango [" + inicio + ", " + fin + "] son --> " + primos);
    }
}