package top.leafii.testonline.common.domain;

import java.util.Date;

public class UploadFile {
    private Integer id;

    private String originalfilename;

    private String name4save;

    private String path;

    private String contenttype;

    private Integer size;

    private Date uploadtime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalfilename() {
        return originalfilename;
    }

    public void setOriginalfilename(String originalfilename) {
        this.originalfilename = originalfilename == null ? null : originalfilename.trim();
    }

    public String getName4save() {
        return name4save;
    }

    public void setName4save(String name4save) {
        this.name4save = name4save == null ? null : name4save.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype == null ? null : contenttype.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}