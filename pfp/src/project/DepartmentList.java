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
        if (isEmpty()) {
            head = new DepartmentNode(deptName);
        } else {
            DepartmentNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new DepartmentNode(deptName));
        }
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
