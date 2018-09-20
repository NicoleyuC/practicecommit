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
    private Button bt1 = new Button("Move on!");
    private Button bt2 = new Button("Move down!");
    private Label  lab3= new Label ("OP");
    private int x = 150 , y = 150;


    public MainFrame(){
        init();
    }
    private void init() {
        this.setLocation(50, 50);
        this.setSize(600, 500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLayout(null);
        btt.setLocation(150, 450);
        btt.setSize(300, 30);
        btt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    MainFrame.this.setTitle("LET'S GO OUT.");
        lab.setBounds(150, 400, 100, 50);
        lad2.setBounds(350, 400, 100, 50);
        add(btt);
        add(lab);
        add(lad2);

        this.setLayout(null);
        bt1.setLocation(150,350);
        bt1.setSize(100,50);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y = y - 5;
                lab3.setLocation(x,y);
            }
        });

        this.setLayout(null);
        bt2.setLocation(350,350);
        bt2.setSize(100,50);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y = y + 5;
                lab3.setLocation(x,y);
            }
        });
        lab3.setBounds(300,220,20,20);

        add(bt1);
        add(bt2);
        add(lab3);
    }
}
