import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManufacturerModule extends JFrame {
    private JPanel manufacturerPanel;

    public ManufacturerModule() {
        setTitle("Manufacturer Module");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        manufacturerPanel = new JPanel();
        manufacturerPanel.setLayout(null);

        JLabel nameLabel = new JLabel("Drug Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);

        JLabel batchLabel = new JLabel("Batch Number:");
        batchLabel.setBounds(50, 100, 100, 30);
        JTextField batchField = new JTextField();
        batchField.setBounds(150, 100, 200, 30);

        JLabel compLabel = new JLabel("Composition:");
        compLabel.setBounds(50, 150, 100, 30);
        JTextField compField = new JTextField();
        compField.setBounds(150, 150, 200, 30);

        JButton addButton = new JButton("Add Drug");
        addButton.setBounds(50, 200, 150, 30);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String drugName = nameField.getText();
                String batchNumber = batchField.getText();
                String composition = compField.getText();

                // Logic to record this information, e.g., simulate saving to blockchain
                JOptionPane.showMessageDialog(manufacturerPanel, "Drug added successfully!");

                // Reset fields
                nameField.setText("");
                batchField.setText("");
                compField.setText("");
            }
        });

        manufacturerPanel.add(nameLabel);
        manufacturerPanel.add(nameField);
        manufacturerPanel.add(batchLabel);
        manufacturerPanel.add(batchField);
        manufacturerPanel.add(compLabel);
        manufacturerPanel.add(compField);
        manufacturerPanel.add(addButton);

        add(manufacturerPanel);
        setVisible(true);
    }
}
