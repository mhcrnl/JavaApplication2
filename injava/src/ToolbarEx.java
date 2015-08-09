import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class ToolbarEx extends JFrame {
    
    public ToolbarEx() {
        initUI();
    }

    private void initUI() {
        
        createMenuBar();
        createToolBar(); 
        
        setTitle("Toolbar fereastra");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        menubar.add(file);
        setJMenuBar(menubar);
    }
    

    private void createToolBar() {
        JToolBar toolbar = new JToolBar();
        ImageIcon icon = new ImageIcon("exit.png");
        JButton exitButton = new JButton(icon);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        add(toolbar, BorderLayout.NORTH);
    }
}
