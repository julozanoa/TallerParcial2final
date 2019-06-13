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
public class MutualFund extends ShareAsset{
    
    protected double totalShares;

    public MutualFund(double totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }

    @Override
    public double getProfit() {
         return this.totalShares*currentPrice-totalCost;
    }

    @Override
    public double getMarketValue() {
        return this.totalShares*currentPrice;
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(double totalShares) {
        this.totalShares = totalShares;
    }
    
    
    
    
    
}
