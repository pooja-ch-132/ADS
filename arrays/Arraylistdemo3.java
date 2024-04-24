/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistdemo3;
import java.util.ArrayList;
/**
 *
 * @author Poojitha
 */
public class Arraylistdemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("ratan");
        al.add("anu");
        al.add('a');
        al.add(10);
        al.add(null);
        System.out.println("ArrayList data=" +al);
        System.out.println("ArrayList size-->" +al.size());
        al.add(1,"Al");
        System.out.println("after adding objects ArrayList size-->" + al.size());
        System.out.println("ArrayList Data=" +al);
        al.remove(1);
        al.remove("A");
        System.out.println("after removing elements arrayList size " +al.size());
        System.out.println("ArrayList data=" +al);
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
        // TODO code application logic here
    }
    
}
