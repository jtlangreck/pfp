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
    private String deptName ="";
    private DepartmentNode next;
    
    
    
    
    public DepartmentNode(String deptName){
        this.deptName = deptName;
        this.next = null;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public DepartmentNode getNext() {
        return next;
    }

    public void setNext(DepartmentNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DepartmentNode{" + "deptName=" + deptName + ", next=" + next + '}';
    }
    
    
    
}
