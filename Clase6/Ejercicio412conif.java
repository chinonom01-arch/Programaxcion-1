package Clase6;

import java.util.Scanner;

public class Ejercicio412conif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int seleccion;

        System.out.println("Digite el primer numero: ");
        num1 = sc.nextDouble();
         System.out.println("Digite el segundo numero: ");
         num2 = sc.nextDouble();

        System.out.println("Seleccione la seleccion 1,2 o 3 ");
        seleccion = sc.nextInt();

        if (seleccion ==1)
            System.out.println("La suma es: " + (num1 + num2));
        else if (seleccion == 2)
            System.out.println("La multiplicacion es: " + (num1 * num2));
        else if (seleccion == 3)
            System.out.println("La division es: " + (num1/num2));
        else
            System.out.println("Seleccion no valida");

         sc.close();
    }
}