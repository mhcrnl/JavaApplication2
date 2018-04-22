/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author mhcrnl
 */
public class Notepad extends JFrame {

    /**
     * @param args the command line arguments
     */
    JFrame frame;
    JMenuBar menuBar;
    JMenu file;
    JMenuItem open, save, exit;
    JFileChooser fileChoser;
    JTextArea textArea;
    
    public Notepad (){
        
        createUI();
}
    
    public void createUI(){
        frame = new JFrame("IRINA Editor");
        file = new JMenu("File");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Close");
        textArea = new JTextArea("Aici introduce-ti textul");
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
        
        frame.setSize(800, 600);
        //frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable(){
        

            @Override
            public void run() {
                Notepad n = new Notepad();
                n.setSize(800, 600);
                n.setVisible(true);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
    });
    }
    
}
