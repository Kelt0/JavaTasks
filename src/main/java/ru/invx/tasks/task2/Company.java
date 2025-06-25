package ru.invx.tasks.task2;

import java.util.Objects;

public class Company {
    private String name;
    private String inn;
    private String orgn;

    public Company(String name, String inn, String orgn) {
        this.inn = inn;
        this.orgn = orgn;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(inn, company.inn) && Objects.equals(orgn, company.orgn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inn, orgn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getOrgn() {
        return orgn;
    }

    public void setOrgn(String orgn) {
        this.orgn = orgn;
    }
}
