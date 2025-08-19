package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;
    Login(){
        super("Swift Bank");

        //Bank image
        JLabel bankimage = new JLabel(new ImageIcon(
                new ImageIcon(ClassLoader.getSystemResource("images/bank.png"))
                        .getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT)));
        bankimage.setBounds(350,10,100,100);
        add(bankimage);


        //Card image
        JLabel cardimage = new JLabel(new ImageIcon(
                new ImageIcon(ClassLoader.getSystemResource("images/card.png"))
                        .getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT)));
        cardimage.setBounds(630,350,100,100);
        add(cardimage);

        //Background
        JLabel backgroundimage = new JLabel(new ImageIcon(
                new ImageIcon(ClassLoader.getSystemResource("images/backbg.png"))
                        .getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT)));
        backgroundimage.setBounds(0,0,850,480);
        add(backgroundimage);

        //Welcome Text
        backgroundimage.add(new JLabel("WELCOME TO SWIFT BANK"){{
            setForeground(Color.WHITE);
            setFont(new Font("Algerian", Font.ITALIC, 35));
            setBounds(200, 125, 450, 40);
        }});

        // Card number label
        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(200,190,375,30);
        backgroundimage.add(label2);

        // Card number field
        textField2 = new JTextField(15);
        textField2.setBounds(340,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        backgroundimage.add(textField2);

        // PIN label
        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(200,250,375,30);
        backgroundimage.add(label3);

        // PIN field
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(340,250,230,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        backgroundimage.add(passwordField3);


        //Buttons
        button1 = createStyledButton("SIGN IN", 340, 300, 100, 30, new Color(46, 204, 113), backgroundimage); // Green
        button2 = createStyledButton("CLEAR", 470, 300, 100, 30, new Color(231, 76, 60), backgroundimage);   // Red
        button3 = createStyledButton("SIGN UP", 340, 350, 230, 30, new Color(52, 152, 219), backgroundimage); // Blue

        // Set starting positions (off-screen)
        for (JComponent comp : new JComponent[]{ textField2, passwordField3, button1, button2, button3 }) {
            comp.setLocation(comp.getX(), 600);
        }

        // Also move labels off-screen
        for (JComponent comp : new JComponent[]{ label2, label3 }) {
            comp.setLocation(comp.getX(), 600);
        }

        // Animate them into final positions
        animateComponent(label2, 200, 190, 10);       // Card No label
        animateComponent(textField2, 340, 190, 10);   // Card No textfield
        animateComponent(label3, 200, 250, 10);       // PIN label
        animateComponent(passwordField3, 340, 250, 10); // PIN field
        animateComponent(button1, 340, 300, 10);      // Sign In
        animateComponent(button2, 470, 300, 10);      // Clear
        animateComponent(button3, 340, 350, 10);      // Sign Up



        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    //  styled buttons
    private JButton createStyledButton(String text, int x, int y, int w, int h, Color bgColor, JComponent parent) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Arial", Font.BOLD, 14));
        btn.setForeground(Color.WHITE);
        btn.setBackground(bgColor);
        btn.setFocusPainted(false);  // Removes ugly focus border
        btn.setBorderPainted(false); // Flat style
        btn.setBounds(x, y, w, h);
        btn.addActionListener(this);

        // Hover effect (lighter shade on hover)
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(bgColor.brighter());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(bgColor);
            }
        });

        parent.add(btn);
        return btn;
    }

    // Smooth slide-up animation
    private void animateComponent(JComponent comp, int targetX, int targetY, int speed) {
        new javax.swing.Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point p = comp.getLocation();
                if (p.y > targetY) {
                    comp.setLocation(targetX, p.y - speed);
                } else {
                    comp.setLocation(targetX, targetY);
                    ((javax.swing.Timer) e.getSource()).stop();
                }
            }
        }).start();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource()== button1){

            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
    new Login();
    }
}
