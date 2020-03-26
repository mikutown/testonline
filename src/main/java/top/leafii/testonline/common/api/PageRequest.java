package top.leafii.testonline.common.api;

/**
 * @author 叶蕴森
 * 分页传递参数用
 */
public class PageRequest {
    private Integer pageNum = 1;
    private Integer pageSize = 20;

    public PageRequest() {
    }

    public PageRequest(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public PageRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public PageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}
