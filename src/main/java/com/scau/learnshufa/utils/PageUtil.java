package com.scau.learnshufa.utils;

import java.util.List;

public class PageUtil<T> {

    //已知数据
    private int pageNum;  //当前页
    private int pageSize; //每页显示的数据条数
    private int totalRecord; //总的记录条数，查询数据库得到的

    //需要计算得来
    private int totalPage; //总页数 totalRecord/pageSize
    //开始索引，也就是我们在数据库中要从第几行数据开始拿，有了atartIndex和pageSize
    //就知道了limit语句的两个数据，就能获得每页需要显示的数据了
    private int startIndex;
    //将每页要显示的数据放在List集合中
    private List<T> list;
    //分页显示的数据开始和结尾
    private int start;
    private int end;

    public PageUtil(int pageNum, int pageSize, int totalRecord) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;

        if (totalRecord % pageSize == 0) {
            this.totalPage = totalRecord / pageSize;
        } else {
            this.totalPage = totalRecord / pageSize + 1;
        }
        this.startIndex = (pageNum - 1) * pageSize;
        this.start = 1;
        this.end = 5;
        //显示页数的算法
        //显示5页
        if (totalPage <= 5) {
            // 总页数都小于5，那么end就为总页数的值了
            this.end = this.totalPage;
        } else {
            // 总页数大于5，那么就要根据当前是第几页，来判断start 和end
            this.start = pageNum - 2;
            this.end = pageNum + 2;

            if (start < 0) {
                this.start = 1;
                this.end = 5;
            }
            if(end > this.totalPage){
                this.end = totalPage;
                this.start = end - 5;
            }
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
