import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.View;

public class Controller implements ActionListener {
    private Calculatrice v;

    public Controller(Calculatrice v) {
        this.v = v;
        v.button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double s=0.0;
        if (e.getSource() == v.button) {
            s=Double.valueOf(v.op1.getText())+Double.valueOf(v.op2.getText());
            v.res.setText(""+s);
            // System.out.println(s);
         
        }

    }

}