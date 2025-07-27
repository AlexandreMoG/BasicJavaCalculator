package fr.nymphicus.basicjavacalculator;

import java.util.Arrays;

import org.omg.PortableInterceptor.NON_EXISTENT;

public class Main {

    public static void main(String[] args) {
        if (args != null && args.length > 0) {
            if (args[0].contains("console")) {
                //Console
                System.out.println("Console mode !");
                Application app = new Application();
                app.run();
                return;
            }
        }
        //GUI
        CalculatorGUI app = new CalculatorGUI();
        app.main();
        return;
        
    }
}