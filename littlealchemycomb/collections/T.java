package littlealchemycomb.collections;

import littlealchemycomb.Abstract;
import littlealchemycomb.combination;

import java.util.Scanner;

public class T extends Abstract {
    public void alphabet(){
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String m = input.nextLine();
        switch (m) {
            case "tablet" -> combination.tablet();
            case "tailor" -> combination.tailor();
            case "tank" -> combination.tank();
            case "tea" -> combination.tea();
            case "telescope" -> combination.telescope();
            case "tent" -> combination.tent();
            case "theonering" -> combination.theonering();
            case "thermometer" -> combination.thermometer();
            case "thread" -> combination.thread();
            case "tide" -> combination.tide();
            case "time" -> combination.time();
            case "titanic" -> combination.titanic();
            case "toast" -> combination.toast();
            case "tabacco" -> combination.tobacco();
            case "tool" -> combination.tool();
            case "toolbox" -> combination.toolbox();
            case "tornado" -> combination.tornado();
            case "toucan" -> combination.toucan();
            case "tractor" -> combination.tractor();
            case "train" -> combination.train();
            case "trainyard" -> combination.trainyard();
            case "treasure" -> combination.treasure();
            case "treasuremap" -> combination.treasuremap();
            case "tree" -> combination.tree();
            case "treehouse" -> combination.treehouse();
            case "trojanhorse" -> combination.trojanhorse();
            case "tsunami" -> combination.tsunami();
            case "tunnel" -> combination.tunnel();
            case "turtle" -> combination.turtle();
            case "twilight" -> combination.twilight();
            case "tyrannosaurusrex" -> combination.tyrannosaurusrex();
        }
    }
}