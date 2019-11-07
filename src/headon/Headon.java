/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package headon;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author fredriksellgren
 */
public class Headon {

    /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
        Friends p1 = new Friends("Martin");
        Friends p2 = new Friends("Fredrik");
        
        ArrayList<Friends> myList = new ArrayList<>();
        myList.add(p1);
        myList.add(p2);
        Iterator<Friends>personIterator = myList.iterator();
        while(personIterator.hasNext()){
            System.out.println(personIterator.next().toString());
        }

        
        
        System.out.println("Name " + p1.getName());
        System.out.println("Name " + p2.getName());
        if(p1.equals(p2)){
            System.out.println("De är lika");
        }else{
            System.out.println("De är olika");
        }
    }
    
}
