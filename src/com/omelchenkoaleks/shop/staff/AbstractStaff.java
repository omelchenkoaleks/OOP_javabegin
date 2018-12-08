package com.omelchenkoaleks.shop.staff;

import com.omelchenkoaleks.shop.interfaces.DepartamentInterface;
import com.omelchenkoaleks.shop.interfaces.StaffInterface;

public abstract class AbstractStaff implements StaffInterface {

    // общие свойства для всех сотрудников

    private String name;
    private DepartamentInterface department;
    private boolean free;

    public AbstractStaff() {
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DepartamentInterface getDepartment() {
        return department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(DepartamentInterface department) {
        this.department = department;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
