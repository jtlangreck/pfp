/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author tholm
 */
public class EmployeeNode {

    private String firstName;
    private String lastName;
    private String gender;
    private String phone;
    private String employeeID;
    private String social;
    private String email;
    private String hireDate;
    private String endDate;

    private EmployeeNode next;

    public EmployeeNode(String firstName, String lastName, String gender, String social, String employeeID, String phone, String email, String hireDate, String endDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phone = phone;
        this.employeeID = employeeID;
        this.email = email;
        this.hireDate = hireDate;
        this.endDate = endDate;
        this.social = social;
        this.next = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "EmployeeNode{" + "firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", phone=" + phone + ", employeeID=" + employeeID + ", social=" + social + ", email=" + email + ", hireDate=" + hireDate + ", endDate=" + endDate + ", next=" + next + '}';
    }
    
    

    
}
