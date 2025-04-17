package Controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    private Persona people[];
    private ShowConsole view;
    Ordenar ordenar = new Ordenar();
    public MetodosBusquedaBinaria(Persona[] personas) {
        this.people = personas;
        this.view = new ShowConsole();
        view.showMessage("Método de busqueda binaria");
    }
    public int findPersonByCode(int code) {
        int bajo = 0;
        int alto = people.length - 1;
        while(bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            if(people[central].getCode() == code) {//
                return central;
            } if(people[central].getCode() < code) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return -1;
    }
    private int findPersonByName(String name) {
        ordenar.sortByName(people);
        int bajo = 0;
        int alto = people.length - 1;
        while(bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            if(people[central].getName().toLowerCase().equals(name)) {//
                return central;
            } if(people[central].getName().toLowerCase().compareTo(name) < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return -1;
    }
    public void showPersonByCode() {
        int codeToFinde = view.getCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if(indexPerson == -1) {
            view.showMessage("Persona no encontrada");
        } else {
            view.showMessage("Persona con código: " + codeToFinde + " encontrada");
            view.showMessage(people[indexPerson].toString());
        }
    }
    public void showPersonByName() {
        String nameToFind = view.getName();
        int indexPerson = findPersonByName(nameToFind);
        if(indexPerson == -1) {
            view.showMessage("Persona no encontrada");
        } else {
            view.showMessage("Persona con nombre: " + nameToFind + " encontrada");
            view.showMessage(people[indexPerson].toString());
        }
    }
}
