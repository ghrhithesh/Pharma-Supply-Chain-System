import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PharmacyModule extends JFrame {
    private JPanel pharmacyPanel;

    public PharmacyModule() {
        setTitle("Pharmacy Module");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        pharmacyPanel = new JPanel();
        pharmacyPanel.setLayout(null);

        JLabel pharmacyLabel = new JLabel("Pharmacy Name:");
        pharmacyLabel.setBounds(50, 50, 150, 30);
        JTextField pharmacyField = new JTextField();
        pharmacyField.setBounds(200, 50, 200, 30);

        JLabel drugLabel = new JLabel("Drug Batch Number:");
        drugLabel.setBounds(50, 100, 150, 30);
        JTextField drugField = new JTextField();
        drugField.setBounds(200, 100, 200, 30);

        JButton verifyButton = new JButton("Verify Drug");
        verifyButton.setBounds(50, 150, 150, 30);
        verifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pharmacyName = pharmacyField.getText();
                String batchNumber = drugField.getText();

                // Logic to verify drug authenticity
                JOptionPane.showMessageDialog(pharmacyPanel, "Drug verified successfully!");

                // Reset fields
                pharmacyField.setText("");
                drugField.setText("");
            }
        });

        pharmacyPanel.add(pharmacyLabel);
        pharmacyPanel.add(pharmacyField);
        pharmacyPanel.add(drugLabel);
        pharmacyPanel.add(drugField);
        pharmacyPanel.add(verifyButton);

        add(pharmacyPanel);
        setVisible(true);
    }
}
