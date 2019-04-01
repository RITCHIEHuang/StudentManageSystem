package forms;

import bean.AdminLoginBean;
import bean.StudentInfoBean;
import model.StudentModel;
import utils.Constants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static utils.UIUtils.UITools;

public class AdminHomeForm {
    private JPanel mPanel1;
    private JLabel infoLabel;
    private JTabbedPane mTabbedPane1;
    private JPanel StudentInfoPanel;
    private JPanel GradeManagePanel;
    private JPanel WarnPanel;
    private JPanel CourseManagePanel;
    private JButton mExitButton;
    private JTable mStudentTable;
    private JPanel ApplicationPanel;
    private JButton m驳回Button;
    private JButton m通过Button;
    private JTable mTable1;

    AdminHomeForm() {
        createUI();


        mStudentTable.setModel(new StudentModel());
    }

    private void createUI() {
        final JFrame frame = new JFrame("Admin HomePage");
        UITools(frame, mPanel1, 900, 650);

        AdminLoginBean sinfo = (AdminLoginBean) Constants.loginUser;
        infoLabel.setText("亲爱的 " + sinfo.getaAccount());
        mExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LoginForm();
                frame.dispose();
            }
        });



    }

}
