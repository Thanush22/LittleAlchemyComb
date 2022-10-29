package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.combination;

import java.util.Scanner;

public class P extends Abstract {
    public void alphabet() {
        System.out.println("pitchfork\npizza\nplanet\nplant\nplasma\nplankton\nplatypus\nplow\npolar bear\npollen\npond\npopsicle\npost office\npotato\npotter\npottery\npressure\nprimordial soup\nprinter\nprism\npterodactyl\npuddle\npumpkin\npyramid");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case"pitchfork" -> combination.pitchfork();
            case"pizza" -> combination.pizza();
            case"planet" -> combination.planet();
            case"plant" -> combination.plant();
            case"plasma" -> combination.plasma();
            case"plankton" -> combination.plankton();
            case"platypus" -> combination.platypus();
            case"plow" -> combination.plow();
            case"polarbear" -> combination.polarbear();
            case"pollen" -> combination.pollen();
            case"pond" -> combination.pond();
            case"popsicle" -> combination.popsicle();
            case"postoffice" -> combination.postoffice();
            case"potato" -> combination.potato();
            case"potter" -> combination.potter();
            case"pottery" -> combination.pottery();
            case"pressure" -> combination.pressure();
            case"primordialsoup" -> combination.primordialsoup();
            case"printer" -> combination.printer();
            case"prism" -> combination.prism();
            case"pterodactyl" -> combination.pterodactyl();
            case"puddle" -> combination.puddle();
            case"pumpkin" -> combination.pumpkin();
            case"pyramid" -> combination.pyramid();
        }
    }
}


