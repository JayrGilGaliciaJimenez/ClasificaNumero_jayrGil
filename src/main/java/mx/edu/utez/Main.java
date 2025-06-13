package mx.edu.utez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while (opc != 5) {
            System.out.println("""
                1.  Determinar si un numero es par
                2.- Determinar si es positivo, negativo o cero
                3.- Verificar si es multliplo de 5
                4.- Verificar si es divisible entre 3 y 4 al mismto tiempo
                5.- Salir
                """);
            opc = sc.nextInt();
            double numero = 0.0;
            switch (opc){
                case 1:
                    //sc.nextLine();
                    System.out.println("Ingresa un numero");
                    numero = sc.nextDouble();
                    System.out.println(numero % 2 == 0 ? "El numero si es par" : "El numero no es par");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingresa un numero");
                    numero = sc.nextDouble();
                    if(numero == 0 ){
                        System.out.println("El numero es 0");
                    } else if (numero < 0) {
                        System.out.println("Es negativo");
                    } else if (numero > 0) {
                        System.out.println("Es positivo");
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Ingresa un numero");
                    numero = sc.nextDouble();
                    System.out.println(numero % 5 == 0 ? "El numero es multiplo de 5" : "El numero no es multiplo de 5");
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Ingresa un numero");
                    numero = sc.nextDouble();
                    if(numero % 3 == 0 && numero % 4 == 0) {
                        System.out.println("Es divisible entre 3 y 4 al mismo tiempo");
                    } else {
                        System.out.println("No es divisible entre 3 y 4 al mismo tiempo");
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Adios xd");
                    break;

            }

        }
    }
}