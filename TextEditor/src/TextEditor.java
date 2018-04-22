import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by mhcrnl on 11.08.2015.
 */
public class TextEditor extends JFrame {

    private JTextArea area = new JTextArea(20, 120);
    private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
    private String currentFile ="Untitled";
    private boolean changed = false;

    public TextEditor() {
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(scroll, BorderLayout.CENTER);

        JMenuBar JMB = new JMenuBar();
        setJMenuBar(JMB);
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMB.add(file);
        JMB.add(edit);
        //file.add(New);
        file.add(Open); file.add(Save);
        file.add(Quit); file.add(SaveAs); file.addSeparator();

        for (int i=0; i<4; i++)
            file.getItem(i).setIcon(null);

        edit.add(Cut); edit.add(Copy); edit.add(Paste);

        edit.getItem(0).setText("Cut out");
        edit.getItem(1).setText("Copy");
        edit.getItem(2).setText("Paste");

        JToolBar tool = new JToolBar();
        add(tool, BorderLayout.NORTH);
        //tool.add(New);
        tool.add(Open); tool.add(Save);
        tool.addSeparator();

        JButton cut = tool.add(Cut), cop =tool.add(Copy), pas = tool.add(Paste);
        ImageIcon cutGif = new ImageIcon("cut.gif");
        cut.setText(null); cut.setIcon(cutGif);
        cop.setText(null); cop.setIcon(new ImageIcon("copy.gif"));
        pas.setText(null); pas.setIcon(new ImageIcon("paste.gif"));

        Save.setEnabled(false);
        SaveAs.setEnabled(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        area.addKeyListener(k1);
        setTitle(currentFile);
        setVisible(true);

     }

    private KeyListener k1 = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            changed = true;
            Save.setEnabled(true);
            SaveAs.setEnabled(true);
        }
    };
    Action Open = new AbstractAction("Open", new ImageIcon("opem.gif")) {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            saveOld();
            if(dialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
                readInFile(dialog.getSelectedFile().getAbsolutePath());
            }
            SaveAs.setEnabled(true);
        }
    };
    Action Save = new AbstractAction("Save", new ImageIcon("save.gif")) {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(!currentFile.equals("Untitled"))
                saveFile(currentFile);
            else
                saveFileAs();
        }
    };
    Action SaveAs = new AbstractAction("Save as...") {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            saveFileAs();
        }
    };
    Action Quit = new AbstractAction("Quit") {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            saveOld();
            System.exit(0);
        }
    };
    ActionMap m = area.getActionMap();
    Action Cut = m.get(DefaultEditorKit.cutAction);
    Action Copy = m.get(DefaultEditorKit.copyAction);
    Action Paste = m.get(DefaultEditorKit.pasteAction);

    private void saveFileAs() {
        if(dialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
            saveFile(dialog.getSelectedFile().getAbsolutePath());
    }

    private void saveOld() {
        if(changed){
            if(JOptionPane.showConfirmDialog(this, "Doriti salvarea: " + currentFile +" ?", "Save",
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                saveFile(currentFile);
        }
    }
    private void readInFile(String fileName) {
        try {
            FileReader r =new FileReader(fileName);
            area.read(r, null);
            r.close();
            currentFile = fileName;
            setTitle(currentFile);
            changed=false;
        }
        catch(IOException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Editorul nu a gasit: " + fileName);
        }
    }
    private void saveFile(String fileName){
        try {
            FileWriter w = new FileWriter(fileName);
            area.write(w);
            w.close();
            currentFile = fileName;
            setTitle(currentFile);
            changed = false;
            Save.setEnabled(false);
        }
        catch(IOException e){

        }
    }

    public static void main (String[] args) {
        new TextEditor();
    }
}
