package utils;

import bean.AdminLoginBean;
import bean.StudentLoginBean;

import java.util.ArrayList;
import java.util.List;

public class LoginUtils {

    private JDBCUtils mJDBCUtils = JDBCUtils.getInstance();

    public LoginUtils() {
        mJDBCUtils.getConnection();
    }

    public String login(String username, String password, int type) {
        String res = "登录失败";
        List<Object> params = new ArrayList<Object>();
        params.add(username);
        params.add(password);
        if (type == 0) {
            // 学生登录
            String sql = "select * from STUDENT_LOGIN_INFO where u_account = ? and u_password = ?";
            try {
                StudentLoginBean bean = mJDBCUtils.findSimpleRefResult(sql, params, StudentLoginBean.class);
                if (bean != null) {
                    Constants.loginUser = bean;
                    res = "登录成功";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (type == 1) {
            // 管理员登录
            String sql = "select * from ADMIN_LOGIN_INFO where a_account = ? and a_password = ?";
            try {
                AdminLoginBean bean = mJDBCUtils.findSimpleRefResult(sql, params, AdminLoginBean.class);
                if (bean != null) {
                    Constants.loginUser = bean;
                    res = "登录成功";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    private void logOut() {
        Constants.loginUser = null;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (mJDBCUtils != null) {
            mJDBCUtils.releaseConn();
            mJDBCUtils = null;
        }
        System.out.println(this.getClass().toString() + "销毁了");
    }
}
