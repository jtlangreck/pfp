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
public class DepartmentNode {

    private String Name;
    private String Manager;
    private int numEmployees;
  

    private DepartmentNode next;

    public DepartmentNode(String Name, String Manager, int numEmployees) {
        this.Name = Name;
        this.Manager = Manager;
        this.numEmployees = numEmployees;
        this.next = null;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        
        this.numEmployees = numEmployees;
    }

     public DepartmentNode getNext() {
        return next;
    }

    public void setNext(DepartmentNode next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return "DepartmentNode{" + "Name=" + Name + ", Manager=" + Manager + ", numEmployees=" + numEmployees + ", next=" + next + '}';
    }
    
    

    
}
