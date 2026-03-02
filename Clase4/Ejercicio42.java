package Clase4;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pedir valores al usuario

        System.out.println("Digite el numero 1: ");
         int Numero1 = sc.nextInt();

          System.out.println("Digite el numero 2: ");
           int Numero2 = sc.nextInt();
  

        // condicional

        if (Numero1 < Numero2) {
            System.out.println("El primer numero es menor");
        } else {
            System.out.println("El segundo numero es menor");
    }

        sc.close();
    }

}

