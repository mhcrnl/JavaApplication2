import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class ShortCutsEx extends JFrame {
    public ShortCutsEx() {
        frameInitUI();
    }

    public void frameInitUI() {

        createMenuBar();

        setTitle("Submeniu din ShortCutsEx");
        setSize(900, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void createMenuBar() {
        JMenuBar menubar = new JMenuBar();

        ImageIcon iconNew = new ImageIcon("new.png");
        ImageIcon iconOpen = new ImageIcon("open.png");
        ImageIcon iconSave = new ImageIcon("seve.png");
        ImageIcon iconExit = new ImageIcon("exit.png");

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem newMi = new JMenuItem(new MenuItemAction("New", iconNew, KeyEvent.VK_N));
        JMenuItem openMi = new JMenuItem(new MenuItemAction("Open", iconOpen, KeyEvent.VK_O));
        JMenuItem saveMi = new JMenuItem(new MenuItemAction("Save", iconSave, KeyEvent.VK_S));
        JMenuItem exitMi = new JMenuItem("Exit", iconExit);
        exitMi.setMnemonic(KeyEvent.VK_E);
        exitMi.setToolTipText("Inchide Aplicatia");
        exitMi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));

        exitMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        fileMenu.add(newMi);
        fileMenu.add(openMi);
        fileMenu.add(saveMi);
        fileMenu.addSeparator();
        fileMenu.add(exitMi);

        menubar.add(fileMenu);
        setJMenuBar(menubar);
    }

    private class MenuItemAction extends AbstractAction {
        public MenuItemAction(String text, ImageIcon icon, Integer mnemonic) {
            super(text);
            putValue(SMALL_ICON, icon);
            putValue(MNEMONIC_KEY, mnemonic);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println(e.getActionCommand());
        }
    }
}
