import java.io.*;
import java.util.*;

class LinkedListTest{
    public static void main(String[] args)
    {
        LinkedList li=new LinkedList();
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.print("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Element to add:");
                    String ele=sc.next();
                    li.add(ele);
                    break;
                case 2:
                    if(!li.isEmpty()){
                         li.removeFirst();
                        System.out.println("Element Deleted Successfully.");
                    }
                    else{
                        System.out.println("Unable to delete.");
                    }
                    break;
                case 3:
                    if(!li.isEmpty()){
                         ListIterator i=li.listIterator(li.size());
                        while(i.hasPrevious()){
                            System.out.println(" "+i.previous());
                        }
                    }
                    else{
                        System.out.println("List is Empty.");
                    }
                    break;
                case 4:System.exit(0);
            }
       }
    } 
}