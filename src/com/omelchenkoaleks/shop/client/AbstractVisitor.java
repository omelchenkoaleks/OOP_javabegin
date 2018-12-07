package com.omelchenkoaleks.shop.client;

import com.omelchenkoaleks.shop.interfaces.GoodsInterface;
import com.omelchenkoaleks.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy(GoodsInterface goods) {
        System.out.println(goods.getName());
    }

    @Override
    public void returnGoods(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return name;
    }
}
