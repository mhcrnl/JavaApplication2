import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class PopupMenuEx extends JFrame {
    private JPopupMenu pmenu;

    public PopupMenuEx() {
        initUI();
    }

    private void initUI() {

        createPopupMenu();

        setTitle("JPopupMenu fereastra");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createPopupMenu() {
        pmenu = new JPopupMenu();

        JMenuItem maxMi = new JMenuItem("Maximize");
        maxMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
                    setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            }
        });

        pmenu.add(maxMi);
        JMenuItem quitMi = new JMenuItem("Quit");
        quitMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        pmenu.add(quitMi);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON3){
                    pmenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

        });
    }
}
