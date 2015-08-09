import java.awt.*;

/**
 * Created by mhcrnl on 8/8/15.
 */
public class Salut {
    public static void main(String[] args){

        System.out.println("Salut!");

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //MnemonicEx ex = new MnemonicEx();
                //MeniuSimplu ex = new MeniuSimplu();
                //SubmenuEx ex = new SubmenuEx();
                //ShortCutsEx ex = new ShortCutsEx();
                //CheckBox ex= new CheckBox();
               // RightMenuEx ex = new RightMenuEx();
                //  PopupMenuEx ex = new PopupMenuEx();
                ToolbarEx ex = new ToolbarEx();

                ex.setVisible(true);
            }
        });
    }
}
