package com.zhouwei.md.materialdesignsamples.bean;

public class SchemeUserHomeDto {
    private long yesterday;
    private long accumulate;
    private long thisMonth;
    private long thisWeek;

    public long getAccumulate() {
        return accumulate;
    }

    public long getYesterday() {
        return yesterday;
    }

    public void setYesterday(long yesterday) {
        this.yesterday = yesterday;
    }

    public void setAccumulate(long accumulate) {
        this.accumulate = accumulate;
    }

    public long getThisMonth() {
        return thisMonth;
    }

    public void setThisMonth(long thisMonth) {
        this.thisMonth = thisMonth;
    }

    public long getThisWeek() {
        return thisWeek;
    }

    public void setThisWeek(long thisWeek) {
        this.thisWeek = thisWeek;
    }
}
