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
public class SubtractListener implements ActionListener {

    private Calculator calculator;
    private JTextField output;
    private JTextField input;
    private JButton reset;

    public SubtractListener(Calculator calculator, JTextField output, JTextField input, JButton reset) {
        this.calculator = calculator;
        this.output = output;
        this.input = input;
        this.reset = reset;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.input.getText().matches(".*[a-zA-Z]+.*")) {
            this.input.setText("");
        } else {
            this.calculator.decrease(Integer.valueOf(this.input.getText()));
            this.output.setText(Integer.toString(this.calculator.totalValue()));
            this.input.setText("");
            if (Integer.valueOf(this.output.getText()) == 0) {
                this.reset.setEnabled(false);
            } else {
                this.reset.setEnabled(true);
            }
        }
    }

}
