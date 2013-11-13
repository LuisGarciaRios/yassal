/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.ArrayList;


/**
 *
 * @author chubi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearch bsa = new BinarySearch();
        ArrayList list = new ArrayList();
        list.add(1);//pos 0
        list.add(3);//pos 1
        list.add(4);//pos 2
        list.add(7);//pos 3
        list.add(8);//pos 4
        list.add(10);//pos 5
        list.add(14);//pos 6
        list.add(17);//pos 7
        list.add(18);//pos 8
        list.add(19);//pos 9
        list.add(23);//pos 10
        list.add(24);//pos 11
        list.add(29);//pos 12
        
        int search = 23;
        System.out.println("Posicion del número "+search+" es "+bsa.SearchWithBSA(list, search, 0, list.size(), (list.size()+0)/2));
    }
}
