package com.example.myapplication.bean;

import java.math.BigDecimal;

public class ShopBean {

    /**
     * id : 2
     * name : pro2
     * startDate : 2018-04-29 14:56:10
     * endDate : 2018-05-01 14:56:15
     * itemId : 0
     * promotionPrice : 0
     */

    private int id;
    private String name;
    private String startDate;
    private String endDate;
    private int itemId;
    private BigDecimal promotionPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }
}
