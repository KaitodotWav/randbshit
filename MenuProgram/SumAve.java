//created by John Naoise L. Molinos
//BC1DC

import java.awt.*;
import java.awt.event.*;

public class SumAve extends Frame implements ActionListener {
    Button sum, exit, aveBut;
    Label entL1, entL2, entL3, totalL, aveL;
    final TextField entry1, entry2, entry3;
    SumAve(){
        int txtL;
        txtL = 230;
        int buttS, buttH;
        buttH = 280;
        
        entL1 = new Label("1st number");
        entL1.setBounds(50, 60, txtL, 30);
        entL2 = new Label("2nd number");
        entL2.setBounds(50, 120, txtL, 30);
        entL3 = new Label("3rd number");
        entL3.setBounds(50, 180, txtL, 30);
        totalL = new Label(" ");
        totalL.setBounds(100, 220, txtL, 30);
        aveL = new Label(" ");
        aveL.setBounds(100, 240, txtL, 30);

        entry1 = new TextField();
        entry1.setBounds(130, 60, txtL, 30);
        entry2 = new TextField();
        entry2.setBounds(130, 120, txtL, 30);
        entry3 = new TextField();
        entry3.setBounds(130, 180, txtL, 30);

        add(entry1);add(entry2);add(entry3);
        add(entL1);add(entL2);add(entL3);add(totalL);add(aveL);

        sum = new Button("Sum");
        sum.setBounds(50 ,buttH , 100, 50);
        aveBut = new Button("Average");
        aveBut.setBounds(175 ,buttH , 100, 50);
        exit = new Button("exit");
        exit.setBounds(300 ,buttH , 100, 50);

        add(sum);add(exit);add(aveBut);
        sum.addActionListener(this);
        exit.addActionListener(this);
        aveBut.addActionListener(this);

        setTitle("Sum and Average");
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int average = 0, total = 0;
        if (e.getSource()==exit){
            new MenuProg();
            dispose();
        } else {
            try {
                int ent1 = Integer.parseInt(entry1.getText());
                int ent2 = Integer.parseInt(entry2.getText());
                int ent3 = Integer.parseInt(entry3.getText());
                
                total = ent1 + ent2 + ent3;
                average = (ent1 + ent2 + ent3) / 3;
                String dispA = String.valueOf(average);
                if (e.getSource()==sum) {
                    String dispT = String.valueOf(total);
                    totalL.setText("the sum is "+dispT);
                } else if (e.getSource()==aveBut){
                    String dispT = String.valueOf(average);
                    aveL.setText("the average is "+dispT);
                }
            } catch (Exception ex) {
                //System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        new SumAve();
    }
}