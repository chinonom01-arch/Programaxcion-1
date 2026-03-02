package Clase4;

import java.util.Scanner;

public class Ejercicio41c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pedir el numero al usuario

        System.out.println("Digite el el numero: ");


        int numeroa = -1;
         int numerob = 1;

        int numero1 = sc.nextInt();
             
        // condicional

        if (numero1 <= 0)
            System.out.println("La suma es negativa " +  (numeroa + numero1));
        else
            System.out.println("La suma es positiva " + (numerob + numero1));

        sc.close();
    }

}