import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Packs extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton defPacks, selfChosenPacks;
    private ButtonGroup jButtonGroup;
    private int pack = 0;

    Packs() {
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
        f1 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 30);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Choose Your Package");
        label1.setBounds(425, 40, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Type");
        label1.setBounds(425, 90, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        defPacks = new JRadioButton("Default Packs");
        defPacks.setBounds(445, 160, 300, 50);
        defPacks.setFont(f2);
        defPacks.setCursor(cursor);
        defPacks.setBackground(Color.decode("#F2F2F2"));
        c.add(defPacks);

        selfChosenPacks = new JRadioButton("Self-Chosen Packs");
        selfChosenPacks.setBounds(445, 220, 300, 50);
        selfChosenPacks.setFont(f2);
        selfChosenPacks.setCursor(cursor);
        selfChosenPacks.setBackground(Color.decode("#F2F2F2"));
        c.add(selfChosenPacks);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(defPacks);
        jButtonGroup.add(selfChosenPacks);

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
        defPacks.addActionListener(handler);
        selfChosenPacks.addActionListener(handler);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                Login frame = new Login();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (pack == 1) {
                    setVisible(false);
                    DefPackTypes frame = new DefPackTypes();
                    frame.setVisible(true);
                } else if (pack == 2) {
                    setVisible(false);
                    SelfChoosenPacks frame = new SelfChoosenPacks();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "You forgot to select package type :(", "Warming!!!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == defPacks) {
                pack = 1;
            } else if (e.getSource() == selfChosenPacks) {
                pack = 2;
            }
        }
    }

    public static void main(String[] args) {

        Packs frame = new Packs();
        frame.setVisible(true);
    }
}