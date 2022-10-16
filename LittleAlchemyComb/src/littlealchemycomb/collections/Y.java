package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.combination;

import java.util.Scanner;

public class Y extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("yeti\nyogurt");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case"yeti":
                combination.yeti();
                break;
            case"yoghurt":
                combination.yoghurt();
                break;
        }
    }
}