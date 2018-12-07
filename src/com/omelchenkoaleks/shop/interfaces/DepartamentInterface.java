package com.omelchenkoaleks.shop.interfaces;

import java.util.ArrayList;

public interface DepartamentInterface {

    String getName();

    // В этих коллекциях тип Интерфейса, чтобы можно было в них добавлять любые дочерние типы.
    ArrayList<EmployeeInterface> getEmployeeList();
    ArrayList<GoodsInterface> getGoodsList();
}
