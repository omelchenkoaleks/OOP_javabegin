package com.omelchenkoaleks.shop.goods;

import com.omelchenkoaleks.shop.department.BaseDepartment;
import com.omelchenkoaleks.shop.interfaces.DepartamentInterface;
import com.omelchenkoaleks.shop.interfaces.GoodsInterface;

public abstract class BaseGoods implements GoodsInterface {

    // свойства, которые будут иметь все товары

    private double price;
    private  boolean hasGuarantee;
    private String name;
    private BaseDepartment department;
    private String company;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DepartamentInterface getDepartment() {
        return department;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
