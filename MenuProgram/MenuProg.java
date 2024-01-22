import java.awt.*;
import java.awt.event.*;

public class MenuProg extends Frame implements ActionListener {
    Button calc, sumAve, heightProg, extBut;
    int butX = 150;
    MenuProg(){
        calc = new Button("Calculator");
        calc.setBounds(butX, 100, 200, 30);
        calc.addActionListener(this);
        
        sumAve = new Button("Sum & Average");
        sumAve.setBounds(butX, 150, 200, 30);
        sumAve.addActionListener(this);
        
        heightProg = new Button("Heighest");
        heightProg.setBounds(butX, 200, 200, 30);
        heightProg.addActionListener(this);
        
        extBut = new Button("Exit");
        extBut.setBounds(butX, 250, 200, 30);
        extBut.addActionListener(this);
        
        
        add(calc);add(sumAve);add(heightProg);add(extBut);
        setTitle("Menu");
        setSize(500,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==calc){
            new JavCGUI();
        } else if (e.getSource()==sumAve){
            new SumAve();
        } else if (e.getSource()==heightProg){
            dispose();
        } 
        dispose();
    }
    public static void main(String[] args){
        new MenuProg();
    }
}