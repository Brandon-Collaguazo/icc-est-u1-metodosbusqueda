import java.util.Scanner;

import Controllers.metodosBusqueda;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona [] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(101, "Maria");
        personas[2] = new Persona(102, "Carlos");
        personas[3] = new Persona(103, "Ana");
        personas[4] = new Persona(104, "Luis");
        personas[5] = new Persona(105, "Sofia");
        personas[6] = new Persona(106, "Pedro"); 
        metodosBusqueda mB = new metodosBusqueda(personas);
    }
}
