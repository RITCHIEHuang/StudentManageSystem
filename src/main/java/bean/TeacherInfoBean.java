package bean;

public class TeacherInfoBean {
    private Integer t_id;

    private String t_name;

    private String t_phone;

    public Integer gettId() {
        return t_id;
    }

    public void settId(Integer tId) {
        this.t_id = tId;
    }

    public String gettName() {
        return t_name;
    }

    public void settName(String tName) {
        this.t_name = tName == null ? null : tName.trim();
    }

    public String gettPhone() {
        return t_phone;
    }

    public void settPhone(String tPhone) {
        this.t_phone = tPhone == null ? null : tPhone.trim();
    }
}