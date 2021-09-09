import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.*;

public class swingdemo implements ActionListener {
    JButton button = new JButton("Click Me!");
    JTextField textField = new JTextField();
    JLabel label = new JLabel();
    
    public swingdemo() {
        JFrame frame = new JFrame();

        label.setBounds(100,300, 400, 100);
        label.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
        label.setLayout(null);

        textField.setBounds(100, 200, 300, 50);
        textField.setFont(new Font("Aerial", Font.PLAIN, 18));
        textField.setLayout(null);

        button.setBounds(100, 100, 150, 50);
        button.setFocusable(false);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        button.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));
        button.addActionListener(this);
        button.setLayout(null);

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.add(button);
        frame.add(textField);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new swingdemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            label.setText("Hey "+textField.getText());
        }
        
    }
}
