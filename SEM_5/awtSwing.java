import java.awt.*;

class MyFrame extends Frame{

    MyFrame(){
        
        setTitle("My first frame");
        setBounds(100,100,400,400);
       // setDefaultOperation(Frame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String args[])
    {
        MyFrame f =new MyFrame();
    }
}