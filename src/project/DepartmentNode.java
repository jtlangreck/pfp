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
  

    private DepartmentNode next;

    public DepartmentNode(String Name) {
        this.Name = Name;
       
        this.next = null;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   

     public DepartmentNode getNext() {
        return next;
    }

    public void setNext(DepartmentNode next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return "DepartmentNode{" + "Name=" + Name + ", next=" + next + '}';
    }
    
    

    
}
