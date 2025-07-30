package fr.nymphicus.basicjavacalculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

public class CalculatorGUI {

    private JFrame frame;
    private int columns = 5;
    private int rows = 4;
    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private Font font = new Font("Arial", Font.PLAIN, 16);
    private String display_string = "0";
    JPanel panel;

    public CalculatorGUI(){
        //Creation of the frame
        frame = new JFrame("CalculatorWindow");
        frame.setSize(400,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        setGridBagLayout();

        frame.add(panel, BorderLayout.NORTH);
        
    }

    public void show(){
        frame.setVisible(true);
    }

    private void setGridBagLayout(){
        layout = new GridBagLayout();
        panel = new JPanel(layout);
        constraints = new GridBagConstraints();

        //Horizontal Fill
        constraints.fill = GridBagConstraints.HORIZONTAL;

        //TextField
        JTextField calculator_screen = new JTextField(display_string);
        calculator_screen.setEditable(false);                               //Not editable
        calculator_screen.setHorizontalAlignment(JTextField.RIGHT);         //To the right
        calculator_screen.setFont(font);                                    //Use my font
        calculator_screen.setCaretColor(calculator_screen.getBackground()); //Invisible Caret
        constraints.insets = new Insets(20, 20, 0, 20);                     // Space beetweep top left bottom right
        constraints.fill = GridBagConstraints.HORIZONTAL;   //Horizontal fill
        constraints.gridx=0;                                //Start column 0
        constraints.gridy=0;                                //Start row 0
        constraints.gridwidth=columns;                      //Take all columns
        constraints.weightx=1;                              // Take all horizontal space
        constraints.ipady=20;                               // Pad height of component
        panel.add(calculator_screen,constraints);

        // 7 - 9
        constraints.gridy=1;
        constraints.gridwidth=1;
        for (int i = 1; i < 4; i++) {
            JButton nbButton7to9 = new JButton(String.valueOf(i+6));
            constraints.gridx=i-1;
            panel.add(nbButton7to9,constraints);
            // TO DO : Connect to event
        }

        // %
        JButton buttonDivision = new JButton("%");
        constraints.gridx=3;
        panel.add(buttonDivision,constraints);
        // TO DO : Connect to event

        // 4 - 6
        constraints.gridy=2;
        for (int i = 1; i < 4; i++) {
            JButton nbButton4to6 = new JButton(String.valueOf(i+3));
            constraints.gridx=i-1;
            panel.add(nbButton4to6,constraints);
            // TO DO : Connect to event
        }

        // X
        JButton buttonMultiplication = new JButton("X");
        constraints.gridx=3;
        panel.add(buttonMultiplication,constraints);
        // TO DO : Connect to event


        // 1 - 3
        constraints.gridy=3;
        for (int i = 1; i < 4; i++) {
            JButton nbButton1to3 = new JButton(String.valueOf(i));
            constraints.gridx=i-1;
            panel.add(nbButton1to3,constraints);
            // TO DO : Connect to event
        }

        // +
        JButton buttonSub = new JButton("-");
        constraints.gridx=3;
        panel.add(buttonSub,constraints);
        // TO DO : Connect to event

        // . 0 SQRT =
        constraints.gridy=4;

        // .
        JButton buttonComma = new JButton(".");
        constraints.gridx=0;
        panel.add(buttonComma,constraints);
        // TO DO : Connect to event

        // 0
        JButton buttonZero = new JButton("0");
        constraints.gridx=1;
        panel.add(buttonZero,constraints);
        // TO DO : Connect to event

        // = 
        JButton buttonEqual = new JButton("=");
        constraints.gridx=2;
        panel.add(buttonEqual,constraints);
        // TO DO : Connect to event

        // +
        JButton buttonAddition = new JButton("+");
        constraints.gridx=3;
        panel.add(buttonAddition,constraints);
        // TO DO : Connect to event


        // √
        JButton buttonSQRT = new JButton("√");
        constraints.gridx=1;
        constraints.gridy=5;
        panel.add(buttonSQRT,constraints);
        // TO DO : Connect to event
        
    }

    public void main() {
        CalculatorGUI myCalculatorGUI = new CalculatorGUI();
        myCalculatorGUI.show();
    }
}
