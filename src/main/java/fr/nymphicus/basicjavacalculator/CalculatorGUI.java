package fr.nymphicus.basicjavacalculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class CalculatorGUI {

    private JFrame frame;
    private int columns = 3;
    private int rows = 4;

    public CalculatorGUI(){
        frame = new JFrame("CalculatorWindow");
        JButton b0_Button = new JButton("0");
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        //TO DO REPLACE WITH A GRIDBAGLAYOUT (https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html)

        JPanel panel = new JPanel(new GridLayout(rows,columns,10,10));
        //My buttons
        for (int i = 0; i < columns*rows; i++) {
            JButton button = new JButton(Integer.toString(i));
            panel.add(button);
            
        }

        frame.add(panel);
        
    }

    public void show(){
        frame.setVisible(true);
    }

    public void main() {
        CalculatorGUI myCalculatorGUI = new CalculatorGUI();
        myCalculatorGUI.show();
    }
}
