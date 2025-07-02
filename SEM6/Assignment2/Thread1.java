public class Thread1
{
    public static void main(String[] args){
        Thread t1=new Thread();
        System.out.println(t1);
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        t1.setName("First Thread");
        t1.setPriority(Thread.MIN_PRIORITY+1);
        System.out.println(t1);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.print(t1.isAlive());
    }
}