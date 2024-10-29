package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String usuarioCorrecto = "Admin";
        String contraseñaCorrecta = "1234";
        Scanner scanner = new Scanner(System.in);


        int intentos = 0;
        while (intentos <3)
        {

            System.out.println("Introduzca el usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Introduzca la contraseña: ");
            String contraseña = scanner.nextLine();

            if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                System.out.println("El login es correcto");
                break;
            }
            intentos++;

            if (intentos == 3){
                System.out.println("No tienes intentos");

            }
        }
        scanner.close();
    }
}