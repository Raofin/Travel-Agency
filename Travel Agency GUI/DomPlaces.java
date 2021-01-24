import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DomPlaces extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton place1, place2, place3, place4, place5;
    private ButtonGroup jButtonGroup;
    private int place = 0;

    DomPlaces() {
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
        label1.setText("Which Place Would You");
        label1.setBounds(430, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Like to Visit?");
        label1.setBounds(430, 60, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // Country JButtons
        place1 = new JRadioButton("Cox's Bazar");
        place1.setBounds(460, 100, 200, 50);
        place1.setFont(f2);
        place1.setBackground(Color.decode("#F2F2F2"));
        place1.setCursor(cursor);
        c.add(place1);

        place2 = new JRadioButton("Sajek Valley");
        place2.setBounds(460, 140, 200, 50);
        place2.setFont(f2);
        place2.setBackground(Color.decode("#F2F2F2"));
        place2.setCursor(cursor);
        c.add(place2);

        place3 = new JRadioButton("Sreemangal");
        place3.setBounds(460, 180, 200, 50);
        place3.setFont(f2);
        place3.setBackground(Color.decode("#F2F2F2"));
        place3.setCursor(cursor);
        c.add(place3);

        place4 = new JRadioButton("Bandarban");
        place4.setBounds(460, 220, 200, 50);
        place4.setFont(f2);
        place4.setBackground(Color.decode("#F2F2F2"));
        place4.setCursor(cursor);
        c.add(place4);

        place5 = new JRadioButton("Rangamati");
        place5.setBounds(460, 260, 200, 50);
        place5.setFont(f2);
        place5.setBackground(Color.decode("#F2F2F2"));
        place5.setCursor(cursor);
        c.add(place5);

        // To Group JButtons
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(place1);
        jButtonGroup.add(place2);
        jButtonGroup.add(place3);
        jButtonGroup.add(place4);
        jButtonGroup.add(place5);

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
        place1.addActionListener(handler);
        place2.addActionListener(handler);
        place3.addActionListener(handler);
        place4.addActionListener(handler);
        place5.addActionListener(handler);

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
                if (place == 1) {
                    setVisible(false);
                    DomesticCoxsBazar frame = new DomesticCoxsBazar();
                    frame.setVisible(true);
                } else if (place == 2) {
                    setVisible(false);
                    DomesticSajekValley frame = new DomesticSajekValley();
                    frame.setVisible(true);
                } else if (place == 3) {
                    setVisible(false);
                    DomesticSreemangal frame = new DomesticSreemangal();
                    frame.setVisible(true);
                } else if (place == 4) {
                    setVisible(false);
                    DomesticBandarban frame = new DomesticBandarban();
                    frame.setVisible(true);
                } else if (place == 5) {
                    setVisible(false);
                    DomesticRangamati frame = new DomesticRangamati();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select Place.", "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == place1) {
                place = 1;
            } else if (e.getSource() == place2) {
                place = 2;
            } else if (e.getSource() == place3) {
                place = 3;
            } else if (e.getSource() == place4) {
                place = 4;
            } else if (e.getSource() == place5) {
                place = 5;
            }
        }
    }

    public static void main(String[] args) {

        DomPlaces frame = new DomPlaces();
        frame.setVisible(true);
    }
}
