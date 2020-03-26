package top.leafii.testonline.common.api;

import com.github.pagehelper.Page;
import top.leafii.testonline.common.domain.User;

import java.util.List;

/**
 * @author 叶蕴森
 * 封装数据总数传到前台
 * @param <T>
 */
public class PagableResponse<T> {
    private long total;
    private T data;//泛型

    public PagableResponse(Page users) {
    }

    public PagableResponse(long total, T data) {
        this.total = total;
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public PagableResponse<T> setTotal(long total) {
        this.total = total;
        return this;
    }

    public T getData() {
        return data;
    }

    public PagableResponse<T> setData(T data) {
        this.data = data;
        return this;
    }
//getter，setter，constructor省略
}