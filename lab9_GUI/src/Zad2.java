import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad2 extends JFrame{
    private JPanel panel1;
    private JTextField input1;
    private JButton button1;
    private JLabel label1;
    private JPanel forImg;
    private JButton setFont;
    private JButton iconButton;
    private JButton ClickKeyButton;
    private JLabel toCenter;
    private JButton resetButton;
    private JButton confirmButton;
    private JPanel panelForText;

    Font font = new Font("Serif", Font.BOLD | Font.ITALIC, 14);
    public Zad2() {
        super("All metods");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 400;
        this.setSize(width,height);
        resetButton.setEnabled(false);

        /// zdjecie
        ImageIcon ikona = new ImageIcon("img.jpg");
        Image obraz = ikona.getImage().getScaledInstance(50, 130, Image.SCALE_AREA_AVERAGING);
        ImageIcon zmniejszonaIkona = new ImageIcon(obraz);
        iconButton.setIcon(zmniejszonaIkona);

        ClickKeyButton.setMnemonic('a'); ///ALT + A

        input1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = input1.getText();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);
                button1.setBackground(Color.RED);
                label1.setText("Product sold out!");
                resetButton.setEnabled(true);
            }

        });
        button1.addActionListener(button1.getAction());
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(true);
                button1.setBackground(Color.GREEN);
                label1.setText("Product in stock!");
                resetButton.setEnabled(false);
            }

        });
        button1.removeActionListener(button1.getAction());

        setFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setFont(font);
            }
        });

        toCenter.setPreferredSize(new Dimension(200, 30));
        ClickKeyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toCenter.setHorizontalAlignment(SwingConstants.CENTER);
            }
        });

        input1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForText.removeAll();
                String textInput = input1.getText();
                JLabel labelNew = new JLabel("Text from input: " + textInput);
                panelForText.setLayout(new FlowLayout());
                panelForText.add(labelNew);
                panelForText.revalidate();
                panelForText.repaint();
            }
        });
    }
}
