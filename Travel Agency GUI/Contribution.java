import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Contribution extends JFrame {

    private Container c;
    private ImageIcon icon, logo, welcome;
    private JLabel imgLabel;
    private Font f1;
    private JButton btn1, btn2, nBtn;
    private Cursor cursor;

    Contribution() {
        // Frame Layout
        this.setTitle("Travel Agency");
        this.setSize(540, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/Contribution.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(45, 20, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
        
        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("OK");
        btn1.setBounds(175, 580, 180, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Action Listener for JButtons
        // OK Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

        Contribution frame = new Contribution();
        frame.setVisible(true);
    }
}
