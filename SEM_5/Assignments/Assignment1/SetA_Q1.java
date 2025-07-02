public class SetA_Q1{
    int num;
    public SetA_Q1()
    {
    num=0;
    }
    public SetA_Q1(int num)
    {
        this.num = num;
    }
    public static void main(String[] args)
    {
        SetA_Q1 m1 = new SetA_Q1();
        if(args.length > 0)
        {
            int n = Integer.parseInt(args[0]);
            SetA_Q1 m2 = new SetA_Q1(n);
            System.out.println(m1.num);
            System.out.println(m2.num);
        }
        else
        System.out.println("Insufficient Arguments");
    }
}