package bean;

public class StudentLoginBean {
    private Integer u_id;

    private String u_account;

    private String u_password;

    public Integer getuId() {
        return u_id;
    }

    public void setuId(Integer uId) {
        this.u_id = uId;
    }

    public String getuAccount() {
        return u_account;
    }

    public void setuAccount(String uAccount) {
        this.u_account = uAccount == null ? null : uAccount.trim();
    }

    public String getuPassword() {
        return u_password;
    }

    public void setuPassword(String uPassword) {
        this.u_password = uPassword == null ? null : uPassword.trim();
    }
}