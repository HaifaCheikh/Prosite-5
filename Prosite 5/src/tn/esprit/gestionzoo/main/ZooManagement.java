package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        // Création d'instances avec constructeurs par défaut
        Aquatic aquaticAnimal = new Aquatic();
        Terrestrial terrestrialAnimal = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        // Création d'instances avec constructeurs paramétrés
        Dolphin dolphin2 = new Dolphin("Ocean", 14.5f);
        Penguin penguin2 = new Penguin("Arctic", 25.3f);

        // Affichage des objets créés
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin2);
        System.out.println(penguin2);

        // Appel de la méthode swim() pour démontrer le polymorphisme
        aquaticAnimal.swim();
        dolphin2.swim();
        penguin2.swim();
    }
}
