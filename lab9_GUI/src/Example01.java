import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Example01 extends JFrame{


    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JLabel textInputLabel;
    private JButton dataButon;
    private JButton wyjscieButton;
    private JLabel dataLabel;

    public Example01(){
        super("Moje pierwsze GUI");
        this.setContentPane(this.panel1); /// JPanel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width,height);
        ///this.pack();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = JOptionPane.showInputDialog("Podaj imie: ");
                ///JOptionPane.showMessageDialog(null, "Witaj " + text);
                JOptionPane.showMessageDialog(null, "Witaj " + text, "Tytu", JOptionPane.WARNING_MESSAGE);
                int a = JOptionPane.showConfirmDialog(null, "Wpisano dane: " + text, "To jest moje okno", JOptionPane.YES_NO_OPTION);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textInputLabel.setText("Dziś jest środa");
            }
        });
        dataButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataLabel.setText(new Date().toString());
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}

