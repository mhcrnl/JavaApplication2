package layoutmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class FlowLayout extends JFrame {

    public FlowLayout() {
        initUI();

    }

    private void initUI() {
        JPanel panel= new JPanel();

        JTextArea area = new JTextArea("Text zona");
        area.setPreferredSize(new Dimension(100, 100));
        
        JButton button = new JButton("Buton");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        panel.add(button);

        JTree tree = new JTree();
        panel.add(tree);
        panel.add(area);

        add(panel);
        pack();

        setTitle("Fereastra layout flow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
}
