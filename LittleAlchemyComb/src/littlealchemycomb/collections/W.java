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
            case"wagon":
                combination.wagon();
                break;
            case"wall":
                combination.wall();
                break;
            case"wand":
                combination.wand();
                break;
            case"warmth":
                combination.warmth();
                break;
            case"warrior":
                combination.warrior();
                break;
            case"watch":
                combination.watch();
                break;
            case"water":
                combination.water();
                break;
            case"waterfall":
                combination.waterfall();
                break;
            case"watergun":
                combination.watergun();
                break;
            case"waterlily":
                combination.waterlily();
                break;
            case"waterpipe":
                combination.waterpipe();
                break;
            case"wave":
                combination.wave();
                break;
            case"wax":
                combination.wax();
                break;
            case"web":
                combination.web();
                break;
            case"werewolf":
                combination.werewolf();
                break;
            case"wheat":
                combination.wheat();
                break;
            case"wheel":
                combination.wheel();
                break;
            case"wildboar":
                combination.wildboar();
                break;
            case"wind":
                combination.wind();
                break;
            case"windmill":
                combination.windmill();
                break;
            case"windsurfer":
                combination.windsurfer();
                break;
            case"windturbine":
                combination.windturbine();
                break;
            case"wine":
                combination.wine();
                break;
            case"wire":
                combination.wire();
                break;
            case"witch":
                combination.witch();
                break;
            case"wizard":
                combination.wizard();
                break;
            case"wolf":
                combination.wolf();
                break;
            case"wood":
                combination.wood();
                break;
            case"woodpecker":
                combination.woodpecker();
                break;
            case"wool":
                combination.wool();
                break;
            case"wrappingpaper":
                combination.wrappingpaper();
                break;
            case"writer":
                combination.writer();
                break;
        }
    }
}
