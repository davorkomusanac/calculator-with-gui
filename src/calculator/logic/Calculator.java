/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.logic;

/**
 *
 * @author Davor
 */
public class Calculator {

    private int totalValue;    

    public void increase(int value) {
        this.totalValue += value;
    }

    public void decrease(int value) {
        this.totalValue -= value;
    }

    public void reset() {        
        this.totalValue = 0;
    }

    public int totalValue() {
        return this.totalValue;
    }    
}
