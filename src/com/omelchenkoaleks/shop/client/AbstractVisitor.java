package com.omelchenkoaleks.shop.client;

import com.omelchenkoaleks.shop.goods.Televisor;
import com.omelchenkoaleks.shop.interfaces.GoodsInterface;
import com.omelchenkoaleks.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy(GoodsInterface goods) {

        System.out.println(goods.getName());

        // мы не знаем какой объект сюда будет передаваться во время исполнения
        // программы, поэтому нужна проверка перед приведением типов
        if (goods instanceof Televisor) {
            ((Televisor) goods).selectChannel();
        }
    }

    @Override
    public void returnGoods(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return name;
    }
}
