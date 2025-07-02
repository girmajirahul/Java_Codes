import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CityCode {
    HashMap <String,String> hashmap;
    JFrame frame;
    JTextField cityname,citycode;
   
    JButton AddCity,RemoveCity,SearchCity;
    public CityCode()
    {
        hashmap=new HashMap<String,String>();
       frame=new JFrame("City code");
       frame.setBounds(100,100,300,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cityname=new JTextField(20);
        citycode=new JTextField(20);
        AddCity=new JButton("Add");
        RemoveCity=new JButton("Remove");
        SearchCity=new JButton("Search");

        frame.add(new JLabel("Enter city name:"));
        frame.add(cityname);
        frame.add(new JLabel("Enter city code:"));
        frame.add(citycode);
        frame.add(AddCity);
        frame.add(RemoveCity);
        frame.add(SearchCity);
        

        AddCity.addActionListener(new ActionListener(){
          
            public void actionPerformed(ActionEvent e){
               
               addCity();
               // JOptionPane.showMessageDialog(frame,"Cleared.");
            }
        });

        SearchCity.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                searchcity();
            }
        });

        RemoveCity.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                removecity();
            }
        });

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
       
    }

    private void removecity(){
        String cname=cityname.getText();
        if(!cname.isEmpty()){
            hashmap.remove(cname);
            JOptionPane.showMessageDialog(frame, "City removed successfully.");
        }
    }

    private void searchcity(){
        String cname=cityname.getText();
        if(!cname.isEmpty()){
            String ccode = hashmap.get(cname);
            JOptionPane.showMessageDialog(frame, "City Code for " + cname + ": " + ccode);
        }
        else{
             JOptionPane.showMessageDialog(frame, "please enter city name. " );
        }
    }

     private void  addCity(){
        String cname=cityname.getText();
        String ccode=citycode.getText();
        if(!cname.isEmpty() && !ccode.isEmpty()){
            hashmap.put(cname,ccode);
            JOptionPane.showMessageDialog(frame,"City Added.");
        }
     }   
     private void clearFields() {
        cityname.setText("");
        citycode.setText("");
    }


    public static void main(String[] args){
        new CityCode();
    }
}
