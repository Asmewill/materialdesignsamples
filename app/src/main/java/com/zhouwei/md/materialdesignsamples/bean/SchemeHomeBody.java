package com.zhouwei.md.materialdesignsamples.bean;

public class SchemeHomeBody {
    int pageNo = 1;
    int pageSize = 15;

    OrderBy orderBy = new OrderBy();

    class OrderBy {
        String createdTime = "desc";
    }
}
