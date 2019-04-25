package sorayamaqueda;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.Scanner;

public class BMI extends JFrame {

    //Constructor
    public BMI(){
        //Settings
        /*this.setTitle("BMI Calculator");
        this.setSize(600,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());*/
        JFrame Calculator = new JFrame("BMI Calculator");
        Calculator.setLayout(new BorderLayout());
        Calculator.setSize(600, 350);
        Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calculator.setLocationRelativeTo(null);
        JLabel Welcome = new JLabel("Welcome to your BMI Calculator");


        //Textfields for obtaining the data.
        JTextField Weight = new JTextField("Weight in Kg");
        JTextField Height = new JTextField("Height in cm");


        JPanel Data = new JPanel();
        Data.setLayout(new GridLayout(2,2));

        //Method for performing calculation
        /*int w = Integer.parseInt(Weight.getText());
        int h = Integer.parseInt(Height.getText());
        double BMI = w / (h * h);*/

        //Button for calculation
        JButton Calculate = new JButton("Calculate");
        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int w = Integer.parseInt(Weight.getText());
                int h = Integer.parseInt(Height.getText());
                double BMI = w / (h * h);
                JLabel BMIResult = new JLabel("Your BMI is: " + BMI) ;
            }
        });

        //Button for closing the window
        JButton Exit = new JButton("Exit");


        //Adding the button to the frame.
        Calculator.add(Calculate);
        Calculator.add(Exit);

        //Adding Text components to the frame
        Calculator.add(Weight);
        Calculator.add(Height);
        Calculator.add(Welcome);

        this.add(Weight, BorderLayout.WEST);
        this.add(Height, BorderLayout.WEST);
        this.add(Calculate, BorderLayout.SOUTH);
        this.add(Exit, BorderLayout.NORTH);
        this.add(Data, BorderLayout.CENTER);
        this.add(Welcome, BorderLayout.NORTH);

        this.setVisible(true);
    }

}
