package littlealchemycomb;

import littlealchemycomb.collections.*;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        char C = input.next().charAt(0);
        if(C=='p'){
            P san = new P();
            san.alphabet();
        }
        else if(C=='q'){
            Q san = new Q();
            san.alphabet();
        }
        else if(C=='r'){
            R san = new R();
            san.alphabet();
        }
        else if(C=='s'){
            S san = new S();
            san.alphabet();
        }
        else if(C=='t'){
            T san = new T();
            san.alphabet();
        }
        else if(C=='u'){
            U san = new U();
            san.alphabet();
        }
        else if(C=='v'){
            V san = new V();
            san.alphabet();
        }
        else if (C=='w'){
            W san = new W();
            san.alphabet();
        }
        else if(C=='y'){
            Y san = new Y();
            san.alphabet();
        }
        else if(C=='z'){
            Z san = new Z();
            san.alphabet();
        }
        else{
            System.out.println("please enter valid alphabet");
        }
    }
}
