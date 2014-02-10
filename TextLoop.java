/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Esha
 */
public class TextLoop implements Runnable {
    public static final int COUNT = 10;
    private final String name;
    
public TextLoop(String name) {
    this.name = name;
}
@Override
public void run() {
    for (int i = 0; i < COUNT; i++) {
    System.out.println("Loop:" + name + ", iteration:" + i + ".");
    }
}

public static void main(String args[]) {
    
    
    //if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
    System.out.println("USAGE: java TextLoop <mode>");
    System.out.println(" mode 0: without threads");
    System.out.println(" mode 1: with threads");
    
    System.out.println("Enter a mode.");
    Scanner input = new Scanner(System.in);
    String mode = input.nextLine();
    
    //} else 
    if (mode.equals("0")) {
    for (int i = 0; i < 10; i++) {
    Runnable r = new TextLoop("Thread " + i);
    r.run();
    }
    } else {
    for (int i = 0; i < 10; i++) {
    Runnable r = new TextLoop("Thread " + i);
    Thread t = new Thread(r);
    t.start();
    }
    }
    }
}
    

