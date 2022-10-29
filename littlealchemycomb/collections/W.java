package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.combination;

import java.util.Scanner;

public class W extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("wagon\nwall\nwand\nwarmth\nwarrior\nwatch\nwater\nwatergun\nwaterlily\nwaterpipe\nwaterfall\nwave\nwax\nweb\nwerewolf\nwheat\nwheel\nwildboar\nwind\nwindturbine\nwindmill\nwindsurfer\nwine\nwire\nwitch\nwizard\nwolf\nwood\nwoodpecker\nwool\nwrappingpaper\nwriter");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case "wagon" -> combination.wagon();
            case "wall" -> combination.wall();
            case "wand" -> combination.wand();
            case "warmth" -> combination.warmth();
            case "warrior" -> combination.warrior();
            case "watch" -> combination.watch();
            case "water" -> combination.water();
            case "waterfall" -> combination.waterfall();
            case "watergun" -> combination.watergun();
            case "waterlily" -> combination.waterlily();
            case "waterpipe" -> combination.waterpipe();
            case "wave" -> combination.wave();
            case "wax" -> combination.wax();
            case "web" -> combination.web();
            case "werewolf" -> combination.werewolf();
            case "wheat" -> combination.wheat();
            case "wheel" -> combination.wheel();
            case "wildboar" -> combination.wildboar();
            case "wind" -> combination.wind();
            case "windmill" -> combination.windmill();
            case "windsurfer" -> combination.windsurfer();
            case "windturbine" -> combination.windturbine();
            case "wine" -> combination.wine();
            case "wire" -> combination.wire();
            case "witch" -> combination.witch();
            case "wizard" -> combination.wizard();
            case "wolf" -> combination.wolf();
            case "wood" -> combination.wood();
            case "woodpecker" -> combination.woodpecker();
            case "wool" -> combination.wool();
            case "wrappingpaper" -> combination.wrappingpaper();
            case "writer" -> combination.writer();
        }
    }
}
