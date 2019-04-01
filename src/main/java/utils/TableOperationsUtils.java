package utils;

import Interfaces.IDbOperations;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TableOperationsUtils<T> implements IDbOperations<T> {

    private JDBCUtils mJDBCUtils = JDBCUtils.getInstance();

    public TableOperationsUtils() {
        mJDBCUtils.getConnection();
    }

    public boolean updateItem(String sql, List<Object> params) {
        return updateOrAddOrDelete(sql, params);
    }


    public boolean addItem(String sql, List<Object> params) {
        return updateOrAddOrDelete(sql, params);
    }

    public boolean deleteItemById(String sql, List<Object> params) {
        return updateOrAddOrDelete(sql, params);
    }

    private boolean updateOrAddOrDelete(String sql, List<Object> params) {
        boolean flag = false;
        try {
            flag = mJDBCUtils.updateByPreparedStatement(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public List<Map<String, Object>> findAllItems(String sql) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            list = mJDBCUtils.findMoreResult(sql, null);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<T> findAllItems(String sql, Class<T> cls) {
        List<T> list = new ArrayList<T>();
        try {
            list = mJDBCUtils.findMoreRefResult(sql, null, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String, Object> findOneItem(String sql, List<Object> params) {
        Map<String, Object> item = null;
        try {
            item = mJDBCUtils.findSimpleResult(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    public T findOneItem(String sql, List<Object> params, Class<T> cls) {
        T item = null;
        try {
            item = mJDBCUtils.findSimpleRefResult(sql, params, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    public boolean containItem(String sql, List<Object> params) {
        boolean flag = false;
        try {
            Map<String, Object> item = mJDBCUtils.findSimpleResult(sql, params);
            if (item == null) flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
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
