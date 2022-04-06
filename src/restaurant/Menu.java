package restaurant;

import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {

        MenuItem crabRangoon = new MenuItem("Crab Rangoon", 4, "Appetizer", true);
        MenuItem eggRoll = new MenuItem("Egg Roll", 4, "Appetizer", true);
        MenuItem sesameChicken = new MenuItem("Sesame Chicken", 9, "Entree", false);
        MenuItem friedRice = new MenuItem("Fried Rice", 5, "Entree", false);
        MenuItem fortuneCookie = new MenuItem("Fortune Cookie", 1, "Dessert", true);

        ArrayList<MenuItem> fullMenu = new ArrayList<>();

        fullMenu.add(crabRangoon);
        fullMenu.add(eggRoll);
        fullMenu.add(sesameChicken);
        fullMenu.add(friedRice);
        fullMenu.add(fortuneCookie);

        System.out.println(fullMenu);
        System.out.println(crabRangoon);

//        System.out.println(crabRangoon.getDescription());
//        System.out.println("$" + crabRangoon.getPrice());
//        System.out.println(crabRangoon.getCategory());
//        System.out.println(crabRangoon.isNewItem());

    }
}
