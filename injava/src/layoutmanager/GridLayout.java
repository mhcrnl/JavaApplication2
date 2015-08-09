package layoutmanager;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.*;
import java.util.Date;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class GridLayout extends JFrame {
    public GridLayout() {
        initUI();
    }

    private void initUI() {

        createMenuBar();

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(6, 2, 2, 2));

        JLabel iarbuc = new JLabel("Index apa rece bucatarie: ");
        panel.add(iarbuc);

        JTextField iarbuct = new JTextField();
        panel.add(iarbuct);

        JLabel iacbuc = new JLabel("Index Apa calda bucatarie: ");
        panel.add(iacbuc);
        JTextField iacbuct = new JTextField();
        panel.add(iacbuct);

        JLabel iarbai = new JLabel("Index Apa rece baie: ");
        panel.add(iarbai);
        JTextField iarbait = new JTextField();
        panel.add(iarbait);

        JLabel iacbai = new JLabel("Index Apa calda baie: ");
        panel.add(iacbai);
        JTextField iacbait = new JTextField();
        panel.add(iacbait);

        JLabel gaze = new JLabel("Index gaze: ");
        panel.add(gaze);
        JTextField gazet = new JTextField();
        panel.add(gazet);

        JButton quit = new JButton("Quit");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        panel.add(quit);

        JButton save = new JButton("Save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Date date = new Date();
                System.out.println(date.toString());
                System.out.println("Index apa rece bucatarie: " + iarbuct.getText() +
                    "\nIndex apa calda bucatarie: " + iacbuct.getText() +
                    "\nIndex apa rece baie: " + iarbait.getText() +
                    "\nIndex apa calda baie: " + iacbait.getText() +
                    "\nIndex gaze: " + gazet.getText());
                String a = iarbuct.getText();
                try {
                    File file = new File("indexcontori.txt");
                    file.createNewFile();
                    FileWriter out = new FileWriter(file);
                    out.write(String.format("Acesta este un test: %s", date.toString()));
                    out.write(String.format("\nIndex apa rece Bucatarie: %s", a ));
                    out.write(String.format("\nIndex apa calda Bucatarie: %s", iacbuct.getText() ));
                    out.write(String.format("\nIndex apa rece Baie: %s", iarbait.getText() ));
                    out.write(String.format("\nIndex apa calda Baie: %s", iacbait.getText() ));
                    out.write(String.format("\nIndex gaze: %s", gazet.getText() ));
                    out.flush();
                    out.close();
                } catch (IOException ex) {
                    ex.printStackTrace();;

                }
                System.out.println("Done");
            }
        });
        panel.add(save);

        add(panel);

        setTitle("GridLayout index apartament soft Java");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void createMenuBar() {
        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem eMenuItem= new JMenuItem("Exit");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Inchide Aplicatia");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        file.add(eMenuItem);
        menubar.add(file);
        setJMenuBar(menubar);
    }
}
