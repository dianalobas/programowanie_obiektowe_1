import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame{
    private JPanel panel1;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JButton wyjscieButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel wynikLb;

    double valueA, valueB, score;
    public Kalkulator() {
        super("Moje pierwsze GUI");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width,height);

        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                score = valueA + valueB;
                wynikLb.setText("Suma " + String.valueOf(valueA) + " + " + String.valueOf(valueB) + " = " + String.valueOf(score));
                textField1.setText("");
                textField2.setText("");
            }
        });
    }
}
