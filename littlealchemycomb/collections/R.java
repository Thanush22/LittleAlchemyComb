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
            case "rabbit" -> combination.rabbit();
            case "rain" -> combination.rain();
            case "rainbow" -> combination.rainbow();
            case "rainforest" -> combination.rainforest();
            case "rat" -> combination.rat();
            case "recipe" -> combination.recipe();
            case "reed" -> combination.reed();
            case "reindeer" -> combination.reindeer();
            case "ring" -> combination.ring();
            case "river" -> combination.river();
            case "rivulet" -> combination.rivulet();
            case "robot" -> combination.robot();
            case "robotvacuum" -> combination.robotvacuum();
            case "rock" -> combination.rock();
            case "rocket" -> combination.rocket();
            case "roe" -> combination.roe();
            case "rollercoaster" -> combination.rollercoaster();
            case "rope" -> combination.rope();
            case "rose" -> combination.rose();
            case "ruins" -> combination.ruins();
            case "ruler" -> combination.ruler();
            case "rust" -> combination.rust();
            case "rv" -> combination.rv();
        }
    }
}
