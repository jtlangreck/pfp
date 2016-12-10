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
public class EmployeeList {
    private EmployeeNode head;
    
    public EmployeeList() {  
    }

    public EmployeeNode getHead() {
        return head;
    }

    public void setHead(EmployeeNode head) {
        this.head = head;
    }
    
    public boolean isEmpty() {
        if(head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String firstName, String lastName, String gender, String social, String employeeID, String phone, String email, String hireDate, String endDate) {
        if(isEmpty()) {
            head = new EmployeeNode(firstName, lastName, gender, social, employeeID, phone, email, hireDate, endDate); 
        } else {
            EmployeeNode current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            } 
            current.setNext(new EmployeeNode(firstName, lastName, gender, social, employeeID, phone, email, hireDate, endDate));
        }
    }
        
     public Integer size() {
         Integer size = 0;
         EmployeeNode current = head;
         while (current != null) {
             size++;
             current = current.getNext();
         }
         return size;
     }
}