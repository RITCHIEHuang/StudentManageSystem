package bean;

public class StudentInfoBean {
    private Integer sId;

    private Integer sClassid;

    private Integer sRecordid;

    private Integer sDepartmentid;

    private Integer sMajorid;

    private String sGrade;

    private String sAccount;

    private String sIdnum;

    private String sSex;

    private String sNation;

    private String sAddr;

    private String sPhone;

    private String sOrigin;

    private String sGraduateDate;

    private String sEnrollDate;

    private String sDegree;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getsClassid() {
        return sClassid;
    }

    public void setsClassid(Integer sClassid) {
        this.sClassid = sClassid;
    }

    public Integer getsRecordid() {
        return sRecordid;
    }

    public void setsRecordid(Integer sRecordid) {
        this.sRecordid = sRecordid;
    }

    public Integer getsDepartmentid() {
        return sDepartmentid;
    }

    public void setsDepartmentid(Integer sDepartmentid) {
        this.sDepartmentid = sDepartmentid;
    }

    public Integer getsMajorid() {
        return sMajorid;
    }

    public void setsMajorid(Integer sMajorid) {
        this.sMajorid = sMajorid;
    }

    public String getsGrade() {
        return sGrade;
    }

    public void setsGrade(String sGrade) {
        this.sGrade = sGrade == null ? null : sGrade.trim();
    }

    public String getsAccount() {
        return sAccount;
    }

    public void setsAccount(String sAccount) {
        this.sAccount = sAccount == null ? null : sAccount.trim();
    }

    public String getsIdnum() {
        return sIdnum;
    }

    public void setsIdnum(String sIdnum) {
        this.sIdnum = sIdnum == null ? null : sIdnum.trim();
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    public String getsNation() {
        return sNation;
    }

    public void setsNation(String sNation) {
        this.sNation = sNation == null ? null : sNation.trim();
    }

    public String getsAddr() {
        return sAddr;
    }

    public void setsAddr(String sAddr) {
        this.sAddr = sAddr == null ? null : sAddr.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsOrigin() {
        return sOrigin;
    }

    public void setsOrigin(String sOrigin) {
        this.sOrigin = sOrigin == null ? null : sOrigin.trim();
    }

    public String getsGraduateDate() {
        return sGraduateDate;
    }

    public void setsGraduateDate(String sGraduateDate) {
        this.sGraduateDate = sGraduateDate == null ? null : sGraduateDate.trim();
    }

    public String getsEnrollDate() {
        return sEnrollDate;
    }

    public void setsEnrollDate(String sEnrollDate) {
        this.sEnrollDate = sEnrollDate == null ? null : sEnrollDate.trim();
    }

    public String getsDegree() {
        return sDegree;
    }

    public void setsDegree(String sDegree) {
        this.sDegree = sDegree == null ? null : sDegree.trim();
    }
}