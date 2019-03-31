package bean;

public class StudentRecordsInfoBean {
    private Integer r_id;

    private String r_status;

    public Integer getrId() {
        return r_id;
    }

    public void setrId(Integer rId) {
        this.r_id = rId;
    }

    public String getrStatus() {
        return r_status;
    }

    public void setrStatus(String rStatus) {
        this.r_status = rStatus == null ? null : rStatus.trim();
    }
}