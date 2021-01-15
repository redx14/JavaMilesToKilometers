
package lab7;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class Miles2KiloFIX extends JFrame {
    private JTextField Miles;
    private JTextField Kilos;
    
    public Miles2KiloFIX (){
        //panels,textfields, and labels
        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel panel2 = new JPanel(new GridLayout(2,1));
        JPanel panel3 = new JPanel(new GridLayout(2,5));
        JLabel label1 = new JLabel("Miles");
        JLabel label2 = new JLabel("Kilometers");
        final JTextField Miles = new JTextField(1);
        final JTextField Kilos = new JTextField(1);
        //Action events
        Miles.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
                                            String mstring = Miles.getText();
                                            double Miles = Double.parseDouble(mstring);
						Kilos.setText(""+(Miles*1.60934));
					}
				}
				);
        Kilos.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
                                            String kstring = Kilos.getText();
                                            double Kilos = Double.parseDouble(kstring);
						Miles.setText(""+(Kilos*.6213));
					}
				}
				);
        
        //adding everything to gui
        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.WEST);
        add(panel3);
        panel2.add(label1);
        panel2.add(label2);
        panel3.add(Miles);
        panel3.add(Kilos);
    }
    
}
