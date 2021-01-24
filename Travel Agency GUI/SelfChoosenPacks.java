import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

public class SelfChoosenPacks extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label0, label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JComboBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    SelfChoosenPacks() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travel Agency");
        this.setSize(900, 480);
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
        imgLabel.setBounds(30, 65, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Select Tour Details");
        label1.setBounds(430, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // Tour Type
        label1 = new JLabel();
        label1.setText("Tour Type");
        label1.setBounds(430, 75, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb1Str = { "Choose tour type...", "International", "Domestic" };
        cb1 = new JComboBox(cb1Str);
        cb1.setBounds(580, 84, 250, 30);
        cb1.setSelectedIndex(0);
        cb1.setFont(f5);
        cb1.setBackground(Color.WHITE);
        c.add(cb1);

        // Country
        label0 = new JLabel();
        label0.setText("Destination");
        label0.setBounds(430, 110, 500, 50);
        label0.setFont(f4);
        c.add(label0);

        String[] cb2Str = { "Choose tour type first!" };
        cb2 = new JComboBox(cb2Str);
        cb2.setBounds(580, 119, 250, 30);
        cb2.setSelectedIndex(0);
        cb2.setFont(f5);
        cb2.setBackground(Color.WHITE);
        cb2.disable();
        c.add(cb2);

        // Person
        label1 = new JLabel();
        label1.setText("Person");
        label1.setBounds(430, 145, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb3Str = { "Total person number...", "1", "2", "3", "4", "5" };
        cb3 = new JComboBox(cb3Str);
        cb3.setBounds(580, 154, 250, 30);
        cb3.setSelectedIndex(0);
        cb3.setFont(f5);
        cb3.setBackground(Color.WHITE);
        c.add(cb3);

        // Days
        label1 = new JLabel();
        label1.setText("Total Days");
        label1.setBounds(430, 180, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb4Str = { "Number of days...", "1", "2", "3", "4", "5", "6", "7" };
        cb4 = new JComboBox(cb4Str);
        cb4.setBounds(580, 189, 250, 30);
        cb4.setSelectedIndex(0);
        cb4.setFont(f5);
        cb4.setBackground(Color.WHITE);
        c.add(cb4);

        // Hotel
        label1 = new JLabel();
        label1.setText("Hotel Type");
        label1.setBounds(430, 215, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb5Str = { "Select tour type first!" };
        cb5 = new JComboBox(cb5Str);
        cb5.setBounds(580, 224, 250, 30);
        cb5.setSelectedIndex(0);
        cb5.setFont(f5);
        cb5.setBackground(Color.WHITE);
        cb5.disable();
        c.add(cb5);

        // Travel By
        label1 = new JLabel();
        label1.setText("Travel By");
        label1.setBounds(430, 250, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb6Str = { "Select tour type first!" };
        cb6 = new JComboBox(cb6Str);
        cb6.setBounds(580, 259, 250, 30);
        cb6.setSelectedIndex(0);
        cb6.setFont(f5);
        cb6.setBackground(Color.WHITE);
        cb6.disable();
        c.add(cb6);

        // Vehicle Type
        label1 = new JLabel();
        label1.setText("Vehicle Type");
        label1.setBounds(430, 285, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb7Str = { "Select vehicle first!" };
        cb7 = new JComboBox(cb7Str);
        cb7.setBounds(580, 296, 250, 30);
        cb7.setSelectedIndex(0);
        cb7.setFont(f5);
        cb7.setBackground(Color.WHITE);
        cb7.disable();
        c.add(cb7);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(53, 355, 183, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(251, 355, 183, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn4 = new JButton("Reset");
        btn4.setBounds(450, 355, 183, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        c.add(btn4);

        btn3 = new JButton("Next");
        btn3.setBounds(649, 355, 183, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int s = cb1.getSelectedIndex();
                if (s == 0) {
                    label0.setText("Destination");
                    cb2.removeAllItems();
                    cb2.addItem("Choose tour type first!");
                    cb2.disable();
                    cb5.removeAllItems();
                    cb5.addItem("Select tour type first!");
                    cb5.disable();
                    cb6.removeAllItems();
                    cb6.addItem("Select tour type first!");
                    cb6.disable();
                    cb7.removeAllItems();
                    cb7.addItem("Select vehicle first!");
                    cb7.disable();
                } else if (s == 1) {
                    label0.setText("Country");
                    cb2.removeAllItems();
                    cb2.addItem("Select Country...");
                    cb2.addItem("Italy");
                    cb2.addItem("Germany");
                    cb2.addItem("Greece");
                    cb2.addItem("Indonesia");
                    cb2.addItem("South Africa");
                    cb2.enable();
                    cb5.removeAllItems();
                    cb5.addItem("Choose hotel type...");
                    cb5.addItem("Loduge ($50)");
                    cb5.addItem("Motel ($69)");
                    cb5.addItem("Local ($80)");
                    cb5.addItem("3 Star Hotel ($120)");
                    cb5.addItem("5 Star Hotel ($220)");
                    cb5.enable();
                    cb6.removeAllItems();
                    cb6.addItem("Airplane");
                    cb6.enable();
                    cb7.removeAllItems();
                    cb7.addItem("No different types available...");
                    cb7.enable();
                } else if (s == 2) {
                    label0.setText("Place");
                    cb2.removeAllItems();
                    cb2.addItem("Select Place...");
                    cb2.addItem("Cox's Bazar");
                    cb2.addItem("Sajek Valley ");
                    cb2.addItem("Sri Mongol");
                    cb2.addItem("Bandarban");
                    cb2.addItem("RangaMati");
                    cb2.addItem("Bandarban");
                    cb2.enable();
                    cb5.removeAllItems();
                    cb5.addItem("Choose hotel type...");
                    cb5.addItem("Loduge (2000 tk)");
                    cb5.addItem("Motel (3500 tk)");
                    cb5.addItem("Local (5000 tk)");
                    cb5.addItem("3 Star Hotel (8000 tk)");
                    cb5.addItem("5 Star Hotel (12000 tk)");
                    cb5.enable();
                    cb6.removeAllItems();
                    cb6.addItem("Travel By...");
                    cb6.addItem("Train");
                    cb6.addItem("Bus");
                    cb6.addItem("Airplane (12000 tk)");
                    cb6.enable();
                    cb7.removeAllItems();
                    cb7.addItem("Select vehicle first!");
                    cb7.enable();
                }
            }
        });

        cb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int s = cb6.getSelectedIndex();
                if (s == 0) {
                    cb7.removeAllItems();
                    cb7.addItem("Select vehicle First!");
                } else if (s == 1) {
                    cb7.removeAllItems();
                    cb7.addItem("Select train type...");
                    cb7.addItem("AC Sleeping Couch (750 tk)");
                    cb7.addItem("AC Seating Couch (520 tk)");
                    cb7.addItem("AC Train (440 tk)");
                    cb7.addItem("Non-AC Train (250 tk)");
                    cb7.enable();
                } else if (s == 2) {
                    cb7.removeAllItems();
                    cb7.addItem("Select bus type...");
                    cb7.addItem("AC Bus (2500 tk)");
                    cb7.addItem("Non-AC Bus (900 tk)");
                    cb7.enable();
                } else if (s == 3) {
                    cb7.removeAllItems();
                    cb7.addItem("No different types available...");
                }
            }
        });

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
                Packs frame = new Packs();
                frame.setVisible(true);
            }
        });

        // Reset Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                SelfChoosenPacks frame = new SelfChoosenPacks();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if ((cb1.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select tour type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb2.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select destination.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb3.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total person number.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb4.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total number of days.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb5.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select total hotel type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if (((cb1.getSelectedIndex()) == 2) && ((cb6.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "You forgot to select travel by.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if (((cb1.getSelectedIndex()) == 2) && ((cb6.getSelectedIndex()) != 3)
                        && ((cb7.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "You forgot to select Vehicle Type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    if ((cb1.getSelectedIndex()) == 1) {
                        int cb1Cost = 100;
                        int cb2Cost = 0;

                        if (cb2.getSelectedIndex() == 1) {
                            cb2Cost = 300;
                        } else if (cb2.getSelectedIndex() == 2) {
                            cb2Cost = 280;
                        } else if (cb2.getSelectedIndex() == 3) {
                            cb2Cost = 269;
                        } else if (cb2.getSelectedIndex() == 4) {
                            cb2Cost = 250;
                        } else if (cb2.getSelectedIndex() == 4) {
                            cb2Cost = 100;
                        }

                        int cb3Cost = 200 * (cb3.getSelectedIndex());
                        int cb5Cost = 0;

                        if (cb5.getSelectedIndex() == 1) {
                            cb5Cost = 50;
                        } else if (cb5.getSelectedIndex() == 2) {
                            cb5Cost = 69;
                        } else if (cb5.getSelectedIndex() == 3) {
                            cb5Cost = 80;
                        } else if (cb5.getSelectedIndex() == 4) {
                            cb5Cost = 120;
                        } else if (cb5.getSelectedIndex() == 5) {
                            cb5Cost = 220;
                        }

                        int cb4Cost = cb5Cost * cb4.getSelectedIndex();
                        int cb6Cost = 500;
                        int totalCost = cb1Cost + cb2Cost + cb3Cost + cb4Cost;

                        JOptionPane.showMessageDialog(null, "Total Cost : $" + totalCost, "Travel Agency!",
                                JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
                        Payment frame = new Payment();
                        frame.setVisible(true);

                    } else if ((cb1.getSelectedIndex()) == 2) {
                        int cb1Cost = 10000;
                        int cb2Cost = 0;

                        if (cb2.getSelectedIndex() == 1) {
                            cb2Cost = 7000;
                        } else if (cb2.getSelectedIndex() == 2) {
                            cb2Cost = 6000;
                        } else if (cb2.getSelectedIndex() == 3) {
                            cb2Cost = 5000;
                        } else if (cb2.getSelectedIndex() == 4) {
                            cb2Cost = 4000;
                        } else if (cb2.getSelectedIndex() == 5) {
                            cb2Cost = 3000;
                        } else if (cb2.getSelectedIndex() == 6) {
                            cb2Cost = 2800;
                        }

                        int cb3Cost = 2000 * (cb3.getSelectedIndex());
                        int cb5Cost = 0;

                        if (cb5.getSelectedIndex() == 1) {
                            cb5Cost = 2000;
                        } else if (cb5.getSelectedIndex() == 2) {
                            cb5Cost = 3500;
                        } else if (cb5.getSelectedIndex() == 3) {
                            cb5Cost = 5000;
                        } else if (cb5.getSelectedIndex() == 4) {
                            cb5Cost = 8000;
                        } else if (cb5.getSelectedIndex() == 4) {
                            cb5Cost = 12000;
                        }

                        int cb4Cost = cb5Cost * cb4.getSelectedIndex();
                        int cb7Cost = 0;

                        if (cb6.getSelectedIndex() == 1) {
                            if (cb7.getSelectedIndex() == 1) {
                                cb7Cost = 750;
                            } else if (cb7.getSelectedIndex() == 2) {
                                cb7Cost = 520;
                            } else if (cb7.getSelectedIndex() == 3) {
                                cb7Cost = 440;
                            } else if (cb7.getSelectedIndex() == 4) {
                                cb7Cost = 250;
                            }
                        } else if (cb6.getSelectedIndex() == 2) {
                            if (cb7.getSelectedIndex() == 1) {
                                cb7Cost = 2500;
                            } else if (cb7.getSelectedIndex() == 2) {
                                cb7Cost = 900;
                            }
                        } else if (cb6.getSelectedIndex() == 3) {
                            cb7Cost = 12000;
                        }

                        int totalCost = cb1Cost + cb2Cost + cb3Cost + cb4Cost + cb5Cost + cb7Cost;

                        JOptionPane.showMessageDialog(null, "Total Cost : " + totalCost + " tk", "Travel Agency!",
                                JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
                        Payment frame = new Payment();
                        frame.setVisible(true);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {

        SelfChoosenPacks frame = new SelfChoosenPacks();
        frame.setVisible(true);
    }
}
