package Clase4;

import java.util.Scanner;


public class Ejercicio48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pedir valores al usuario

          System.out.println("Digite el numerador: ");
           int numero1 = sc.nextInt();
           System.out.println("Digite el denominador: ");
           int numero2 = sc.nextInt();
  
        // condicional

        if (numero1 % numero2 == 0) {
            System.out.println("el numero es divisible");
        } else {
            System.out.println("El numero no es divisible");
    }

        sc.close();
    }

}

