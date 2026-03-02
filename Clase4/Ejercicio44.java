package Clase4;

import java.util.Scanner;
import java.util.*;


public class Ejercicio44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pedir valores al usuario

          System.out.println("Digite un numero: ");
           int numero1 = sc.nextInt();

           double resultado = -Math.sqrt(numero1);
           System.out.println("La raiz cuadrada de " + numero1 + " es: " + resultado);
  
        
    
    }

}