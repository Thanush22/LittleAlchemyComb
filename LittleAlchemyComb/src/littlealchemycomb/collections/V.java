package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.combination;

import java.util.Scanner;

public class V extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("vacuumcleaner\nvampire\nvase\nvault\nvegetable\nvenus\nvillage\nvine\nvinegar\nvolcano\nvulture");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case"vacuumcleaner":
                combination.vacuumcleaner();
                break;
            case"valcano":
                combination.valcano();
                break;
            case"vampire":
                combination.vampire();
                break;
            case"vas":
                combination.vas();
                break;
            case"vault":
                combination.vault();
                break;
            case"vegetable":
                combination.vegetable();
                break;
            case"venus":
                combination.venus();
                break;
            case"village":
                combination.village();
                break;
            case"vine":
                combination.vine();
                break;
            case"vinegar":
                combination.vinegar();
                break;
            case"vulture":
                combination.vulture();
                break;
        }
    }
}