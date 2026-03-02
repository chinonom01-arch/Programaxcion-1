package Parciales;

import java.util.Scanner;

public class Parcial1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    //definimos variables
     int contraseña = 1234;
     int saldo = 800000;
    //Damos la bienvenida al usuario 

    System.out.println("Bienvenido al cajero de la unicamacho, por favor ingrese su contraseña");
     int ContraseñaUsuario = sc.nextInt();
    
    //Aplicamos un condicional para pedir la contraseña
     
      if(ContraseñaUsuario == contraseña) {

    //pedimos el valor a retirar al usuario :D   
        System.out.println("Por favor ingrese el valor a retirar");
        int valorARetirar = sc.nextInt();

    //aplicamos otra condicional para rectificar si el valor es igual o mayor a 200000 
        if (valorARetirar > 200000) {

    //si se confirma que el valor el mayor a 200000 se le aplica un valor adicional de 2000 al valor original
           valorARetirar = valorARetirar + 2000;
        }
    //aplicamos una condicional adicional paraa rectificar si el valor que se va a retirar el mayo al saldo         
        if (valorARetirar <= saldo) {
    //una vez realizado el retiro le mostramos al usuario su nuevo saldo        
           int nuevoSaldo = saldo - valorARetirar;
           System.out.println("su nuevo saldo es: " + nuevoSaldo);
    //aqui cerramos el condicional y se le informa al usuario que el valor a retirar el mayor a su saldo actual
        }else {
            System.out.println("El valor ingresado es mayor a su saldo actual, por favor elija un valor inferior o igual a su saldo");
        }

         }else {
    System.out.println("La contraseña ingresada es incorrecta");
  }
        sc.close();
    //aqui cerramos el condicional de la contraseña en el caso que incorrecta
  }
     }   
    

