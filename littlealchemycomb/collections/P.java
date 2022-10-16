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
            case"pitchfork":
                combination.pitchfork();
                break;
            case"pizza":
                combination.pizza();
            case"planet":
                combination.planet();
                break;
            case"plant":
                combination.plant();
                break;
            case"plasma":
                combination.plasma();
                break;
            case"plankton":
                combination.plankton();
                break;
            case"platypus":
                combination.platypus();
                break;
            case"plow":
                combination.plow();
                break;
            case"polarbear":
                combination.polarbear();
                break;
            case"pollen":
                combination.pollen();
                break;
            case"pond":
                combination.pond();
                break;
            case"popsicle":
                combination.popsicle();
                break;
            case"postoffice":
                combination.postoffice();
                break;
            case"potato":
                combination.potato();
                break;
            case"potter":
                combination.potter();
                break;
            case"pottery":
                combination.pottery();
                break;
            case"pressure":
                combination.pressure();
                break;
            case"primordialsoup":
                combination.primordialsoup();
                break;
            case"printer":
                combination.printer();
                break;
            case"prism":
                combination.prism();
                break;
            case"pterodactyl":
                combination.pterodactyl();
                break;
            case"puddle":
                combination.puddle();
                break;
            case"pumpkin":
                combination.pumpkin();
                break;
            case"pyramid":
                combination.pyramid();
                break;
        }
    }
}


