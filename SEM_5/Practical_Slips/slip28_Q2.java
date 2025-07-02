import java.awt.*;
import java.awt.event.*;

class tempConvertor extends Frame{
    TextField tempfield1;
    TextField tempfield2;
    public tempConvertor()
    {
        setLayout(new GridLayout(3,2));

        Label templabel1=new Label("CELCIUS");
        Label templabel2=new Label("FAHRIENT");
        tempfield1=new TextField();
        tempfield2=new TextField();

        Button convert=new Button("Convert");
        Button clear=new Button("Clear");
        add(templabel1);
        add(tempfield1);
        add(templabel2);
        add(tempfield2);
        add(convert);
        add(clear);

        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                converttemp();
            }
        });

        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                clearfield();
            }
        });

        setVisible(true);
        setBounds(100,100,300,100);

    }

    
	public void converttemp()
	{
		double temp,temp1;
		
		if(!tempfield1.getText().isEmpty())
		{
			temp=Double.parseDouble(tempfield1.getText());
			temp1=(temp*9/5)+32; //C to F
			tempfield2.setText(String.format("%.1f",temp1));
		}
		else if(!tempfield2.getText().isEmpty())
		{
			temp=Double.parseDouble(tempfield2.getText());
			temp1=(temp-32)*5/9; //F to C
			tempfield1.setText(String.format("%.1f",temp1));
		}
		else
		{
			clearfield();
		}
	}

    public void clearfield()
    {
        tempfield1.setText("");
        tempfield2.setText("");
    }

    public static void main(String args[])
    {
        new tempConvertor();
    }
}