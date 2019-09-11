/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.actionlisteners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import calculator.logic.Calculator;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author Davor
 */
public class ResetListener implements ActionListener {

    private Calculator calculator;
    private JTextField output;
    private JTextField input;
    private JButton reset;

    public ResetListener(Calculator calculator, JTextField output, JTextField input, JButton reset) {
        this.calculator = calculator;
        this.output = output;
        this.input = input;
        this.reset = reset;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.reset();
        this.output.setText("0");
        this.input.setText("");
        this.reset.setEnabled(false);
    }
}
