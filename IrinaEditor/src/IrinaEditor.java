import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by mhcrnl on 11.08.2015. Tel:0722 27 07 96, emai: mhcrnl@gmail.com
 * Aplicatie de editare a textelor dezvoltata in java, cu InteliJ IDEA 14.1.4
 * 
 */
public class IrinaEditor extends JFrame {
    JFrame frame;

    public IrinaEditor() {
        initUI();
    }

    private void initUI() {

        createMenuBar();
        JPanel panel = new JPanel();

        JTextArea area = new JTextArea("text");
        area.setPreferredSize(new Dimension(400, 350));
        panel.add(area);
        add(panel);
        pack();

        setTitle("IRINA Editor");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("exit.png");

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem eMenuItem = new JMenuItem("Exit", icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        file.add(eMenuItem);
        menubar.add(file);
        setJMenuBar(menubar);

        //add(menubar);
        //menubar.setVisible(true);
        //frame.add(menubar);
    }
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                IrinaEditor ex = new IrinaEditor();
                ex.setVisible(true);
            }
        });
    }
}
