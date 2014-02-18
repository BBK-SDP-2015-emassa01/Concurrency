/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Thread.sleep;
import java.util.Scanner;
/**
 *
 * @author Esha
 */
public class UI implements Runnable{
    
    private int sleepTime;
    
    
    
    public UI(int Sleep){
        this.sleepTime = Sleep;
    }
    
    public static void main(String[] args){
        
        Thread t;
        UI time;
        
        for (int i = 0; i<10; i++){
            System.out.println("Enter a duration (in ms) of task " + i + ":");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            
            time = new UI(number);
            
            t = new Thread(time);
            t.start();
            
        } 
    }
    
    
    @Override
    public void run(){
        try{
          
            sleep(sleepTime);
            System.out.println("Finished task:");
            
        }catch (InterruptedException ex){
            //do nothing.
        }
        
    }
    }
    
    

