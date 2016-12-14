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
public class DepartmentList {

    private DepartmentNode head;

    public DepartmentList() {
    }

    public DepartmentNode getHead() {
        return head;
    }

    public void setHead(DepartmentNode head) {
        this.head = head;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String deptName) {
            DepartmentNode temp;
            DepartmentNode temp2;
            DepartmentNode current;
        
        if(isEmpty()) {
            head = new DepartmentNode(deptName); 
        } else {
              if ( head.getDeptName().compareTo(deptName) > 0) { //if its less t han
                    temp = head;  // save old head object
                    head = new DepartmentNode(deptName); //add new head obj
                    head.setNext(temp); //set it as temp
                    return;
                }
                   // Otherwise see where new entry goes, since it is not going to replace the head of list
                current = head; 
                temp = current;
            while(current.getNext() != null) {
                if (current.getDeptName().compareTo(deptName)>0) {
                     temp.setNext(new DepartmentNode(deptName));
                            temp2 = temp.getNext();  // get new objects address
                            temp2.setNext(current); //cset as current
                            return;
                }
                 temp = current;
                 current = current.getNext();
            } 
           if ( current.getDeptName().compareTo(deptName) > 0) 
                        {
                            temp.setNext(new DepartmentNode(deptName));
                     
                            temp2 = temp.getNext();  // get new objects address
                            temp2.setNext(current);
                            return;
                        }
                current.setNext(new DepartmentNode(deptName));
                      
        }
        
        
        
        return;
    }

    public Integer size() {
        Integer size = 0;
        DepartmentNode current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

}
