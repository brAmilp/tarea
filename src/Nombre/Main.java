package Nombre;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nom ;

        System.out.println("Ingrese su nombre");
        nom = teclado.nextLine();

        System.out.println("Bienvenido a Program 2 2022 " +nom);
    }
}
