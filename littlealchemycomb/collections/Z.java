package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.combination;


import java.util.Scanner;

public class Z extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("zombie\nzoo");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case "zombie" -> combination.zombie();
            case "zoo" -> combination.zoo();
        }
    }
}
