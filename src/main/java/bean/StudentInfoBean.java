package bean;

public class StudentInfoBean {
    private Integer s_id;

    private Integer s_classid;

    private Integer s_recordid;

    private Integer s_departmentid;

    private Integer s_majorid;

    private String s_name;

    private String s_grade;

    private String s_account;

    private String s_idnum;

    private String s_sex;

    private String s_nation;

    private String s_addr;

    private String s_phone;

    private String s_origin;

    private String s_graduate_date;

    private String s_enroll_date;

    private String s_degree;

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Integer getsId() {
        return s_id;
    }

    public void setsId(Integer sId) {
        this.s_id = sId;
    }

    public Integer getsClassid() {
        return s_classid;
    }

    public void setsClassid(Integer sClassid) {
        this.s_classid = sClassid;
    }

    public Integer getsRecordid() {
        return s_recordid;
    }

    public void setsRecordid(Integer sRecordid) {
        this.s_recordid = sRecordid;
    }

    public Integer getsDepartmentid() {
        return s_departmentid;
    }

    public void setsDepartmentid(Integer sDepartmentid) {
        this.s_departmentid = sDepartmentid;
    }

    public Integer getsMajorid() {
        return s_majorid;
    }

    public void setsMajorid(Integer sMajorid) {
        this.s_majorid = sMajorid;
    }

    public String getsGrade() {
        return s_grade;
    }

    public void setsGrade(String sGrade) {
        this.s_grade = sGrade == null ? null : sGrade.trim();
    }

    public String getsAccount() {
        return s_account;
    }

    public void setsAccount(String sAccount) {
        this.s_account = sAccount == null ? null : sAccount.trim();
    }

    public String getsIdnum() {
        return s_idnum;
    }

    public void setsIdnum(String sIdnum) {
        this.s_idnum = sIdnum == null ? null : sIdnum.trim();
    }

    public String getsSex() {
        return s_sex;
    }

    public void setsSex(String sSex) {
        this.s_sex = sSex == null ? null : sSex.trim();
    }

    public String getsNation() {
        return s_nation;
    }

    public void setsNation(String sNation) {
        this.s_nation = sNation == null ? null : sNation.trim();
    }

    public String getsAddr() {
        return s_addr;
    }

    public void setsAddr(String sAddr) {
        this.s_addr = sAddr == null ? null : sAddr.trim();
    }

    public String getsPhone() {
        return s_phone;
    }

    public void setsPhone(String sPhone) {
        this.s_phone = sPhone == null ? null : sPhone.trim();
    }

    public String getsOrigin() {
        return s_origin;
    }

    public void setsOrigin(String sOrigin) {
        this.s_origin = sOrigin == null ? null : sOrigin.trim();
    }

    public String getsGraduateDate() {
        return s_graduate_date;
    }

    public void setsGraduateDate(String sGraduateDate) {
        this.s_graduate_date = sGraduateDate == null ? null : sGraduateDate.trim();
    }

    public String getsEnrollDate() {
        return s_enroll_date;
    }

    public void setsEnrollDate(String sEnrollDate) {
        this.s_enroll_date = sEnrollDate == null ? null : sEnrollDate.trim();
    }

    public String getsDegree() {
        return s_degree;
    }

    public void setsDegree(String sDegree) {
        this.s_degree = sDegree == null ? null : sDegree.trim();
    }
}