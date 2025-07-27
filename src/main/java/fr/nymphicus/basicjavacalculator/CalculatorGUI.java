package fr.nymphicus.basicjavacalculator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CalculatorGUI {

    private JFrame frame;

    public CalculatorGUI(){
        frame = new JFrame("CalculatorWindow");
        JButton b0_Button = new JButton("0");
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
    }

    public void show(){
        frame.setVisible(true);
    }

    public void main() {
        CalculatorGUI myCalculatorGUI = new CalculatorGUI();
        myCalculatorGUI.show();
    }
}
