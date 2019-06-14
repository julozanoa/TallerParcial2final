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
public class Stock extends ShareAsset{
    
    protected int totalShares;

    public Stock(int totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }
    
    

    @Override
    public double getMarketValue(){
        return totalCost*currentPrice;
    }
    
    @Override
    public double getProfit(){
        return this.totalShares*currentPrice-totalCost;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }
    
    
}
