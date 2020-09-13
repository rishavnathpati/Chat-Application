import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JPanel upper_panel;

    Server() {

        upper_panel = new JPanel();
        upper_panel.setLayout(null);
        upper_panel.setBackground(new Color(7, 94, 84));
        upper_panel.setBounds(0, 0, 450, 70);
        add(upper_panel);

        // BACK BUTTON
        ImageIcon back_button = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        final Image i1 = back_button.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        back_button = new ImageIcon(i1);
        final JLabel back_button_label = new JLabel(back_button);
        back_button_label.setBounds(5, 17, 30, 30);
        upper_panel.add(back_button_label);// Adding image back_button above panel upper_panel
        back_button_label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(final MouseEvent ae)
            {
                System.exit(0);
            }
        });

        // PROFILE PICTURE
        ImageIcon profile_picture = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        final Image i2 = profile_picture.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        profile_picture = new ImageIcon(i2);
        final JLabel profile_picture_label = new JLabel(profile_picture);
        profile_picture_label.setBounds(40, 5, 60, 60);
        upper_panel.add(profile_picture_label);// Adding image profile_picture above panel upper_panel

        // NAME
        JLabel user_name = new JLabel("Rishav");
        user_name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        user_name.setForeground(Color.WHITE);
        user_name.setBounds(110, 15, 100, 18);
        upper_panel.add(user_name);// Adding image

        // STATUS
        final JLabel user_status = new JLabel("Active Now");
        user_status.setFont(new Font("SAN_SERIF", Font.PLAIN, 15));
        user_status.setForeground(Color.WHITE);
        user_status.setBounds(110, 35, 100, 20);
        upper_panel.add(user_status);

        setLayout(null);

        getContentPane().setBackground(Color.YELLOW);
        setSize(450, 700);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(final String[] args) {
        new Server().setVisible(true);

    }

}
