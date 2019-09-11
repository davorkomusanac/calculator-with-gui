
import javax.swing.SwingUtilities;
import calculator.logic.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        SwingUtilities.invokeLater(new GraphicCalculator(calc));
    }
}
