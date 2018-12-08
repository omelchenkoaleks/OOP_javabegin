package com.omelchenkoaleks.shop.Start;

import com.omelchenkoaleks.shop.client.CommonVisitor;
import com.omelchenkoaleks.shop.goods.Computer;
import com.omelchenkoaleks.shop.goods.Subwoofer;
import com.omelchenkoaleks.shop.goods.Televisor;
import com.omelchenkoaleks.shop.interfaces.GoodsInterface;

public class Main {

    public static void main(String[] args) {

        GoodsInterface goods = new Televisor("Samsung");

        // Вот это и есть приведение типов:
        ((Televisor) goods).selectChannel();

        // Записываем то, на что ссылается переменная goods
//        Televisor t = (Televisor) goods;

//        Computer computer = new Computer("MacBook");
//        Subwoofer subwoofer = new Subwoofer("Microlab");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(goods);
//        commonVisitor.buy(computer);
//        commonVisitor.buy(subwoofer);
    }
}
