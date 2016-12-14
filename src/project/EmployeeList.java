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
       	    EmployeeNode temp;
            EmployeeNode temp2;
            EmployeeNode current;
        
        if(isEmpty()) {
            head = new EmployeeNode(firstName, lastName, gender, social, employeeID, phone, email, hireDate, endDate); 
        } else {
              if ( head.getLastName().compareTo(lastName) < 0) { //if its less t han
                    temp = head;  // save old head object
                    head = new EmployeeNode(firstName, lastName, gender, social, employeeID, phone, email, hireDate, endDate); //add new head obj
                    head.setNext(temp); //set it as temp
                    return;
                }
                   // Otherwise see where new entry goes, since it is not going to replace the head of list
                current = head; 
                temp = current;
            while(current.getNext() != null) {
                if (current.getLastName().compareTo(lastName)<0) {
                     temp.setNext(new EmployeeNode(firstName, lastName, gender, social, employeeID, phone, email, hireDate, endDate));
                            temp2 = temp.getNext();  // get new objects address
                            temp2.setNext(current); //cset as current
                            return;
                }
                 temp = current;
                 current = current.getNext();
            } 
           if ( current.getLastName().compareTo(lastName) < 0) 
                        {
                            temp.setNext(new EmployeeNode(firstName, lastName, gender, social, employeeID, phone, email, hireDate, endDate));
                     
                            temp2 = temp.getNext();  // get new objects address
                            temp2.setNext(current);
                            return;
                        }
                current.setNext(new EmployeeNode(firstName, lastName, gender, social, employeeID, phone, email, hireDate, endDate));
                      
        }
        
        
        
        return;
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