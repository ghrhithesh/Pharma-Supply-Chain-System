import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogisticsModule extends JFrame {
    private JPanel logisticsPanel;

    public LogisticsModule() {
        setTitle("Logistics Module");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        logisticsPanel = new JPanel();
        logisticsPanel.setLayout(null);

        JLabel shipmentLabel = new JLabel("Shipment ID:");
        shipmentLabel.setBounds(50, 50, 150, 30);
        JTextField shipmentField = new JTextField();
        shipmentField.setBounds(200, 50, 200, 30);

        JLabel locationLabel = new JLabel("Current Location:");
        locationLabel.setBounds(50, 100, 150, 30);
        JTextField locationField = new JTextField();
        locationField.setBounds(200, 100, 200, 30);

        JButton trackButton = new JButton("Update Location");
        trackButton.setBounds(50, 150, 150, 30);
        trackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String shipmentId = shipmentField.getText();
                String location = locationField.getText();

                // Logic to update the shipment location
                JOptionPane.showMessageDialog(logisticsPanel, "Location updated successfully!");

                // Reset fields
                shipmentField.setText("");
                locationField.setText("");
            }
        });

        logisticsPanel.add(shipmentLabel);
        logisticsPanel.add(shipmentField);
        logisticsPanel.add(locationLabel);
        logisticsPanel.add(locationField);
        logisticsPanel.add(trackButton);

        add(logisticsPanel);
        setVisible(true);
    }
}
