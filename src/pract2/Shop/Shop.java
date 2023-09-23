package pract2.Shop;

import java.util.ArrayList;

public class Shop {
    ArrayList<String> computers = new ArrayList<String>();

    public void addComputer(String comp){
        computers.add(comp);
    }

    public void deleteComputer(String comp){
        computers.remove(comp);
    }

    public void searchComputer(String comp){
        for (String computer : computers) {
            if (computer.contains(comp)) {
                System.out.println(computer);
            }
        }
    }
}
