import java.awt.*;

/**
 * Created by mhcrnl on 12.08.2015.
 */
public class RunIrinaEditor {
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                IrinaEditor1 ex = new IrinaEditor1();
                //ex.setVisible(true);

            }
        });
    }
}
