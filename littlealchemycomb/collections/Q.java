package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.Combination;

import java.util.Scanner;

public class Q extends Abstract {
    public void alphabet() {
        System.out.println("quicksand\nquicksilver");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word:");
        String m = input.nextLine();
        switch (m) {
            case "quicksand" -> Combination.quicksand();
            case "quicksilver" -> Combination.quicksilver();
        }
    }
}
