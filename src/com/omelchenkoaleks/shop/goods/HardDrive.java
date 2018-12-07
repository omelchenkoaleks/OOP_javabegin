package com.omelchenkoaleks.shop.goods;

public class HardDrive extends ElectronicDevice {

    private int volume;

    public HardDrive(String name) {
        super(name);
    }


    public void format() {

    }

    public void copy() {

    }

    public void delete() {
    }

    @Override
    public void on() {
        // специфическое включение жесткого диска
    }

    @Override
    public void off() {
        // специфическое отключение жесткого диска
    }
}
