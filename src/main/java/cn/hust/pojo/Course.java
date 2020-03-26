package cn.hust.pojo;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer cid;
    private String ccode;
    private Integer tid;
    private String cname;
    private Integer categoryid;
    private Integer credit;
    private String ctarget;
    private String department;
    private String cweek;
    private String cday;
    private String clesson;

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", ccode='" + ccode + '\'' +
                ", tid=" + tid +
                ", cname='" + cname + '\'' +
                ", categoryid=" + categoryid +
                ", credit=" + credit +
                ", ctarget='" + ctarget + '\'' +
                ", department='" + department + '\'' +
                ", cweek='" + cweek + '\'' +
                ", cday='" + cday + '\'' +
                ", clesson='" + clesson + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getCtarget() {
        return ctarget;
    }

    public void setCtarget(String ctarget) {
        this.ctarget = ctarget;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCweek() {
        return cweek;
    }

    public void setCweek(String cweek) {
        this.cweek = cweek;
    }

    public String getCday() {
        return cday;
    }

    public void setCday(String cday) {
        this.cday = cday;
    }

    public String getClesson() {
        return clesson;
    }

    public void setClesson(String clesson) {
        this.clesson = clesson;
    }
}
