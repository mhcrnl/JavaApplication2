import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class MnemonicEx extends JFrame {
    public MnemonicEx() {
        initUI();
    }

    private void initUI() {
        JButton btn = new JButton("Button");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Butonul a fost activat");
            }
        });
        btn.setMnemonic(KeyEvent.VK_B);
        createLayout(btn);
        setTitle("Fereastra cu buton mnemonic");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]).addGap(200));
        gl.setVerticalGroup(gl.createParallelGroup().addComponent(arg[0]).addGap(200));
        pack();

    }
}
