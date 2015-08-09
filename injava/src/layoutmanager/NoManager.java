package layoutmanager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class NoManager extends JFrame {
    public NoManager() {
        initUI();
    }

    private void initUI() {
        setLayout(null);

        JButton ok = new JButton("Ok");
        ok.setBounds(50, 50, 80, 25);

        JButton close = new JButton("Close");
        close.setBounds(150, 50, 80, 25);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        add(ok);
        add(close);

        setTitle("Pozitionarea butoanelor fara layout");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
