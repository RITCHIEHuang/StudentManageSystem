package forms;

import bean.StudentInfoBean;
import bean.StudentLoginBean;
import utils.Constants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static utils.UIUtils.UITools;

public class StudentHomeForm {
    private JPanel mPanel1;
    private JTabbedPane mTabbedPane1;
    private JPanel StudentInfoPanel;
    private JPanel GradeManagePanel;
    private JPanel WarnPanel;
    private JPanel CourseManagePanel;
    private JLabel infoLabel;
    private JButton mExitButton;
    private JPanel StatusInfoPanel;
    private JTextField mTextField7;
    private JTextField mTextField9;
    private JTextField mTextField1;
    private JTextField mTextField2;
    private JTextField mTextField3;
    private JTextField mTextField4;
    private JTextField mTextField5;
    private JTextField mTextField6;
    private JTextField mTextField8;
    private JTextField mTextField11;
    private JTextField mTextField12;
    private JTextField mTextField13;
    private JTextField mTextField10;
    private JButton m修改Button;
    private JButton m提交Button;
    private JComboBox mComboBox1;


    public StudentHomeForm() {
        createUI();
    }

    private void createUI() {
        final JFrame frame = new JFrame("Student HomePage");
        UITools(frame, mPanel1, 900, 650);

        StudentInfoBean sinfo = (StudentInfoBean) Constants.loginUser;
        infoLabel.setText("亲爱的 " + sinfo.getS_name());
        mExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LoginForm();
                frame.dispose();
            }
        });
    }

}
