package layoutmanager;

import javax.swing.*;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class RunExample {
    public  static void main( String[] args){
        System.out.println("assss");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //NoManager ex = new NoManager();
                //FlowLayout ex = new FlowLayout();
                GridLayout ex = new GridLayout();
                ex.setVisible(true);
            }
        });
    }
}
