package bean;

public class DepartmentInfoBean {
    private Integer d_id;

    private String d_name;

    public Integer getdId() {
        return d_id;
    }

    public void setdId(Integer dId) {
        this.d_id = dId;
    }

    public String getdName() {
        return d_name;
    }

    public void setdName(String dName) {
        this.d_name = dName == null ? null : dName.trim();
    }
}