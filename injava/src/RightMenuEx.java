import javax.swing.*;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class RightMenuEx extends JFrame {

    public RightMenuEx(){
        initUI();
    }

    private void initUI() {
        createMenuBar();

        setTitle("Meniu in dreapta");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {
        JMenuBar menubar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        JMenu toolsMenu = new JMenu("Tools");
        JMenu helpMenu = new JMenu("Help");

        menubar.add(fileMenu);
        menubar.add(viewMenu);
        menubar.add(toolsMenu);
        menubar.add(Box.createHorizontalGlue());
        menubar.add(helpMenu);

        setJMenuBar(menubar);


    }
}
