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
public class Cash extends ShareAsset{
    
    protected double amoun;

    public Cash(double amoun, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.amoun = amoun;
    }

    @Override
    public double getProfit() {
        return 0;
    }

    @Override
    public double getMarketValue() {
        return this.amoun;
    }

    public double getAmoun() {
        return amoun;
    }

    public void setAmoun(double amoun) {
        this.amoun = amoun;
    }
    
    
    
    
    
}
