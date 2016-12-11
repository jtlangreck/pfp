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
public class AssignmentNode {

    private String Department;
    private String employeeID;
    private String lastName;
    private String firstName;
    private String Rank;
    private String beginDate;
    private String endDate;

    private AssignmentNode next;

    public AssignmentNode(String Department, String employeeID, String lastName, String firstName, String Rank, String beginDate, String endDate) {
        this.Department = Department;
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.Rank = Rank;
        this.beginDate = beginDate;
        this.endDate = endDate;
       
        this.next = null;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
    public String getEmployeeID() {
        return employeeID;
    }
    
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
   

    public AssignmentNode getNext() {
        return next;
    }

    public void setNext(AssignmentNode next) {
        this.next = next;
    }

   

    

    @Override
    public String toString() {
        return "AssignmentNode{" + "Department=" + Department + ", employeeID=" + employeeID + ", lastName=" + lastName + ", firstName=" + firstName + ", Rank=" + Rank + ", beginDate=" + beginDate + ", endDate=" + endDate +", next=" + next + '}';
    }
    
    

    
}
