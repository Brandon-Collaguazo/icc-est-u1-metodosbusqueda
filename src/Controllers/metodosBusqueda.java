package Controllers;

public class metodosBusqueda {
    int [] arreglo = {3, 5, 1, 0, 8, 9, 10};
    public int busquedaLineal(int dato) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == dato) {
                return i;
            }
        }
        return -1;
    }
}