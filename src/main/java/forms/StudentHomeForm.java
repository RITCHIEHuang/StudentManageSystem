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
