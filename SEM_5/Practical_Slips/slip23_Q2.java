import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CurrencyConvertor extends JFrame{

    JTextField field1,field2,field3;
    public CurrencyConvertor()
    {
        setLayout(new GridLayout(4,2));
       JLabel label1=new JLabel("Singapore dollars");
        JLabel label2=new JLabel("US dollars");
        JLabel label3=new JLabel("Euros ");

        field1=new JTextField(20);
        field2=new JTextField(20);
        field3=new JTextField(20);

        JButton convert=new JButton("Convert");
        JButton clear=new JButton("Clear");

        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(convert);
        add(clear);


        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                convertcurrency();
            }

        });

        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                clearfield();
            }
        });

        setVisible(true);
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Currency Convertor");
    }

    public void convertcurrency()
    {
        double amount,amount1,amount2;
		if(!field1.getText().isEmpty())
		{
			amount=Double.parseDouble(field1.getText());
			amount1=amount*1.41; //SGD to USD
			amount2=amount/0.65; //SGD to EUR
			field2.setText(String.format("%.2f",amount1));
			field3.setText(String.format("%.2f",amount2));
		}
		else if(!field2.getText().isEmpty())
		{
			amount=Double.parseDouble(field2.getText());
			amount1=amount*0.65; //USD to SGD
			amount2=amount/0.92; //USD to EUR
			field1.setText(String.format("%.2f",amount1));
			field3.setText(String.format("%.2f",amount2));
		}
		else if(!field3.getText().isEmpty())
		{
			amount=Double.parseDouble(field3.getText());
			amount1=amount*0.92; //EUR to SGD
			amount2=amount*1.09; //EUR to USD
			field1.setText(String.format("%.2f",amount1));
			field2.setText(String.format("%.2f",amount2));
		}
		else
		{
			clearfield();
		}
    }

    public void clearfield()
    {
        field1.setText("");
        field2.setText("");
        field3.setText("");
    }

    public static void main(String[] args)
    {
        new CurrencyConvertor();
    }
}