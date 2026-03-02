package Clase4;

import java.util.Scanner;

public class Ejercicio41b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pedir usuario que dijite el angulo

        System.out.println("Digite la temperatura: ");

        int temperatura = sc.nextInt();

        // condicional

        if (temperatura >= 100)
            System.out.println("Es en punto de ebullicion");
        else
            System.out.println("No es en punto de ebullicion");

        sc.close();
    }

}