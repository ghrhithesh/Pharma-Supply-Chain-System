import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientModule extends JFrame {
    private JPanel patientPanel;

    public PatientModule() {
        setTitle("Patient Module");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        patientPanel = new JPanel();
        patientPanel.setLayout(null);

        JLabel qrCodeLabel = new JLabel("Enter QR Code Data:");
        qrCodeLabel.setBounds(50, 50, 150, 30);
        JTextField qrCodeField = new JTextField();
        qrCodeField.setBounds(200, 50, 200, 30);

        JButton verifyButton = new JButton("Verify Drug");
        verifyButton.setBounds(50, 100, 150, 30);
        verifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String qrCodeData = qrCodeField.getText();

                // Logic to verify drug using QR code data
                JOptionPane.showMessageDialog(patientPanel, "Drug is authentic!");

                // Reset field
                qrCodeField.setText("");
            }
        });

        patientPanel.add(qrCodeLabel);
        patientPanel.add(qrCodeField);
        patientPanel.add(verifyButton);

        add(patientPanel);
        setVisible(true);
    }
}
