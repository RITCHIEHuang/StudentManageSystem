package bean;

public class CourseInfoBean {
    private Integer c_id;

    private String c_name;

    private String c_type;

    private String c_credits;

    private Integer c_teacher;

    public Integer getcId() {
        return c_id;
    }

    public void setcId(Integer cId) {
        this.c_id = cId;
    }

    public String getcName() {
        return c_name;
    }

    public void setcName(String cName) {
        this.c_name = cName == null ? null : cName.trim();
    }

    public String getcType() {
        return c_type;
    }

    public void setcType(String cType) {
        this.c_type = cType == null ? null : cType.trim();
    }

    public String getcCredits() {
        return c_credits;
    }

    public void setcCredits(String cCredits) {
        this.c_credits = cCredits == null ? null : cCredits.trim();
    }

    public Integer getcTeacher() {
        return c_teacher;
    }

    public void setcTeacher(Integer cTeacher) {
        this.c_teacher = cTeacher;
    }
}