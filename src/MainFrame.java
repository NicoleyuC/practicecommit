import com.sun.java.swing.plaf.motif.MotifInternalFrameTitlePane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{

    private Label  lab = new Label ("You're sick!");
    private Label  lad2= new Label ("Are u kidding me?");
    private Button btt = new Button("OK");
    private int x = 100, y =150;

    public MainFrame(){
        init();
    }
    private void init(){
        this.setLocation(300,100);
        this.setSize(800,500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    this.setLayout(null);
    btt.setLocation(250,350);
    btt.setSize(300,30);
    btt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    MainFrame.this.setTitle("ALL OUT!!!!!");
    lab.setBounds(150,100,100,100);
    lad2.setBounds(450,100,100,100);

    add(btt);
    add(lab);
    add(lad2);
    }
}
