/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Counter {
    private static int n = 0;

    public synchronized void increase() {
        n++;
    }

    public int getCount() {
        return n;
    }
}
    

