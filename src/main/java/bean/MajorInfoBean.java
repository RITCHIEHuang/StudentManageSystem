package bean;

public class MajorInfoBean {
    private Integer m_id;

    private Integer department_id;

    private String m_name;

    public Integer getmId() {
        return m_id;
    }

    public void setmId(Integer mId) {
        this.m_id = mId;
    }

    public Integer getDepartmentId() {
        return department_id;
    }

    public void setDepartmentId(Integer departmentId) {
        this.department_id = departmentId;
    }

    public String getmName() {
        return m_name;
    }

    public void setmName(String mName) {
        this.m_name = mName == null ? null : mName.trim();
    }
}