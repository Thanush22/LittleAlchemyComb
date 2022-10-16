package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.combination;

import java.util.Scanner;

public class R extends Abstract {
    public void alphabet(){
        System.out.println("rabbit\nrain\nrainbow\nrainforest\nrat\nrecipe\nreed\nreindeer\nring\nriver\nrivulet\nrobot\nrobotvacuum\nrock\nrocket\nroe\nrollercoaster\nrope\nrose\nruins\nruler\nrust\nrv");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case"rabbit":
                combination.rabbit();
                break;
            case"rain":
                combination.rain();
                break;
            case"rainbow":
                combination.rainbow();
                break;
            case"rainforest":
                combination.rainforest();
                break;
            case"rat":
                combination.rat();
                break;
            case"recipe":
                combination.recipe();
                break;
            case"reed":
                combination.reed();
                break;
            case"reindeer":
                combination.reindeer();
                break;
            case"ring":
                combination.ring();
                break;
            case"river":
                combination.river();
                break;
            case"rivulet":
                combination.rivulet();
                break;
            case"robot":
                combination.robot();
                break;
            case"robotvacuum":
                combination.robotvacuum();
                break;
            case"rock":
                combination.rock();
                break;
            case"rocket":
                combination.rocket();
                break;
            case"roe":
                combination.roe();
                break;
            case"rollercoaster":
                combination.rollercoaster();
                break;
            case"rope":
                combination.rope();
                break;
            case"rose":
                combination.rose();
                break;
            case"ruins":
                combination.ruins();
                break;
            case"ruler":
                combination.ruler();
                break;
            case"rust":
                combination.rust();
                break;
            case"rv":
                combination.rv();
                break;
        }
    }
}
