package com.zhouwei.md.materialdesignsamples.bean;

public class SchemePageRequest {
    int pageNo = 1;
    int pageSize = 15;

    OrderBy orderBy = new OrderBy();
    public SchemeParam params;

    class OrderBy {
        String createdTime = "desc";
    }
}
