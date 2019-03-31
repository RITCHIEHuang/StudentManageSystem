package bean;

public class ClassInfoBean {
    private Integer class_id;

    private Integer major_id;

    private String class_name;

    public Integer getClassId() {
        return class_id;
    }

    public void setClassId(Integer classId) {
        this.class_id = classId;
    }

    public Integer getMajorId() {
        return major_id;
    }

    public void setMajorId(Integer majorId) {
        this.major_id = majorId;
    }

    public String getClassName() {
        return class_name;
    }

    public void setClassName(String className) {
        this.class_name = className == null ? null : className.trim();
    }
}