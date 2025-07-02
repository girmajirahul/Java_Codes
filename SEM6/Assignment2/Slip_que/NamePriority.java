//Program to display name and priority of a thread

public class NamePriority 
{
    public static void main(String[] args)
    {
        Thread t1=new Thread();
        System.out.print("Thread: ");
        System.out.println(t1);

        System.out.print("Name of the Thread: ");
        System.out.println(t1.getName());

        System.out.print("Priority of the Thread: ");
        System.out.println(t1.getPriority());
        
    }
}
