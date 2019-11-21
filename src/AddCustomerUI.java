
package edu.auburn;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddCustomerUI extends JFrame {
    public JButton btnAdd = new JButton("Add");
    public JButton btnCancel = new JButton("Cancel");
    public JTextField txtCustomerID = new JTextField(20);
    public JTextField txtName = new JTextField(20);
    public JTextField txtPhone = new JTextField(20);
    public JTextField txtAddress = new JTextField(20);

    public AddCustomerUI() {
        this.setTitle("Add Customer");
        this.setSize(600, 400);
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), 3));
        String[] var10000 = new String[]{"CustomerID ", "Name ", "Phone Number ", "Address "};
        JPanel line1 = new JPanel(new FlowLayout());
        line1.add(new JLabel("CustomerID "));
        line1.add(this.txtCustomerID);
        this.getContentPane().add(line1);
        JPanel line2 = new JPanel(new FlowLayout());
        line2.add(new JLabel("Name "));
        line2.add(this.txtName);
        this.getContentPane().add(line2);
        JPanel line3 = new JPanel(new FlowLayout());
        line3.add(new JLabel("Phone Number "));
        line3.add(this.txtPhone);
        this.getContentPane().add(line3);
        JPanel line4 = new JPanel(new FlowLayout());
        line4.add(new JLabel("Address "));
        line4.add(this.txtAddress);
        this.getContentPane().add(line4);
        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(this.btnAdd);
        panelButtons.add(this.btnCancel);
        this.getContentPane().add(panelButtons);
    }
}