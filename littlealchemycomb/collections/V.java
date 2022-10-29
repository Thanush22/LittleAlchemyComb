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
            case "vacuumcleaner" -> combination.vacuumcleaner();
            case "valcano" -> combination.valcano();
            case "vampire" -> combination.vampire();
            case "vas" -> combination.vas();
            case "vault" -> combination.vault();
            case "vegetable" -> combination.vegetable();
            case "venus" -> combination.venus();
            case "village" -> combination.village();
            case "vine" -> combination.vine();
            case "vinegar" -> combination.vinegar();
            case "vulture" -> combination.vulture();
        }
    }
}