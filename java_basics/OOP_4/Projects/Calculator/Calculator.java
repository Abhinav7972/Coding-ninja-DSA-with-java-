
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/** A simple four-function desktop calculator. */
public class Calculator extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private final JTextField display = new JTextField("0");
    private double storedValue;
    private String pendingOperator;
    private boolean startNewNumber = true;

    private static final String[] BUTTONS = {
        "C", "+/-", "÷", "×", "7", "8", "9", "−", "4", "5", "6", "+",
        "1", "2", "3", "=", "0", "."
    };

    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 460);
        setResizable(false);
        setLocationByPlatform(true);

        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
        display.setBorder(BorderFactory.createEmptyBorder(15, 12, 15, 12));
        add(display, BorderLayout.NORTH);

        JPanel keypad = new JPanel(new GridLayout(5, 4, 6, 6));
        keypad.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        for (String label : BUTTONS) {
            JButton button = new JButton(label);
            button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
            button.addActionListener(this);
            keypad.add(button);
        }
        keypad.add(new JPanel());
        keypad.add(new JPanel());
        add(keypad, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (command.matches("[0-9]")) appendDigit(command);
        else if (".".equals(command)) appendDecimalPoint();
        else if ("C".equals(command)) clear();
        else if ("+/-".equals(command)) toggleSign();
        else if ("=".equals(command)) {
            calculatePendingOperation();
            pendingOperator = null;
            startNewNumber = true;
        } else chooseOperation(command);
    }

    private void appendDigit(String digit) {
        if (startNewNumber || "Error".equals(display.getText())) {
            display.setText(digit);
            startNewNumber = false;
        } else if (!"0".equals(display.getText())) display.setText(display.getText() + digit);
        else display.setText(digit);
    }

    private void appendDecimalPoint() {
        if (startNewNumber || "Error".equals(display.getText())) {
            display.setText("0.");
            startNewNumber = false;
        } else if (!display.getText().contains(".")) display.setText(display.getText() + ".");
    }

    private void toggleSign() {
        if (!"0".equals(display.getText()) && !"Error".equals(display.getText())) {
            display.setText(display.getText().startsWith("-") ? display.getText().substring(1) : "-" + display.getText());
        }
    }

    private void chooseOperation(String operator) {
        if (pendingOperator != null && !startNewNumber) calculatePendingOperation();
        else storedValue = currentValue();
        pendingOperator = operator;
        startNewNumber = true;
    }

    private void calculatePendingOperation() {
        if (pendingOperator == null || "Error".equals(display.getText())) return;
        double currentValue = currentValue();
        switch (pendingOperator) {
            case "+": storedValue += currentValue; break;
            case "−": storedValue -= currentValue; break;
            case "×": storedValue *= currentValue; break;
            case "÷":
                if (currentValue == 0) {
                    display.setText("Error");
                    pendingOperator = null;
                    return;
                }
                storedValue /= currentValue;
                break;
            default: return;
        }
        display.setText(format(storedValue));
    }

    private double currentValue() { return Double.parseDouble(display.getText()); }

    private String format(double value) {
        return value == Math.rint(value) ? Long.toString((long) value) : Double.toString(value);
    }

    private void clear() {
        storedValue = 0;
        pendingOperator = null;
        display.setText("0");
        startNewNumber = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator().setVisible(true));
    }
}
