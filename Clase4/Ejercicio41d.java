package Clase4;

import java.util.Scanner;

public class Ejercicio41d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pedir valores al usuario

        System.out.println("Digite de x: ");
         int x = sc.nextInt();
         System.out.println("Digite de y: ");
          int y = sc.nextInt();
          System.out.println("Digite de z: ");
           int z = sc.nextInt();

        // condicional

        if (x > y && z < 20) {
            System.out.println("Determine el valor de p ");
            int p = sc.nextInt();
        } else {
            System.out.println("Tranquilo ya elejimos valor de p por ti :D");
    }

        sc.close();
    }

}