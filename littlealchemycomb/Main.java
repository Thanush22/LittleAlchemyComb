package littlealchemycomb;

import littlealchemycomb.collections.*;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        char C = input.next().charAt(0);
        if(C=='p'){
            p san = new p();
            san.alphabet();
        }
        else if(C=='t'){
            t san = new t();
            san.alphabet();
        }
        else if(C=='q'){
            q san = new q();
            san.alphabet();
        }
        else if(C=='r'){
            r san = new r();
            san.alphabet();
        }
        else if(C=='u'){
            u san = new u();
            san.alphabet();
        }
        else if(C=='v'){
            v san = new v();
            san.alphabet();
        }
        else if(C=='w'){
            w san = new w();
            san.alphabet();
        }
        else if (C=='y'){
            y san = new y();
            san.alphabet();
        }
        else if(C=='z'){
            Z san = new Z();
            san.alphabet();
        }
        else if(C=='s'){
            S san = new S();
            san.alphabet();
        }
        else{
            System.out.println("please enter valid alphabet");
        }
    }
}
