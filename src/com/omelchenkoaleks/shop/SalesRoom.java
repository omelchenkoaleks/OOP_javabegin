package com.omelchenkoaleks.shop;

import com.omelchenkoaleks.shop.interfaces.DepartamentInterface;
import com.omelchenkoaleks.shop.interfaces.VisitorInterface;
import com.omelchenkoaleks.shop.service.Administrator;

import java.util.ArrayList;

// Торговый зал
public class SalesRoom {

    // в каждом отделе есть свои сотрудники
    private ArrayList<DepartamentInterface> deparmentList;

    private String name;

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;
}
