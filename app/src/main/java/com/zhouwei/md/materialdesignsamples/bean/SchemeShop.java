/**
 * COPYRIGHT (C) 2016 Liuzh. ALL RIGHTS RESERVED.
 * <p>
 * No part of this publication may be reproduced, stored in a retrieval system,
 * or transmitted, on any form or by any means, electronic, mechanical, photocopying,
 * recording, or otherwise, without the prior written permission of Liuzh.
 * <p>
 * Created By: Liuzh
 * Created On: 2016-11-18 15:56:39
 * <p>
 * Amendment History:
 * <p>
 * Amended By       Amended On      Amendment Description
 * ------------     -----------     ---------------------------------------------
 **/
package com.zhouwei.md.materialdesignsamples.bean;

public class SchemeShop {

    private Long schemeShopId;
    private Long schemeId;

    private Long shopId;
    private String shopName;

    private Long regionId;
    private Long country;
    private Long provinceId;
    private Long city;
    private Long thana;

    private String createdBy;
    private String createdTime;
    private String updatedBy;
    private String updatedTime;

    public Long getSchemeShopId() {
        return schemeShopId;
    }

    public void setSchemeShopId(Long schemeShopId) {
        this.schemeShopId = schemeShopId;
    }

    public Long getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public Long getThana() {
        return thana;
    }

    public void setThana(Long thana) {
        this.thana = thana;
    }
}

