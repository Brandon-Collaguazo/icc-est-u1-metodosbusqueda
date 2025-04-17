package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner sc = new Scanner(System.in);
    public void showMenu() {
        System.out.println("Método búsqueda");
    }
    public int getCode() {
        System.out.print("Ingrese código: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Código ingresado -> " + codigo);
        return codigo;
    }
    public String getName() {
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre ingresado -> " + nombre);
        return nombre;
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
}
