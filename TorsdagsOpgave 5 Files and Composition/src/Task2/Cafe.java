package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;
    public Cafe(){
        // In our constructer we don't take any parameters, but we do initialize our array whenever we make a new object of the "Cafe" class.
        coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
    public void loadMenuData(){
        File file = new File("coffees.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                coffeeMenu.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        }
    }
}


