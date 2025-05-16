import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DegreesConverter extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton convertBtn;
    private JLabel celsius;
    private JLabel fahrenheit;

    double degreesCel, degreesFah;
    public DegreesConverter() {
        super("Degrees Converter");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 200;
        this.setSize(width,height);

        convertBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                degreesCel = Double.parseDouble(textField1.getText());
                degreesFah = (degreesCel*1.8000)+32;
                fahrenheit.setText(degreesCel + "°C equals " + degreesFah + "°F");
            }
        });
    }
}
