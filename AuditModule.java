import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuditModule extends JFrame {
    private JPanel auditPanel;

    public AuditModule() {
        setTitle("Audit Logs");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        auditPanel = new JPanel();
        auditPanel.setLayout(null);

        JLabel auditLabel = new JLabel("View Audit Logs:");
        auditLabel.setBounds(50, 50, 150, 30);
        JButton viewLogsButton = new JButton("View Logs");
        viewLogsButton.setBounds(200, 50, 150, 30);
        viewLogsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic to view and display audit logs
                JOptionPane.showMessageDialog(auditPanel, "Displaying audit logs...");

                // For demo purposes, simply show a message
                JTextArea logsArea = new JTextArea("Audit Log 1: Drug X created...\nAudit Log 2: Drug Y shipped...\n");
                JScrollPane scrollPane = new JScrollPane(logsArea);
                scrollPane.setBounds(50, 100, 500, 200);
                auditPanel.add(scrollPane);
            }
        });

        auditPanel.add(auditLabel);
        auditPanel.add(viewLogsButton);

        add(auditPanel);
        setVisible(true);
    }
}
