package com.whc.aip.adv.model.category;

import com.whc.aip.adv.model.base.BaseDO;

public class AdvCategory extends BaseDO{
    private String categoryId;

    private String categoryCode;

    private String categoryName;

    private String categorySerialno;

    private String categoryParentid;

    private String categoryDescription;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategorySerialno() {
        return categorySerialno;
    }

    public void setCategorySerialno(String categorySerialno) {
        this.categorySerialno = categorySerialno;
    }

    public String getCategoryParentid() {
        return categoryParentid;
    }

    public void setCategoryParentid(String categoryParentid) {
        this.categoryParentid = categoryParentid;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}