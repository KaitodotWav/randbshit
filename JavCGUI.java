//created by John Naoise L. Molinos
//BC1DC

import java.awt.*;
import java.awt.event.*;

public class JavCGUI extends Frame implements ActionListener {
    Button sum, diff, prod, quot;
    Label entL1, entL2, entL3;
    final TextField entry1, entry2, entry3;
    JavCGUI(){
        int txtL;
        txtL = 230;
        int buttS, buttH;
        buttS = 60; buttH = 260;
        
        entL1 = new Label("1st number");
        entL1.setBounds(50, 60, txtL, 30);
        entL2 = new Label("2nd number");
        entL2.setBounds(50, 120, txtL, 30);
        entL3 = new Label("total");
        entL3.setBounds(50, 180, txtL, 30);

        entry1 = new TextField();
        entry1.setBounds(130, 60, txtL, 30);
        entry2 = new TextField();
        entry2.setBounds(130, 120, txtL, 30);
        entry3 = new TextField();
        entry3.setBounds(130, 180, txtL, 30);
        entry3.setEditable(false);

        add(entry1);add(entry2);add(entry3);
        add(entL1);add(entL2);add(entL3);

        sum = new Button("+");
        sum.setBounds(50 ,buttH ,buttS, buttS);
        diff = new Button("-");
        diff.setBounds(150 ,buttH ,buttS, buttS);
        prod = new Button("*");
        prod.setBounds(250 ,buttH ,buttS, buttS);
        quot = new Button("/");
        quot.setBounds(350 ,buttH ,buttS, buttS);

        add(sum);add(diff);add(prod);add(quot);
        sum.addActionListener(this);
        diff.addActionListener(this);
        prod.addActionListener(this);
        quot.addActionListener(this);

        setTitle("JavCalculatorGUI");
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int ent1 = Integer.parseInt(entry1.getText());
        int ent2 = Integer.parseInt(entry2.getText());
        int result = 0;

        if (e.getSource()==sum) {
            result = ent1 + ent2;
        } else if (e.getSource()==diff) {
            result = ent1 - ent2;
        } else if (e.getSource()==prod) {
            result = ent1 * ent2;
        } else {
            result = ent1 / ent2;
        } 
        String disp = String.valueOf(result);
        entry3.setText(disp);
    }

    public static void main(String[] args) {
        new JavCGUI();
    }
}