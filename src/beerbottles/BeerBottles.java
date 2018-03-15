/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beerbottles;

/**
 *
 * @author stuti
 */
public class BeerBottles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i;
        for(i=99;i>0;i--){
            System.out.printf("%d Bottles of beer on the wall,"
                    + "if one falls...%d bottles of beer on the wall\n",i,i-1);
        }
    }
    
}
