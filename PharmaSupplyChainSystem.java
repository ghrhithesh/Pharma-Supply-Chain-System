import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PharmaSupplyChainSystem extends JFrame {
    private JPanel mainPanel;

    public PharmaSupplyChainSystem() {
        setTitle("Pharma Supply Chain System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        JButton manufacturerButton = new JButton("Manufacturer Module");
        manufacturerButton.setBounds(50, 100, 200, 50);
        manufacturerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ManufacturerModule();
            }
        });

        JButton distributorButton = new JButton("Distributor Module");
        distributorButton.setBounds(300, 100, 200, 50);
        distributorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DistributorModule();
            }
        });

        JButton logisticsButton = new JButton("Logistics Module");
        logisticsButton.setBounds(550, 100, 200, 50);
        logisticsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LogisticsModule();
            }
        });

        JButton pharmacyButton = new JButton("Pharmacy Module");
        pharmacyButton.setBounds(50, 200, 200, 50);
        pharmacyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PharmacyModule();
            }
        });

        JButton patientButton = new JButton("Patient Module");
        patientButton.setBounds(300, 200, 200, 50);
        patientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PatientModule();
            }
        });

        JButton auditButton = new JButton("Audit Logs");
        auditButton.setBounds(550, 200, 200, 50);
        auditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AuditModule();
            }
        });

        mainPanel.add(manufacturerButton);
        mainPanel.add(distributorButton);
        mainPanel.add(logisticsButton);
        mainPanel.add(pharmacyButton);
        mainPanel.add(patientButton);
        mainPanel.add(auditButton);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PharmaSupplyChainSystem();
    }
}
