package Clase4;

import java.util.Scanner;

public class Ejercicio41e {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pedir valores al usuario

        System.out.println("Digite la distancia: ");
         int distancia = sc.nextInt();
  

        // condicional

        if (distancia > 25 && distancia < 35) {
            System.out.println("Determine el valor para el tiempo ");
            int tiempo = sc.nextInt();
        } else {
            System.out.println("Tranquilo ya elejimos valor de tiempo por ti :D");
    }

        sc.close();
    }

}