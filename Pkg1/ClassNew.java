package Pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class A 
{ 
   void display() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
} 
  
class ClassNew 
{ 
public static void main(String args[]) 
    { 
        A obj = new A(); 
        // Trying to access private method
        // of another class 
       // obj.display(); 
        
        int Ques[]= new int[5];
        //Collections col=new Collections();
        
        List<Integer> arr=new ArrayList<Integer>();
      //  Collections col=new Collections();
        arr.add(45);
        arr.add(22);
        //arr.add();
       // arr.add(null);
        arr.add(76);
       arr.add(55);
        System.out.println("The minimum in list is "+Collections.max(arr));
        //Iterator itr= arr.iterator();
        
      /*  while(itr.hasNext())
        {
        	
        	System.out.println(itr.next());
        }*/
        
        
        Set<String> str=new HashSet<String>();
        
        str.add("1234");
        str.add("How r u");
        
        
        Iterator itr1= str.iterator();
        while(itr1.hasNext())
        {
        	
        	System.out.println(itr1.next());
        }
        
    } 



}
