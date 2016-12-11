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
public class AssignmentsList {
    private AssignmentNode head;
    
    public AssignmentsList() {  
    }

    public AssignmentNode getHead() {
        return head;
    }

    public void setHead(AssignmentNode head) {
        this.head = head;
    }
    
    public boolean isEmpty() {
        if(head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String Department, String employeeID, String lastName, String firstName, String Rank, String beginDate, String endDate) {
        if(isEmpty()) {
            head = new AssignmentNode(Department, employeeID, lastName, firstName, Rank, beginDate, endDate); 
        } else {
            AssignmentNode current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            } 
            current.setNext(new AssignmentNode(Department, employeeID, lastName, firstName, Rank, beginDate, endDate));
        }
    }
        
     public Integer size() {
         Integer size = 0;
         AssignmentNode current = head;
         while (current != null) {
             size++;
             current = current.getNext();
         }
         return size;
     }
}