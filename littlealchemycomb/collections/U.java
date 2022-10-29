package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.Combination;

import java.util.Scanner;

public class U extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("ufo\numbrella\nunicorn\nuniverse");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case "ufo" -> Combination.ufo();
            case "umbrella" -> Combination.umbrella();
            case "unicorn" -> Combination.unicorn();
            case "universe" -> Combination.universe();
        }
    }
}
