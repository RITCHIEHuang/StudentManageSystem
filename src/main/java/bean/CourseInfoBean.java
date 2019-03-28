package bean;

public class CourseInfoBean {
    private Integer cId;

    private String cName;

    private String cType;

    private String cCredits;

    private Integer cTeacher;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String getcCredits() {
        return cCredits;
    }

    public void setcCredits(String cCredits) {
        this.cCredits = cCredits == null ? null : cCredits.trim();
    }

    public Integer getcTeacher() {
        return cTeacher;
    }

    public void setcTeacher(Integer cTeacher) {
        this.cTeacher = cTeacher;
    }
}