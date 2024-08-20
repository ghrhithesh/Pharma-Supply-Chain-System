import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DistributorModule extends JFrame {
    private JPanel distributorPanel;

    public DistributorModule() {
        setTitle("Distributor Module");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        distributorPanel = new JPanel();
        distributorPanel.setLayout(null);

        JLabel nameLabel = new JLabel("Distributor Name:");
        nameLabel.setBounds(50, 50, 150, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(200, 50, 200, 30);

        JLabel shipmentLabel = new JLabel("Shipment ID:");
        shipmentLabel.setBounds(50, 100, 150, 30);
        JTextField shipmentField = new JTextField();
        shipmentField.setBounds(200, 100, 200, 30);

        JButton verifyButton = new JButton("Verify Distributor");
        verifyButton.setBounds(50, 150, 150, 30);
        verifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String distributorName = nameField.getText();
                String shipmentId = shipmentField.getText();

                // Logic to verify distributor and shipment
                JOptionPane.showMessageDialog(distributorPanel, "Distributor verified successfully!");

                // Reset fields
                nameField.setText("");
                shipmentField.setText("");
            }
        });

        distributorPanel.add(nameLabel);
        distributorPanel.add(nameField);
        distributorPanel.add(shipmentLabel);
        distributorPanel.add(shipmentField);
        distributorPanel.add(verifyButton);

        add(distributorPanel);
        setVisible(true);
    }
}

