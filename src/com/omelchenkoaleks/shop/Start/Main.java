package com.omelchenkoaleks.shop.Start;

import com.omelchenkoaleks.shop.client.CommonVisitor;
import com.omelchenkoaleks.shop.goods.Computer;
import com.omelchenkoaleks.shop.goods.Televisor;

public class Main {

    public static void main(String[] args) {

        Televisor televisor = new Televisor("Samsung");
        Computer computer = new Computer("MacBook");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(televisor);
        commonVisitor.buy(computer);
    }
}
