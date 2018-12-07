package com.omelchenkoaleks.shop;

import com.omelchenkoaleks.shop.client.BaseVisitor;
import com.omelchenkoaleks.shop.department.BaseDepartment;
import com.omelchenkoaleks.shop.service.Administrator;

import java.util.ArrayList;

// Торговый зал
public class SalesRoom {

    // в каждом отделе есть свои сотрудники
    private ArrayList<BaseDepartment> deparmentList;

    private String name;

    private ArrayList<BaseVisitor> visitorList;

    private Administrator administrator;
}
