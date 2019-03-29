package forms;

import utils.UIUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private javax.swing.JPanel JPanel;
    private JTextField userNameFiled;
    private JPasswordField passwordField;
    private JRadioButton studentRadioBtn;
    private JRadioButton adminRadioBtn;
    private JButton cancelBtn;
    private JButton loginBtn;
    private JFrame frame;


    private void createUIComponents() {
        // TODO: place custom component creation code here

        frame=new JFrame("Login");
        frame.setContentPane(JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        UIUtils.makeFrameToCenter(frame);
        frame.setSize(400, 300);
        frame.setVisible(true);



        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
            }
        });


        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(check()) return;
                String username = userNameFiled.getText().toString().trim();
                String password = passwordField.getText().toString().trim();


            }
        });
    }


    private boolean check(){
        boolean flag = false;
        if(userNameFiled.getText() == null || userNameFiled.getText().toString().length() <= 0){
            flag = true;
            JOptionPane.showMessageDialog(frame, "请输入用户名", "提示", JOptionPane.WARNING_MESSAGE);
            return flag;
        }

        if(passwordField.getPassword() == null || passwordField.getPassword().toString().length() <= 0){
            flag = true;
            JOptionPane.showMessageDialog(frame, "请输入密码", "提示", JOptionPane.WARNING_MESSAGE);
            return flag;
        }
        return flag;
    }
}
