import java.util.Scanner;

import Controllers.metodosBusqueda;

public class App {
    public static void main(String[] args) throws Exception {
        metodosBusqueda mb = new metodosBusqueda();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el elemento para buscar en el arreglo: ");
        int d = sc.nextInt();
        if (resultado != -1) {
            System.out.println("Dato encontrado");
        } else {
            System.out.println("Dato no encontrado");
        }
        sc.close();
    }
}
