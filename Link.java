/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Dorothy22
 */
public class Link {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();

//        LinkedList cars = new LinkedList();
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Toyota");
        cars.removeFirst();
        cars.removeLast();
        cars.addFirst("Matatu");
        cars.addLast("motorola");
        
         System.out.println(cars);

    }
    
}
