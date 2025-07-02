import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class CityCodeStorageApp extends JFrame {

    private Map<String, String> cityCodeMap;

    private JTextField cityNameField;
    private JTextField cityCodeField;

    public CityCodeStorageApp() {
        cityCodeMap = new HashMap<>();

        // Setting up the JFrame
        setTitle("City Code Storage");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creating components
        cityNameField = new JTextField(20);
        cityCodeField = new JTextField(10);

        JButton addButton = new JButton("Add City");
        JButton removeButton = new JButton("Remove City");
        JButton searchButton = new JButton("Search City");

        // Adding action listeners to buttons
        addButton.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                addCity();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeCity();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchCity();
            }
        });

        // Creating layout
        JPanel panel = new JPanel();
        panel.add(new JLabel("City Name: "));
        panel.add(cityNameField);
        panel.add(new JLabel("City Code: "));
        panel.add(cityCodeField);
        panel.add(addButton);
        panel.add(removeButton);
        panel.add(searchButton);

        // Setting layout for the JFrame
        getContentPane().add(panel);

        // Display the JFrame
        setVisible(true);
    }

    private void addCity() {
        String cityName = cityNameField.getText().trim();
        String cityCode = cityCodeField.getText().trim();

        if (!cityName.isEmpty() && !cityCode.isEmpty()) {
            if (!cityCodeMap.containsKey(cityName)) {
                cityCodeMap.put(cityName, cityCode);
                JOptionPane.showMessageDialog(this, "City added successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "City already exists. Please enter a different city name.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both City Name and City Code.");
        }

        clearFields();
    }

    private void removeCity() {
        String cityName = cityNameField.getText().trim();

        if (!cityName.isEmpty()) {
            if (cityCodeMap.containsKey(cityName)) {
                cityCodeMap.remove(cityName);
                JOptionPane.showMessageDialog(this, "City removed successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "City not found.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter City Name to remove.");
        }

        clearFields();
    }

    private void searchCity() {
        String cityName = cityNameField.getText().trim();

        if (!cityName.isEmpty()) {
            if (cityCodeMap.containsKey(cityName)) {
                String cityCode = cityCodeMap.get(cityName);
                JOptionPane.showMessageDialog(this, "City Code for " + cityName + ": " + cityCode);
            } else {
                JOptionPane.showMessageDialog(this, "City not found.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter City Name to search.");
        }

        clearFields();
    }

    private void clearFields() {
        cityNameField.setText("");
        cityCodeField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CityCodeStorageApp();
            }
        });
    }
}
