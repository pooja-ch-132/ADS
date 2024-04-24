/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistdemo;
import java.util.*;
/**
 *
 * @author Poojitha
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emp e1 = new Emp(111, "ratan");
       Student s1 = new Student(222, "xxx");
       ArrayList al = new ArrayList();
       al.add(10);
       al.add('a');
       al.add(e1);
       al.add(e1);
       al.add(s1);
       System.out.println(al);
       System.out.println(al.String());
        // TODO code application logic here
    }
    
}
