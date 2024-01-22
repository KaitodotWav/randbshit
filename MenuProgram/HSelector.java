//created by John Naoise L. Molinos
//BC1DC

import java.awt.*;
import java.awt.event.*;

public class HSelector extends Frame implements ActionListener {
    Button ok, exit;
    Label entL1, entL2, entL3, entL4, entL5, disp;
    final TextField entry1, entry2, entry3, entry4, entry5;
    HSelector(){
        int txtL;
        txtL = 230;
        int buttS, buttH;
        buttH = 300;
        
        entL1 = new Label("1st number");
        entL1.setBounds(50, 60, txtL, 30);
        entL2 = new Label("2nd number");
        entL2.setBounds(50, 100, txtL, 30);
        entL3 = new Label("3rd number");
        entL3.setBounds(50, 140, txtL, 30);
        entL4 = new Label("4th number");
        entL4.setBounds(50, 180, txtL, 30);
        entL5 = new Label("5th number");
        entL5.setBounds(50, 220, txtL, 30);
        disp = new Label(" ");
        disp.setBounds(100, 260, txtL, 30);

        entry1 = new TextField();
        entry1.setBounds(130, 60, txtL, 30);
        entry2 = new TextField();
        entry2.setBounds(130, 100, txtL, 30);
        entry3 = new TextField();
        entry3.setBounds(130, 140, txtL, 30);
        entry4 = new TextField();
        entry4.setBounds(130, 180, txtL, 30);
        entry5 = new TextField();
        entry5.setBounds(130, 220, txtL, 30);

        add(entry1);add(entry2);add(entry3);add(entry4);add(entry5);
        add(entL1);add(entL2);add(entL3);add(entL4);add(disp);add(entL5);

        ok = new Button("Ok");
        ok.setBounds(100 ,buttH , 100, 50);
        exit = new Button("exit");
        exit.setBounds(300 ,buttH , 100, 50);

        add(ok);add(exit);
        ok.addActionListener(this);
        exit.addActionListener(this);

        setTitle("Highest");
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==exit){
            new MenuProg();
            dispose();
        } else {
            try{
                entL1.setBackground(Color.white);
                entL2.setBackground(Color.white);
                entL3.setBackground(Color.white);
                entL4.setBackground(Color.white);
                entL5.setBackground(Color.white);
                int num1 = Integer.parseInt(entry1.getText());
                int num2 = Integer.parseInt(entry2.getText());
                int num3 = Integer.parseInt(entry3.getText());
                int num4 = Integer.parseInt(entry4.getText());
                int num5 = Integer.parseInt(entry5.getText());
                String highest;
                if (num1>=num2 & num1>=num3 & num1>=num4 & num1>=num5){
                    highest = "1st number is the highest : "+num1;
                    entL1.setBackground(Color.yellow);
                } else if (num2>=num1 & num2>=num3 & num2>=num4 & num2>=num5){
                    highest = "2nd number is the highest : "+num2;
                    entL2.setBackground(Color.yellow);
                } else if (num3>=num2 & num3>=num1 & num3>=num4 & num3>=num5){
                    highest = "3rd number is the highest : "+num3;
                    entL3.setBackground(Color.yellow);
                } else if (num4>=num2 & num4>=num3 & num4>=num1 & num4>=num5){
                    highest = "4th number is the highest : "+num4;
                    entL4.setBackground(Color.yellow);
                } else {
                    highest = "5th number is the highest : "+num5;
                    entL5.setBackground(Color.yellow);
                }
                disp.setText(highest);
            } catch (Exception ex){
                //System.out.println(ex);
                disp.setText("Cant find the highest number, try again!");
            }
        }
    }

    public static void main(String[] args) {
        new HSelector();
    }
}