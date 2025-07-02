class DisplayName extends Thread{
    public static void main(String[] args){
        System.out.println("Currnet Thread Name :"+Thread.currentThread().getName());
        System.out.println("Cureent Thread priority :"+Thread.currentThread().getPriority());
    }
}