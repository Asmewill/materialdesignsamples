package com.zhouwei.md.materialdesignsamples.bean;

import java.util.List;

public class Scheme {

    public int schemeId;
    public String schemeName;
    public long qty;
    public long amount;
    public String createdTime;
    public String updatedTime;
    public String schemeStatus;
    public String schemeStartDate;
    public String schemeEndDate;
    public boolean extend = false;

    public List<Sale> list;

    public List<SchemeShopDto> schemeShopList;

    public static class SaleItem{
        public String qty;
        public String num;
    }

    public static class Sale{
        public List<SaleItem> list;
        public String model;
        public String imei;
    }

    public int getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(int schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getSchemeStatus() {
        return schemeStatus;
    }

    public void setSchemeStatus(String schemeStatus) {
        this.schemeStatus = schemeStatus;
    }

    public String getSchemeStartDate() {
        return schemeStartDate;
    }

    public void setSchemeStartDate(String schemeStartDate) {
        this.schemeStartDate = schemeStartDate;
    }

    public String getSchemeEndDate() {
        return schemeEndDate;
    }

    public void setSchemeEndDate(String schemeEndDate) {
        this.schemeEndDate = schemeEndDate;
    }

    public boolean isExtend() {
        return extend;
    }

    public void setExtend(boolean extend) {
        this.extend = extend;
    }

    public List<Sale> getList() {
        return list;
    }

    public void setList(List<Sale> list) {
        this.list = list;
    }

    public List<SchemeShopDto> getSchemeShopList() {
        return schemeShopList;
    }

    public void setSchemeShopList(List<SchemeShopDto> schemeShopList) {
        this.schemeShopList = schemeShopList;
    }
}
