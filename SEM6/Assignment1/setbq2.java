import java.util.*;

public class setbq2{
  public static void main(String[] args){
    HashMap hashmap =new HashMap();
    hashmap.put("Amit",101);
    hashmap.put("Anil",102);
    hashmap.put("Karan",103);

    System.out.println(hashmap);

    TreeMap ts=new TreeMap();
    ts.putAll(hashmap);
    System.out.println(ts);
    
  }
}