

import java.util.Scanner;

class CovidPositiveException extends Exception{
    public CovidPositiveException(String message)
    {
        super(message);
    }
}

class Patient{
    protected String name;
    protected int age;
    protected int oxy_level;
    protected int HRCT_report;

    public Patient(String name,int age,int oxy_level,int HRCT_report) throws CovidPositiveException
    {
        this.name=name;
        this.age=age;
        this.oxy_level=oxy_level;
        this.HRCT_report=HRCT_report;

        if(oxy_level < 95 && HRCT_report >10)
        {
            throw new CovidPositiveException("Patient need to be hospitilzed");
        }
    
    }

    public static void main(String[] args)
    {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Patient name:");
            String name=sc.next();
            System.out.print("Enter age:");
            int age=sc.nextInt();
            System.out.print("Enter oxygen level:");
            int oxylevel=sc.nextInt();
            System.out.print("Enter HRCT report:");
            int report=sc.nextInt();

            Patient p=new Patient(name,age,oxylevel,report);

            System.out.print(name+"\t"+age+"\t"+oxylevel+"\t"+report+"\t");


        }
        catch(CovidPositiveException e)
        {
            System.out.println("Error "+e.getMessage());
        }
    }
}