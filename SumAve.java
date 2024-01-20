//created by John Naoise L. Molinos
//BC1DC

import java.awt.*;
import java.awt.event.*;

public class SumAve extends Frame implements ActionListener {
    Button sumave, exit;
    Label entL1, entL2, entL3, totalL;
    final TextField entry1, entry2, entry3;
    SumAve(){
        int txtL;
        txtL = 230;
        int buttS, buttH;
        buttS = 60; buttH = 260;
        
        entL1 = new Label("1st number");
        entL1.setBounds(50, 60, txtL, 30);
        entL2 = new Label("2nd number");
        entL2.setBounds(50, 120, txtL, 30);
        entL3 = new Label("3rd number");
        entL3.setBounds(50, 180, txtL, 30);
        totalL = new Label("");
        totalL.setBounds(120, 220, txtL, 30);

        entry1 = new TextField();
        entry1.setBounds(130, 60, txtL, 30);
        entry2 = new TextField();
        entry2.setBounds(130, 120, txtL, 30);
        entry3 = new TextField();
        entry3.setBounds(130, 180, txtL, 30);

        add(entry1);add(entry2);add(entry3);
        add(entL1);add(entL2);add(entL3);add(totalL);

        sumave = new Button("Sum & Average");
        sumave.setBounds(70 ,buttH , 130, 50);
        exit = new Button("exit");
        exit.setBounds(210 ,buttH , 130, 50);

        add(sumave);add(exit);
        sumave.addActionListener(this);
        exit.addActionListener(this);

        setTitle("Sum and Average");
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int ent1 = Integer.parseInt(entry1.getText());
        int ent2 = Integer.parseInt(entry2.getText());
        int ent3 = Integer.parseInt(entry3.getText());
        int average = 0, total = 0;

        if (e.getSource()==sumave) {
            total = ent1 + ent2 + ent3;
            average = total / 3;
        } else if (e.getSource()==exit){
            dispose();
        }
        String dispA = String.valueOf(average);
        String dispT = String.valueOf(total);
        totalL.setText("the sum is "+total+" and the average is "+average);
    }

    public static void main(String[] args) {
        new SumAve();
    }
}