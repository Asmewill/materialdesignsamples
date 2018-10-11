package com.zhouwei.md.materialdesignsamples.bean;


import java.io.Serializable;
import java.util.List;

public class SchemeShopDto extends SchemeShop implements Serializable {

    private List<SchemeRebate> schemeRebateList;

    public List<SchemeRebate> getSchemeRebateList() {
        return schemeRebateList;
    }

    public void setSchemeRebateList(List<SchemeRebate> schemeRebateList) {
        this.schemeRebateList = schemeRebateList;
    }
}
