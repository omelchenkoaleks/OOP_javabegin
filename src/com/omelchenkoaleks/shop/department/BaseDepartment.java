package com.omelchenkoaleks.shop.department;

import com.omelchenkoaleks.shop.interfaces.DepartamentInterface;
import com.omelchenkoaleks.shop.interfaces.EmployeeInterface;
import com.omelchenkoaleks.shop.interfaces.GoodsInterface;

import java.util.ArrayList;

// Отдел
public class BaseDepartment implements DepartamentInterface {

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return null;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }
}
