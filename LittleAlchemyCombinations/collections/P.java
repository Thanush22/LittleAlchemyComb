package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;
import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class P extends Abstract {
    public void alphabet() {
        System.out.println("paint\npainter\npainting\npaleontologist\npalm\npan flute\npaper\npaper airplane\npaper cup\nparachute\nparaglider\npark\nparrot\npasta\npeacock\npeanut butter\npeat\npebble\npegasus\npencil\npencil sharpener\npenguin\npenicillin\nperfume\npetroleum\nphilosophy\nphoenix\npicnic\npie\npig\npigeon\npiggy bank\npilot\npinocchio\npipe\npiranha\npirate\npirate ship\npitchfork\npizza\nplanet\nplant\nplasma\nplankton\nplatypus\nplow\npolar bear\npollen\npond\npopsicle\npost office\npotato\npotter\npottery\npressure\nprimordial soup\nprinter\nprism\npterodactyl\npuddle\npumpkin\npyramid");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case"paint" -> Combination.paint();
            case"painter" -> Combination.painter();
            case"painting" -> Combination.painting();
            case"paleontologist" -> Combination.paleontologist();
            case"palm" -> Combination.palm();
            case"panflute" -> Combination.panflute();
            case"paper" -> Combination.paper();
            case"paperairplane" -> Combination.paperairplane();
            case"papercup" -> Combination.papercup();
            case"parachute" -> Combination.parachute();
            case"paraglider" -> Combination.paraglider();
            case"park" -> Combination.park();
            case"parrot" -> Combination.parrot();
            case"pasta" -> Combination.pasta();
            case"peacock" -> Combination.peacock();
            case"peanutbutter" -> Combination.peanutbutter();
            case"peat" -> Combination.peat();
            case"pebble" -> Combination.pebble();
            case"pegasus" -> Combination.pegasus();
            case"pencil" -> Combination.pencil();
            case"pencilsharpner" -> Combination.pencilsharpner();
            case"penguin" -> Combination.penguin();
            case"penicillin" -> Combination.penicillin();
            case"perfume" -> Combination.perfume();
            case"petroleum" -> Combination.petroleum();
            case"philosophy" -> Combination.philosophy();
            case"phoenix" -> Combination.phoenix();
            case"picnic" -> Combination.picnic();
            case"pie" -> Combination.pie();
            case"pig" -> Combination.pig();
            case"pigeon" -> Combination.pigeon();
            case"piggybank" -> Combination.piggybank();
            case"pilot" -> Combination.pilot();
            case"pinocchio" -> Combination.pinocchio();
            case"pipe" -> Combination.pipe();
            case"piranha" -> Combination.piranha();
            case"pirate" -> Combination.pirate();
            case"pirateship" -> Combination.pirateship();
            case"pitchfork" -> Combination.pitchfork();
            case"pizza" -> Combination.pizza();
            case"planet" -> Combination.planet();
            case"plant" -> Combination.plant();
            case"plasma" -> Combination.plasma();
            case"plankton" -> Combination.plankton();
            case"platypus" -> Combination.platypus();
            case"plow" -> Combination.plow();
            case"polar bear" -> Combination.polarbear();
            case"pollen" -> Combination.pollen();
            case"pond" -> Combination.pond();
            case"popsicle" -> Combination.popsicle();
            case"post office" -> Combination.postoffice();
            case"potato" -> Combination.potato();
            case"potter" -> Combination.potter();
            case"pottery" -> Combination.pottery();
            case"pressure" -> Combination.pressure();
            case"primordial soup" -> Combination.primordialsoup();
            case"printer" -> Combination.printer();
            case"prism" -> Combination.prism();
            case"pterodactyl" -> Combination.pterodactyl();
            case"puddle" -> Combination.puddle();
            case"pumpkin" -> Combination.pumpkin();
            case"pyramid" -> Combination.pyramid();
        }
    }
}


