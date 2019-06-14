/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerParcial2;

/**
 *
 * @author JUANPABLO
 */
public class Cash implements Asset{
    
    protected double amoun;

    public Cash(double amoun) {
        this.amoun = amoun;
    }
    
    

    @Override
    public double getMarketValue() {
        return this.amoun;
    }

    @Override
    public double getProfit() {
        return 0;
    }

    public double getAmoun() {
        return amoun;
    }

    public void setAmoun(double amoun) {
        this.amoun = amoun;
    }
    
    

    
    }

    

    
    
    
    
    

