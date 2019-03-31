package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.Map;

public class CustomModel<T, V> extends AbstractTableModel {

    private T entity;
    private V entityUtils;

    private List<Map<String, Object>> list = getAllData();
//
//        private ChooseCourseUtils chooseCourseUtils = new ChooseCourseUtils();
//        private List<Map<String, Object>> list = getALlChooseCourse();


    public void setEntity(Class<T> entityCls) {
        try {
            this.entity = entityCls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void setEntityUtils(Class<V> entityUtilsCls) {
        try {
            this.entityUtils = entityUtilsCls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private String[] columnStrings = {"id", "courseName", "academicYear", "term", "name", "hasChoosen", "teacherId"};
    private String[] columnShowStrings = {"编号", "课程名", "学年", "学期", "教师姓名", "是否选择"};


    private void setColumnInfo(String[] columnStrings, String[] columnShowStrings) {
        this.columnShowStrings = columnShowStrings;
        this.columnStrings = columnStrings;
    }

    public void updateListData() {
        list = getAllData();
        fireTableDataChanged();

    }

//    public boolean saveChooseCourse(int courseId) {
//        boolean flag = chooseCourseUtils.saveChoosen(student.getId(), courseId);
//        updateChoosenInfo();
//
//        return flag;
//    }
//
//    public List<Map<String, Object>> getALlChooseCourse() {
//        return chooseCourseUtils.findAllChooseCourse(student.getId());
//    }

    private List<Map<String, Object>> getAllData() {
        return null;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return columnShowStrings.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Map<String, Object> map = list.get(rowIndex);
        return map.get(columnStrings[columnIndex]);
    }

    @Override
    public String getColumnName(int column) {
        return columnShowStrings[column];
    }
}
