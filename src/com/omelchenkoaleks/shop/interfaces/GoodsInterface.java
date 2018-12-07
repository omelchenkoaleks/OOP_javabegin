package com.omelchenkoaleks.shop.interfaces;

public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartamentInterface getDepartment();

    String getCompany();
}
