package Controllers;

import models.Persona;

public class Ordenar {
    private Persona [] people;
    public void sortByName(Persona [] people) {
        for (int i = 0; i < people.length - 1 ; i++) {
            for(int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareTo(
                    people[j + 1].getName()) > 0) {
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
}

