
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.GridLayout;
import calculator.actionlisteners.SumListener;
import calculator.actionlisteners.SubtractListener;
import calculator.actionlisteners.ResetListener;
import calculator.logic.Calculator;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private Calculator calculator;
    private JTextField output;
    private JTextField input;
    private JButton reset;

    public GraphicCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        output = new JTextField("0");
        output.setEnabled(false);

        input = new JTextField("");

        container.setLayout((new GridLayout(3, 1)));
        container.add(output);
        container.add(input);
        container.add(this.createPanel());
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        this.reset = new JButton("Z");
        ResetListener resetValue = new ResetListener(this.calculator, this.output, this.input, reset);
        reset.addActionListener(resetValue);
        reset.setEnabled(false);

        JButton sum = new JButton("+");
        SumListener countSum = new SumListener(this.calculator, this.output, this.input, this.reset);
        sum.addActionListener(countSum);

        JButton subtract = new JButton("-");
        SubtractListener reduceValue = new SubtractListener(this.calculator, this.output, this.input, this.reset);
        subtract.addActionListener(reduceValue);

        panel.add(sum);
        panel.add(subtract);
        panel.add(reset);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
