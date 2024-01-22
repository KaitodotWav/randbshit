import java.awt.*;
import java.awt.event.*;

public class HSelector extends Frame implements ActionListener {
    Button ok, exit;
    Label entL1, entL2, entL3, entL4, entL5, totalL, aveL;
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
        aveL = new Label(" ");
        aveL.setBounds(100, 240, txtL, 30);

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
        add(entL1);add(entL2);add(entL3);add(entL4);add(aveL);add(entL5);

        ok = new Button("Ok");
        ok.setBounds(50 ,buttH , 100, 50);
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
                int ent1 = Integer.parseInt(entry1.getText());
                int ent2 = Integer.parseInt(entry2.getText());
                int ent3 = Integer.parseInt(entry3.getText());
                int ent4 = Integer.parseInt(entry4.getText());
                int ent5 = Integer.parseInt(entry5.getText());
                String highest = "1st number is the highest : "+ent1;
                if (ent2 >= 1){
                    
                }
            } catch (Exception ex){
            }
        }
    }

    public static void main(String[] args) {
        new HSelector();
    }
}