import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mhcrnl on 07.08.2015.
 */
public class quitbutton extends JFrame {
    public quitbutton() {
        initUI();
    }

    private void initUI() {
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        createLayout(quitButton);

        setTitle("Fereastra cu buton de inchidere");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void  createLayout(JComponent... arg) {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
	    gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
    }
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                quitbutton ex = new quitbutton();
                ex.setVisible(true);
            }
        });
    }
}
