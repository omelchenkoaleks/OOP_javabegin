package com.omelchenkoaleks.shop.bank;

public class Sberbank extends AbstractBank {


    public Sberbank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        // можно добавить свою реализацию
    }

    @Override
    public void giveCredit() {
        // можно добавить свою реализацию
    }
}
