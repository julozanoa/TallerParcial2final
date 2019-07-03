
package TallerParcial2;
import java.util.*;
import java.io.*;


public class Main {
    
    public static String decodificar(String código){
        String d = código;
        String z = "";
        int y = 0;
        for (int i = 0; i < d.length(); i++) {
            int x = ((int)d.charAt(i));
            if (x==65) {
                y = 88;
            }else if(x==66){
                y = 89;
            }else if(x==67){
                y = 90;
            }else{
                y = x-3;
            }
            z += (char)y;
        }
        return z;
    }
    
    public static void main(String[] args) {
        
        ArrayList <Stock> stocks = new ArrayList <>();
        ArrayList <Cash> cashs = new ArrayList <>();
        ArrayList <DividentStock> divstocks = new ArrayList <>();
        ArrayList <MutualFund> mutualfunds = new ArrayList <>();
        
        File f = new File("datos.txt");
        
        if (f.exists()) {
            try{
                Scanner input = new Scanner(f);
                String[] Palabras;
                while(input.hasNextLine()){
                    Palabras = input.nextLine().split(",");
                    if(decodificar(Palabras[0]).equals("CASH")){
                        double a = Double.parseDouble(Palabras[1]);
                        Cash c = new Cash(a);
                        cashs.add(c);
                    }else if(decodificar(Palabras[0]).equals("DIVSTOCK")){
                        String s = decodificar(Palabras[1]);
                        double c = Double.parseDouble(Palabras[2]);
                        double t = Double.parseDouble(Palabras[3]);
                        int ts = Integer.parseInt(Palabras[4]);
                        double d = Double.parseDouble(Palabras[5]);
                        DividentStock ds = new DividentStock(d,ts,s,t,c);
                        divstocks.add(ds);
                    }else if(decodificar(Palabras[0]).equals("STOCK")){
                        String s = decodificar(Palabras[1]);
                        double c = Double.parseDouble(Palabras[2]);
                        double t = Double.parseDouble(Palabras[3]);
                        int ts = Integer.parseInt(Palabras[4]);
                        Stock k = new Stock(ts,s,t,c);
                        stocks.add(k);
                    }                   
                }
            }catch(FileNotFoundException ex){
                
            }
        
        }
        
        if (stocks.size()> 0) {
            
        
        for (int i = 0; i < stocks.size(); i++) {
            
            System.out.println("Stocks:"); 
            System.out.println("symbol: " + stocks.get(i).getSymbol());
            System.out.println("total shares: " + stocks.get(i).getTotalShares());
            System.out.println("total cost: " + stocks.get(i).getTotalCost());
            System.out.println("current price: " + stocks.get(i).getCurrentPrice());
            System.out.println("market value: " + stocks.get(i).getMarketValue());
            System.out.println("profit: " + stocks.get(i).getProfit());
        }
        }
        if (divstocks.size()> 0) {
            
        
        for (int i = 0; i < divstocks.size(); i++) {
            
            System.out.println("divident Stocks:"); 
            System.out.println("simbol: " + divstocks.get(i).getSymbol());
            System.out.println("total shares: " + divstocks.get(i).getTotalShares());
            System.out.println("total cost: " + divstocks.get(i).getTotalCost());
            System.out.println("current price: " + divstocks.get(i).getCurrentPrice());
            System.out.println("market value: " + divstocks.get(i).getMarketValue());
            System.out.println("proft: " + divstocks.get(i).getProfit());
            System.out.println("dividends " + divstocks.get(i).getDividens());
        }
        
        
    }
        
        if (mutualfunds.size()> 0) {
            
        
        for (int i = 0; i < mutualfunds.size(); i++) {
            
            System.out.println("mutual funds:"); 
            System.out.println("simbol: " + mutualfunds.get(i).getSymbol());
            System.out.println("total shares: " + mutualfunds.get(i).getTotalShares());
            System.out.println("total cost: " + mutualfunds.get(i).getTotalCost());
            System.out.println("current price: " + mutualfunds.get(i).getCurrentPrice());
            System.out.println("market value: " + mutualfunds.get(i).getMarketValue());
            System.out.println("proft: " + mutualfunds.get(i).getProfit());
            
        }
        
        
    }
        
        if (cashs.size()>1) {
            
            for (int i = 0; i < cashs.size(); i++) {
                System.out.println("cash:");
                System.out.println("amoun: " + cashs.get(i).getAmoun());
                System.out.println("market value "+ cashs.get(i).getMarketValue());
                System.out.println("profit" + cashs.get(i).getProfit());
            }
            
        }
        double stotalgoogle= 0;
        double dstotalgoogle= 0;
        double stotalsamsumg= 0;
        double dstotalsamsumg= 0;
        
        if (stocks.size()>0) {
            for (int i = 0; i < stocks.size(); i++) {
                if (stocks.get(i).getSymbol().equals("GOOGLE")) {
                    stotalgoogle = stotalgoogle + stocks.get(i).getMarketValue();
                }
                if (stocks.get(i).getSymbol().equals("SAMSUNG")) {
               
                    stotalsamsumg = stotalsamsumg + stocks.get(i).getMarketValue();
                }
            }
            
            System.out.println("valor total en el mercado stocks con el simbolo GOOGLE: " + stotalgoogle);
            System.out.println("valor total en el mercado stocks con el simbolo SAMSUMG: " + stotalsamsumg);
        }
        
        if (divstocks.size()>0) {
            for (int i = 0; i < divstocks.size(); i++) {
                if (divstocks.get(i).getSymbol().equals("GOOGLE")) {
                    dstotalgoogle = dstotalgoogle + divstocks.get(i).getMarketValue();
                }
                if (stocks.get(i).getSymbol().equals("SAMSUNG")) {
               
                    dstotalsamsumg = dstotalsamsumg + divstocks.get(i).getMarketValue();
                }
            }
            
            System.out.println("valor total en el mercado dividentstocks con el simbolo GOOGLE: " + dstotalgoogle);
            System.out.println("valor total en el mercado dividentstocks con el simbolo SAMSUMG: " + dstotalsamsumg);
        }
        double stotalvm = 0;
        double stotalb = 0 ;
        double dstotalvm = 0;
        double dstotalb = 0 ;
        double ctotalvm = 0;
        double ctotalb = 0 ;
        double mtotalvm = 0;
        double mtotalb = 0 ;
        
        if(stocks.size()>0){
            for (int i = 0; i < stocks.size(); i++) {
                stotalvm = stotalvm + stocks.get(i).getMarketValue();
                stotalb = stotalb + stocks.get(i).getProfit();
            }
        }
        if(divstocks.size()>0){
            for (int i = 0; i < divstocks.size(); i++) {
                dstotalvm = stotalvm + divstocks.get(i).getMarketValue();
                dstotalb = stotalb + divstocks.get(i).getProfit();
            }
        }
        
        if(cashs.size()>0){
            for (int i = 0; i < cashs.size(); i++) {
                ctotalvm = stotalvm + cashs.get(i).getMarketValue();
                ctotalb = stotalb + cashs.get(i).getProfit();
            }
        }
        if(mutualfunds.size()>0){
            for (int i = 0; i < mutualfunds.size(); i++) {
                mtotalvm = stotalvm + mutualfunds.get(i).getMarketValue();
                mtotalb = stotalb + mutualfunds.get(i).getProfit();
            }
        }
        
        System.out.println("valor mercado de todos los stocks :" + stotalvm);
        System.out.println("beneficios de todos los stocks: " + stotalb);
        System.out.println("valor mercado de todos los divident stocks: " + dstotalvm);
        System.out.println("beneficios de todos los divident stocks: " + dstotalb);
        System.out.println("valor mercado de todos los cash: " + ctotalvm);
        System.out.println("beneficios de todos los cash: " + ctotalb);
        System.out.println("valor mercado de todos los mutual found: " + mtotalvm);
        System.out.println("beneficios de todos los mutual found: " + mtotalb);
        
        
 
}
    
}
    
