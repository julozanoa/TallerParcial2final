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


public class Main {
    
    public static void descifrar(String código){
        String d = código;
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
                y = x+3;
            }
            System.out.print((char)y);
        }System.out.println("");
    }
    
    public static void main(String[] args) {
        
    }
}
