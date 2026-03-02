package Clase4;

import java.util.Scanner;


public class Ejercicio45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pedir valores al usuario

          System.out.println("Digite un numero: ");
           int numero1 = sc.nextInt();
  
        // condicional

        if (numero1 % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("El numero es impar");
    }

        sc.close();
    }

}