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
public class PayrollNode {
    private String Rank ="";
    private String Salary = "";
    private PayrollNode next;
    
    
    
    
    public PayrollNode(String Rank, String Salary){
        this.Rank = Rank;
        this.Salary = Salary;
        this.next = null;
      
    }

    
    
    public String getRank() {
        return Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }
    
      public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }


    public PayrollNode getNext() {
        return next;
    }

    public void setNext(PayrollNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "PayrollNode{" + "Rank=" + Rank + ", Salary=" +Salary + ", next=" + next + '}';
    }
    
    
    
}
