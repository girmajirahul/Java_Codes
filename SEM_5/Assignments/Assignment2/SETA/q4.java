import java.util.*;

class Nameformat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the full name:");

        String fullname=sc.nextLine();

        String[] names=fullname.split(" ");
        if(names.length==3){
            String fname=names[0];
            String Mname=names[1];
            String Lname=names[2];

           // Mname=Mname.substring(0,1).toUpperCase()+Mname.substring(1); 
           char capatilzedmiddlename=Character.toUpperCase(Mname.charAt(0));
            Mname=capatilzedmiddlename+Mname.substring(1);
            System.out.println("formated Name:"+Lname+"\t"+fname+"\t"+Mname);
        }
        else{
            System.out.println("Please Enter full name.");
        }

    }
} 