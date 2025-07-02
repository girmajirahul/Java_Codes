import javax.swing.*;
import java.awt.*;
class MyJframe extends JFrame{

    MyJframe()
    {
        
        setBounds(100,100,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My first jFrame");
       
        setVisible(true);

    }

    public static void main(String[] args)
    {
        MyJframe jf= new MyJframe();
    }
}