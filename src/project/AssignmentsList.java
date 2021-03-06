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
    
    public void add(String Department, String employeeID, String Rank, String beginDate, String endDate) {
           AssignmentNode temp;
            AssignmentNode temp2;
            AssignmentNode current;
        
        if(isEmpty()) {
            head = new AssignmentNode(Department, employeeID, Rank,beginDate, endDate);
           } else {
              if ( head.getDepartment().compareTo(Department) > 0) { //if its less t han
                    temp = head;  // save old head object
                     head = new AssignmentNode(Department, employeeID, Rank,beginDate, endDate);
                     head.setNext(temp); //set it as temp
                    return;
                }
                   
                   // Otherwise see where new entry goes, since it is not going to replace the head of list
                current = head; 
                temp = current;
            while(current.getNext() != null) {
                if (current.getDepartment().compareTo(Department)>0) {
                     temp.setNext(new AssignmentNode(Department, employeeID, Rank,beginDate, endDate));
                            temp2 = temp.getNext();  // get new objects address
                            temp2.setNext(current); //cset as current
                            return;
                }
                 temp = current;
                 current = current.getNext();
            } 
           if ( current.getDepartment().compareTo(Department) > 0) 
                        {
                            temp.setNext(new AssignmentNode(Department, employeeID, Rank,beginDate, endDate));
        
                            temp2 = temp.getNext();  // get new objects address
                            temp2.setNext(current);
                            return;
                        }
                current.setNext(new AssignmentNode(Department, employeeID, Rank,beginDate, endDate));
        
        }
        
        
        
        return;
        
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