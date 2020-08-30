package com.reader.util;/*
 * @Author 高凌峰
 * @Date 2020-08-30 0:18
 */

public class Page {
    //当前页
    private Integer page=1;
    //页大小
    private Integer rows =10;
    //总记录数
    private Integer totalRecord;
    //总页数
    private Integer totalPage;
    //关键字类型1
    private String keyType;
    //查询关键字1
    private String keyWord;
    //关键字类型1
    private String type;
    //查询关键字2
    private String word;
    //关键字类型2
    private String keytype;
    //查询关键字3
    private String keyword;
    //开始记录位置
    private Integer start;
    //用户Id
    private String userid;
    //其他用户Id
    private String otherid;

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Integer getRows() {
        return rows;
    }
    public void setRows(Integer rows) {
        this.rows = rows;
    }
    public Integer getTotalRecord() {
        return totalRecord;
    }
    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }
    public Integer getTotalPage() {
        totalPage = (totalRecord-1)/rows+1;
        return totalPage;
    }
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
    public String getKeyType() {
        return keyType;
    }
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
    public String getKeyWord() {
        return keyWord;
    }
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    public Integer getStart() {
        start = (page-1)*rows;
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getOtherid() {
        return otherid;
    }
    public void setOtherid(String otherid) {
        this.otherid = otherid;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getKeytype() {
        return keytype;
    }
    public void setKeytype(String keytype) {
        this.keytype = keytype;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Page(Integer page, Integer rows, Integer totalRecord, Integer totalPage, String keyType, String keyWord,
                String type, String word, String keytype2, String keyword2, Integer start, String userid, String otherid) {
        super();
        this.page = page;
        this.rows = rows;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.keyType = keyType;
        this.keyWord = keyWord;
        this.type = type;
        this.word = word;
        keytype = keytype2;
        keyword = keyword2;
        this.start = start;
        this.userid = userid;
        this.otherid = otherid;
    }
    public Page() {
    }
    @Override
    public String toString() {
        return "Page [Page=" + page + ", rows=" + rows + ", totalRecord=" + totalRecord + ", totalPage=" + totalPage
                + ", keyType=" + keyType + ", keyWord=" + keyWord + ", type=" + type + ", word=" + word + ", keytype="
                + keytype + ", keyword=" + keyword + ", start=" + start + ", userid=" + userid + ", otherid=" + otherid
                + "]";
    }
}
