package bean;

public class AdminLoginBean {
    private Integer a_id;

    private String a_account;

    private String a_password;

    public Integer getaId() {
        return a_id;
    }

    public void setaId(Integer aId) {
        this.a_id = aId;
    }

    public String getaAccount() {
        return a_account;
    }

    public void setaAccount(String aAccount) {
        this.a_account = aAccount == null ? null : aAccount.trim();
    }

    public String getaPassword() {
        return a_password;
    }

    public void setaPassword(String aPassword) {
        this.a_password = aPassword == null ? null : aPassword.trim();
    }
}