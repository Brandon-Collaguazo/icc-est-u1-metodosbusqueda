package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner sc = new Scanner(System.in);
    public void showMenu() {
        System.out.println("Método búsqueda");
    }
    public int getCode() {
        System.out.println("Ingrese código");
        int codigo = sc.nextInt();
        System.out.println("Código ingresado " + codigo);
        return codigo;
    }
    public void showMessage(String message) {
        
    }
}
