package dev.italoseara.Ex02;

import java.util.Date;

public class DepartmentChief extends Employee {
    private String department;
    private Date promotionDate;

    public DepartmentChief(String name, long id, Date birthDate, Date admissionDate, double salary, String department, Date promotionDate) {
        super(name, id, birthDate, admissionDate, salary);
        this.department = department;
        this.promotionDate = promotionDate;
    }

    public String getDepartment() {
        return this.department;
    }

    public Date getPromotionDate() {
        return this.promotionDate;
    }

    @Override
    public double getLoan() {
        return this.salary * 3;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPromotionDate(Date promotionDate) {
        this.promotionDate = promotionDate;
    }

    @Override
    public String toString() {
        return String.format("DepartmentChief[name=%s, id=%d, birthDate=%s, admissionDate=%s, salary=%f, department=%s, promotionDate=%s]",
                this.name, this.id, this.birthDate, this.admissionDate, this.salary, this.department, this.promotionDate);
    }
}
