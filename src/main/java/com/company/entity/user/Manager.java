package com.company.entity.user;

import java.util.Objects;

public class Manager extends User {
    private int number;
    private int code;

    public Manager(Long id, String email, String password, int number, int code) {
        super(id, email, password, UserType.MANAGER);
        this.number = number;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return number == manager.number &&
                code == manager.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number, code);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "number=" + number +
                ", code=" + code +
                "} " + super.toString();
    }
}
