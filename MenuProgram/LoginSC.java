import java.awt.*;
import java.awt.event.*;
public class LoginSC extends Frame implements ActionListener {
    Button logBut, extBut;
    Label ussrL, passL, msgBox;
    final TextField ussrEnt, passEnt;
    String stdUssr = "Admin";
    String stdPass = "admin123";
    
    LoginSC(){
        int stdH = 30;
        ussrL = new Label("Username:");
        ussrL.setBounds(100, 100, 100, stdH);
        passL = new Label("Password:");
        passL.setBounds(100, 160, 100, stdH);
        msgBox = new Label("");
        msgBox.setBounds(150, 160+stdH, 200, stdH);
        msgBox.setForeground(Color.red);
        
        ussrEnt = new TextField();
        ussrEnt.setBounds(180, 100, 200, stdH);
        passEnt = new TextField();
        passEnt.setBounds(180, 160, 200, stdH);
        
        logBut = new Button("Login");
        logBut.setBounds(150, 230, 100, 30);
        extBut = new Button("Exit");
        extBut.setBounds(250, 230, 100, 30);
        
        add(ussrEnt);add(passEnt);add(logBut);add(extBut);
        add(ussrL);add(passL);add(msgBox);
        logBut.addActionListener(this);
        extBut.addActionListener(this);
        
        setTitle("Login");
        setSize(500,400);
        setLayout(null);
        setVisible(true);
    }    
    public void actionPerformed(ActionEvent e){
        String username = ussrEnt.getText();
        String password = passEnt.getText();
        if (e.getSource()==logBut){
            if (username.equals(stdUssr) & password.equals(stdPass)){
                msgBox.setText("");
                new MenuProg();
                dispose();
            } else {
                msgBox.setText("invalid username or password");
            }
        } else if (e.getSource()==extBut){
            dispose();
        }
    }
    public static void main(String[] args){
        new LoginSC();
    }
}