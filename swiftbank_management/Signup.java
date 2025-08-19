package views;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton male, female, other, married, unmarried;
    JButton next;
    JTextField textName, textFname, textemail, textaddress, textcity, textpincode, textstate;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        //Personal Details label
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        //Name label
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        //Name field
        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        //Father's name label
        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        //Father's name field
        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        //Date of Birth
        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        //Calender for date of birth
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        //Gender label
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 14));
        male.setBackground(new Color(222, 255, 228));
        male.setBounds(300, 290, 60, 30);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        female.setBackground(new Color(222, 255, 228));
        female.setBounds(450, 290, 90, 30);
        add(female);

        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway", Font.BOLD, 14));
        other.setBackground(new Color(222, 255, 228));
        other.setBounds(650, 290, 90, 30);
        add(other);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);
        buttonGroup.add(other);

        //Email Address label
        JLabel email = new JLabel("Email address :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 390, 200, 30);
        add(email);

        //Email textfield
        textemail = new JTextField();
        textemail.setFont(new Font("Raleway", Font.BOLD, 14));
        textemail.setBounds(300, 390, 400, 30);
        add(textemail);

        //Marriage status
        JLabel marry = new JLabel("Marital Status :");
        marry.setFont(new Font("Raleway", Font.BOLD, 20));
        marry.setBounds(100, 440, 200, 30);
        add(marry);

        married = new JRadioButton("Married");
        married.setBounds(300, 440, 100, 30);
        married.setBackground(new Color(222, 255, 228));
        married.setFont(new Font("Raleway", Font.BOLD, 14));
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 440, 100, 30);
        unmarried.setBackground(new Color(222, 255, 228));
        unmarried.setFont(new Font("Raleway", Font.BOLD, 14));
        add(unmarried);

        ButtonGroup group = new ButtonGroup();
        group.add(married);
        group.add(unmarried);

        //Address
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 490, 200, 30);
        add(address);

        textaddress = new JTextField();
        textaddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textaddress.setBounds(300, 490, 400, 30);
        add(textaddress);

        //City
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 540, 200, 30);
        add(city);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway", Font.BOLD, 14));
        textcity.setBounds(300, 540, 400, 30);
        add(textcity);

        //Pincode
        JLabel pin = new JLabel("Pincode :");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 590, 200, 30);
        add(pin);

        textpincode = new JTextField();
        textpincode.setFont(new Font("Raleway", Font.BOLD, 14));
        textpincode.setBounds(300, 590, 400, 30);
        add(textpincode);

        //State
        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 640, 200, 30);
        add(state);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway", Font.BOLD, 14));
        textstate.setBounds(300, 640, 400, 30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Ralrway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Signup();

    }
}


