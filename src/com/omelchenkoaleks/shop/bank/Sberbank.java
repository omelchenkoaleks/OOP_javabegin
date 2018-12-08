package com.omelchenkoaleks.shop.bank;

public class Sberbank extends AbstractBank {

    public Sberbank() {
        super();
    }

    public Sberbank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void giveCredit() {
        // можно добавить свою реализацию
    }
}
