package com.omelchenkoaleks.shop.client;

import com.omelchenkoaleks.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {

    private float discount;

//    @Override
//    public void buy() {
//        if (!checkDiscount()) {
//            super.buy();
//        } else {
//            // купить со скидкой
//        }
//    }

    private boolean checkDiscount() {
        return discount > 0;
    }
}
