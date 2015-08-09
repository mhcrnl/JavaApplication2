/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tooltipex;

/**
 *
 * @author mhcrnl
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TooltipEx extends JFrame {
    public TooltipEx() {
        initUI();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable() {
            

            @Override
            public void run() {
                TooltipEx ex = new TooltipEx();
                ex.setVisible(true);
                //throw new UnsupportedOperationException("Not supported yet."); 
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    private void initUI() {
        JButton btn = new JButton("Buton");
        btn.setToolTipText("Acest buton inchide aplicatia");
        
        JButton qbtn = new JButton("Quit");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
                //throw new UnsupportedOperationException("Not supported yet.");
                //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        createLayout(btn);
        createLayout(qbtn);
        setTitle("Fereastră tooltip");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    private void createLayout(JComponent... arg) {
        JPanel pane = (JPanel) getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
        
        pane.setToolTipText("Continutul panelului");
        
        gl.setAutoCreateContainerGaps(true);
        
        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
            .addGap(200));
        
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]).addGap(120));
        pack();
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
