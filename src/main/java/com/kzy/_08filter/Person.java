package com.kzy._08filter;

public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person : [ ");
        sb.append("Name : '").append(name).append('\'');
        sb.append(", Gender : '").append(gender).append('\'');
        sb.append(", Marital Status : '").append(maritalStatus).append('\'');
        sb.append(" ]");
        return sb.toString();
    }
}