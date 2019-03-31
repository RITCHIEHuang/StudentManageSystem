package forms;

import utils.Constants;
import utils.LoginUtils;
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

    public LoginForm(){
        createUIComponents();

        frame = new JFrame("Login");
        UIUtils.UITools(frame, JPanel, 600, 400);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        ButtonGroup group = new ButtonGroup();
        group.add(studentRadioBtn);
        group.add(adminRadioBtn);
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });


        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (check()) return;
                String username = userNameFiled.getText().toString().trim();
                String password = passwordField.getText().toString().trim();

                System.out.println(username + " : " + password);
                LoginUtils utils = new LoginUtils();
                if (getLoginType() == -1) return;

                String result = utils.login(username, password, getLoginType());
                if(!result.equals(Constants.LOGIN_SUCCESS_MSG)){
                    JOptionPane.showMessageDialog(frame, result, "提示", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if(getLoginType() == 0){
                    new StudentHomeForm();
                }
                else{
                    new AdminHomeForm();
                }
                frame.dispose();

            }
        });
    }

    private int getLoginType() {
        if (studentRadioBtn.isSelected()) {
            return 0;
        }
        if (adminRadioBtn.isSelected()) {
            return 1;
        }
        return -1;
    }

    private boolean check() {
        boolean flag = false;
        if (userNameFiled.getText() == null || userNameFiled.getText().toString().length() <= 0) {
            flag = true;
            JOptionPane.showMessageDialog(frame, "请输入用户名", "提示", JOptionPane.WARNING_MESSAGE);
            return flag;
        }

        if (passwordField.getPassword() == null || passwordField.getPassword().toString().length() <= 0) {
            flag = true;
            JOptionPane.showMessageDialog(frame, "请输入密码", "提示", JOptionPane.WARNING_MESSAGE);
            return flag;
        }
        return flag;
    }
}
