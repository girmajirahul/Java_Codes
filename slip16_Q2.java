import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuExample{

    JFrame frame;
    public MenuExample(){
        frame = new JFrame("Menu");

        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("File");
        JMenu m2=new JMenu("Edit");
        JMenu m3=new JMenu("About");
        JMenuItem m11=new JMenuItem("New      Ctrl+N"); 
        JMenuItem m12=new JMenuItem("open");
        JMenuItem m13=new JMenuItem("Save");
        JCheckBoxMenuItem m14=new JCheckBoxMenuItem("Show About");
        JMenuItem m15=new JMenuItem("Exit");
        JMenuItem m21=new JMenuItem("Cut");
        JMenuItem m22=new JMenuItem("Copy");
        JMenuItem m23=new JMenuItem("paste");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        frame.setJMenuBar(mb);

        frame.setLayout(new FlowLayout());
        frame.setBounds(100,100,300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new MenuExample();
    }
}