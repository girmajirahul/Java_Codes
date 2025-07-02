import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

class ProjectTableApp extends JFrame {
    private JTable table;

    public ProjectTableApp() {
        setTitle("Project Table");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);

        // Initialize the table
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Fetch data from the database and populate the table
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
            PreparedStatement statement = connection.prepareStatement("select * from emp;");
            ResultSet resultSet = statement.executeQuery();

            // Populate the table model
            DefaultTableModel tableModel = new DefaultTableModel();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }

            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(row);
            }

            table.setModel(tableModel);
        } catch (SQLException e) {
           System.out.println(e);
            JOptionPane.showMessageDialog(this, "Failed to fetch data from the database: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
      
        new ProjectTableApp();
    }
}
