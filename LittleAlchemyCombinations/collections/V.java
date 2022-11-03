package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;
import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class V extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("vacuumcleaner\nvampire\nvase\nvault\nvegetable\nvenus\nvillage\nvine\nvinegar\nvolcano\nvulture");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case "vacuum cleaner" -> Combination.vacuumcleaner();
            case "volcano" -> Combination.volcano();
            case "vampire" -> Combination.vampire();
            case "vas" -> Combination.vas();
            case "vault" -> Combination.vault();
            case "vegetable" -> Combination.vegetable();
            case "venus" -> Combination.venus();
            case "village" -> Combination.village();
            case "vine" -> Combination.vine();
            case "vinegar" -> Combination.vinegar();
            case "vulture" -> Combination.vulture();
        }
    }
}