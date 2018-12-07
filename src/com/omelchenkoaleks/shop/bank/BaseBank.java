package com.omelchenkoaleks.shop.bank;

import com.omelchenkoaleks.shop.interfaces.BankInterface;

/*
    Класс BaseBank является промежуточным классом. Если его не было пришлось бы
    прописывать переменные и методы в каждом классе реализации.
 */
public class BaseBank implements BankInterface {

    private String name;
    private String creditDescription;

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
