package Controllers;

import models.Persona;
import views.ShowConsole;

public class metodosBusqueda {
    
    private ShowConsole showConsole;
    private Persona [] people;
    
    public metodosBusqueda(Persona[] personas) {
        showConsole = new ShowConsole();
        this.people = personas;
    }
    public int busquedaLineal(int [] arreglo, int valor) {
        for(int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public int finderPersonByCode(int code) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode() {
        int codeToFinde = showConsole.getCode();
        int indexPerson = finderPersonByCode(codeToFinde);
        if(indexPerson >= 0) {
            showConsole.showMessage("Persona encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona con código " + codeToFinde + " no encontrado");
        }
    }
}