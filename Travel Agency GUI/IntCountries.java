import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IntCountries extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton country1, country2, country3, country4, country5;
    private ButtonGroup jButtonGroup;
    private int country = 0;

    IntCountries() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travel Agency");
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 20);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Which Country Would");
        label1.setBounds(430, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);
        
        label1 = new JLabel();
        label1.setText("You Like to Visit?");
        label1.setBounds(430, 60, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // Country JButtons
        country1 = new JRadioButton("France");
        country1.setBounds(460, 100, 100, 50);
        country1.setFont(f2);
        country1.setBackground(Color.decode("#F2F2F2"));
        country1.setCursor(cursor);
        c.add(country1);

        country2 = new JRadioButton("Italy");
        country2.setBounds(460, 140, 200, 50);
        country2.setFont(f2);
        country2.setBackground(Color.decode("#F2F2F2"));
        country2.setCursor(cursor);
        c.add(country2);

        country3 = new JRadioButton("Greece");
        country3.setBounds(460, 180, 200, 50);
        country3.setFont(f2);
        country3.setBackground(Color.decode("#F2F2F2"));
        country3.setCursor(cursor);
        c.add(country3);

        country4 = new JRadioButton("South Africa");
        country4.setBounds(460, 220, 200, 50);
        country4.setFont(f2);
        country4.setBackground(Color.decode("#F2F2F2"));
        country4.setCursor(cursor);
        c.add(country4);

        country5 = new JRadioButton("Indonesia");
        country5.setBounds(460, 260, 200, 50);
        country5.setFont(f2);
        country5.setBackground(Color.decode("#F2F2F2"));
        country5.setCursor(cursor);
        c.add(country5);

        // To Group JButtons
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(country1);
        jButtonGroup.add(country2);
        jButtonGroup.add(country3);
        jButtonGroup.add(country4);
        jButtonGroup.add(country5);

        btn1 = new JButton("Exit");
        btn1.setBounds(90, 325, 215, 50);
        btn1.setFont(f3);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(340, 325, 215, 50);
        btn2.setFont(f3);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(590, 325, 215, 50);
        btn3.setFont(f3);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        Handler handler = new Handler();
        country1.addActionListener(handler);
        country2.addActionListener(handler);
        country3.addActionListener(handler);
        country4.addActionListener(handler);
        country5.addActionListener(handler);

        // Action Listener for JButtons
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                DefPackTypes frame = new DefPackTypes();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (country == 1) {
                    setVisible(false);
                    InternationalFrance frame = new InternationalFrance();
                    frame.setVisible(true);
                } else if (country == 2) {
                    setVisible(false);
                    InternationalItaly frame = new InternationalItaly();
                    frame.setVisible(true);
                } else if (country == 3) {
                    setVisible(false);
                    InternationalGreece frame = new InternationalGreece();
                    frame.setVisible(true);
                } else if (country == 4) {
                    setVisible(false);
                    InternationalSouthAfrica frame = new InternationalSouthAfrica();
                    frame.setVisible(true);
                } else if (country == 5) {
                    setVisible(false);
                    InternationalIndonesia frame = new InternationalIndonesia();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select country.", "Warming!!!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == country1) {
                country = 1;
            } else if (e.getSource() == country2) {
                country = 2;
            } else if (e.getSource() == country3) {
                country = 3;
            } else if (e.getSource() == country4) {
                country = 4;
            } else if (e.getSource() == country5) {
                country = 5;
            } 
        }
    }

    public static void main(String[] args) {

        IntCountries frame = new IntCountries();
        frame.setVisible(true);
    }
}
