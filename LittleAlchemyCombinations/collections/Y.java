package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;
import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class Y extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("yeti\nyoghurt");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case "yeti" -> Combination.yeti();
            case "yoghurt" -> Combination.yoghurt();
        }
    }
}