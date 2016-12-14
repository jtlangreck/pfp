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
public class PayrollList {

    private PayrollNode head;
    

    public PayrollList() {
    }

    public PayrollNode getHead() {
        return head;
    }

    public void setHead(PayrollNode head) {
        this.head = head;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String Rank, String Salary) {
        if (isEmpty()) {
            head = new PayrollNode(Rank, Salary);
        } else {
            PayrollNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new PayrollNode(Rank, Salary));
        }
    }
    

    public Integer size() {
        Integer size = 0;
        PayrollNode current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

}
