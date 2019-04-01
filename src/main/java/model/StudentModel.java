package model;

import bean.StudentInfoBean;
import utils.TableOperationsUtils;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.Map;

public class StudentModel extends AbstractTableModel {

    private String[] colums = {"s_account", "s_name", "s_idnum", "s_sex", "s_nation", "s_addr", "s_phone", "s_origin", "s_graduate_date", "s_enroll_date", "s_degree"};
    private String[] columStrings = {"学号", "姓名", "身份证号", "性别", "民族", "地址", "手机", "籍贯", "毕业日期", "入学日期", "学位"};

    private TableOperationsUtils<StudentInfoBean> mStudentInfoUtils = new TableOperationsUtils<StudentInfoBean>();


    private List<Map<String, Object>> mStudentInfoBeanList = getAllStudents();

    private List<Map<String, Object>> getAllStudents() {
        String sql_findall_students = "select * from STUDENT_INFO";
        return mStudentInfoUtils.findAllItems(sql_findall_students);
    }

    public int getRowCount() {
        return mStudentInfoBeanList.size();
    }

    public int getColumnCount() {
        return colums.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Map<String, Object> item = mStudentInfoBeanList.get(rowIndex);
        return item.get(colums[columnIndex]);
    }

    public String getColumnName(int column) {
        return columStrings[column];
    }
}
