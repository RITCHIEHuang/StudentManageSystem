package utils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TableOperationsUtils {

    private JDBCUtils mJDBCUtils = JDBCUtils.getInstance();
    private String tablename;

    public TableOperationsUtils(String name) {
        mJDBCUtils.getConnection();
        this.tablename = name;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public List<Map<String, Object>> getAllItems() {
        String sql = "select * from " + getTablename();
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            list = mJDBCUtils.findMoreResult(sql, null);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (mJDBCUtils != null) {
            mJDBCUtils.releaseConn();
            mJDBCUtils = null;
        }
        System.out.println(this.getClass().toString() + "销毁了");
    }
}
