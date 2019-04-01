package Interfaces;

import javax.naming.event.ObjectChangeListener;
import java.util.List;
import java.util.Map;

public interface IDbOperations<T> {
    boolean updateItem(String sql, List<Object> params);

    boolean addItem(String sql, List<Object> params);

    boolean deleteItemById(String sql, List<Object> params);

    List<Map<String, Object>> findAllItems(String sql);

    List<T> findAllItems(String sql, Class<T> cls);

    Map<String, Object> findOneItem(String sql, List<Object> params);

    T findOneItem(String sql, List<Object> params, Class<T> cls);

    boolean containItem(String sql, List<Object> params);
}
