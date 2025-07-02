import java.util.*;
public class Cities {
   public static void main(String[] args){
    ArrayList arr=new ArrayList();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of cities:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        System.out.print("Enter city name:");
        String name=sc.next();
        arr.add(name);
        //arr.remove(name);
    }
    System.out.println(arr);
    System.out.println(arr.size());
    
    Iterator it=arr.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+"\t");
    }
    arr.clear();
    System.out.println(arr);
    
  }
}