package com.omelchenkoaleks.shop.interfaces;

public interface BankInterface {

    // два метода общего поведения
    void checkInfo();
    void giveCredit();

    // два метода, которые обязывают все банки иметь имя и получать описание кредитов
    String getName();
    String getCreditDescription();
}
