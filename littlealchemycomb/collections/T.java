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
        switch(m){
            case"tablet":
                combination.tablet();
                break;
            case"tailor":
                combination.tailor();
                break;
            case"tank":
                combination.tank();
                break;
            case"tea":
                combination.tea();
                break;
            case"telescope":
                combination.telescope();
                break;
            case"tent":
                combination.tent();
                break;
            case"theonering":
                combination.theonering();
                break;
            case"thermometer":
                combination.thermometer();
                break;
            case"thread":
                combination.thread();
                break;
            case"tide":
                combination.tide();
                break;
            case"time":
                combination.time();
                break;
            case"titanic":
                combination.titanic();
                break;
            case"toast":
                combination.toast();
                break;
            case"tabacco":
                combination.tobacco();
                break;
            case"tool":
                combination.tool();
                break;
            case"toolbox":
                combination.toolbox();
                break;
            case"tornado":
                combination.tornado();
                break;
            case"toucan":
                combination.toucan();
                break;
            case"tractor":
                combination.tractor();
                break;
            case"train":
                combination.train();
                break;
            case"trainyard":
                combination.trainyard();
                break;
            case"treasure":
                combination.treasure();
                break;
            case"treasuremap":
                combination.treasuremap();
                break;
            case"tree":
                combination.tree();
                break;
            case"treehouse":
                combination.treehouse();
                break;
            case"trojanhorse":
                combination.trojanhorse();
                break;
            case"tsunami":
                combination.tsunami();
                break;
            case"tunnel":
                combination.tunnel();
                break;
            case"turtle":
                combination.turtle();
                break;
            case"twilight":
                combination.twilight();
                break;
            case"tyrannosaurusrex":
                combination.tyrannosaurusrex();
                break;
        }
    }
}