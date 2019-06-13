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
public class DividentStock extends Stock{
    protected double dividens;

    public DividentStock(double dividens, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividens = dividens;
    }

    @Override
    public double getProfit() {
        return totalShares*currentPrice-totalCost;
    }

    @Override
    public double getMarketValue() {
        return super.getMarketValue()+this.dividens;
    }

    public double getDividens() {
        return dividens;
    }

    public void setDividens(double dividens) {
        this.dividens = dividens;
    }
    
}
