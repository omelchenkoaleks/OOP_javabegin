package com.omelchenkoaleks.shop.client;

import com.omelchenkoaleks.shop.interfaces.VisitorInterface;

public class BaseVisitor implements VisitorInterface {

    private String name;


    public void buy() {

    }

    public void returnGoods() {

    }

    @Override
    public String getName() {
        return name;
    }
}
