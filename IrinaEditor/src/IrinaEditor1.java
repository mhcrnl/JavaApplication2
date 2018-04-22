import javax.swing.*;
import java.awt.*;

/**
 * Created by mhcrnl on 12.08.2015.
 */
public class IrinaEditor1 {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file;
    JMenuItem open, save, exit;
    JFileChooser fileChoser;
    JTextArea textArea;

    IrinaEditor1() {
        frame = new JFrame("Irina Editor");
        file = new JMenu("File");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        textArea = new JTextArea("Text");
        fileChoser = new JFileChooser();
        menuBar = new JMenuBar();

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(textArea);
        file.add(open);
        file.add(save);
        file.add(exit);
        menuBar.add(file);
        frame.setJMenuBar(menuBar);
        menuBar.updateUI();

        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
