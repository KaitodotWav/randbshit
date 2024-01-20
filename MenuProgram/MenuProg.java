import java.awt.*;
import java.awt.event.*;

public class MenuProg extends Frame implements ActionListener {
    Button calc, sumAve, heightProg, extBut;
    int butW, butH;
    MenuProg(){
        calc = new Button("Calculator");
        calc.setBounds(100, 100, 200, 30);
        calc.addActionListener(this);
        
        sumAve = new Button("Sum & Average");
        sumAve.setBounds(100, 150, 200, 30);
        sumAve.addActionListener(this);
        
        heightProg = new Button("Heighest");
        heightProg.setBounds(100, 200, 200, 30);
        heightProg.addActionListener(this);
        
        extBut = new Button("Exit");
        extBut.setBounds(100, 250, 200, 30);
        extBut.addActionListener(this);
        
        
        add(calc);add(sumAve);add(heightProg);add(extBut);
        setTitle("Menu");
        setSize(500,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
    
    }
    public static void main(String[] args){
        new MenuProg();
    }
}