package com.omelchenkoaleks.shop.bank;

import com.omelchenkoaleks.shop.interfaces.BankInterface;

/*
    Класс AbstractBank является промежуточным классом. Если его не было пришлось бы
    прописывать переменные и методы в каждом классе реализации.
 */
public abstract class AbstractBank implements BankInterface {

    private String name;
    private String creditDescription;

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }

    public void checkInfo() {}

    public void giveCredit() {}
}
