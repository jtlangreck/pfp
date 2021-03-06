/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Formatter;
import java.util.logging.LogRecord;

/**
 *
 * @author Jake Langreck
 */
public class Project {

    private static Formatter output;
    private static Scanner input;
    public static EmployeeList empList;
    public static DepartmentList dptr;
    public static AssignmentsList assign;
    public static PayrollList pay;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        empList = readEmployee("Employees.txt");
        assign = readAssignments("Assignments.txt");
        // dptr = readDepartment("Departments.txt");
        //    dptr = readDepartment("Departments.txt");
        //  assign = readAssignment("Assignments.txt");
        new MainForm().setVisible(true);
    }

    public static void openFile(String name) {
        try {
            input = new Scanner(Paths.get(name));
        } catch (IOException ioException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }
    
    public static DepartmentList readDepartments(String name) {
        String content = new String();
        String deptName = "";

        openFile(name);

        DepartmentList list = new DepartmentList();
        while (input.hasNextLine()) {

            content = input.nextLine();

            String[] arr = content.split(" ");
            int position = 1;
            for (String ss : arr) {

                if (position == 1) {
                    deptName = ss;
                }

                position++;

            }
            list.add(deptName);
        }

        return list;

    }
    
        public static PayrollList readPayroll(String name) {
        String content = new String();
        String Rank = "";
        String Salary = "";

        openFile(name);

        PayrollList list = new PayrollList();
        while (input.hasNextLine()) {

            content = input.nextLine();

            String[] arr = content.split(" ");
            int position = 1;
            for (String ss : arr) {

                if (position == 1) {
                    Rank = ss;
                }
                
                if (position == 2) {
                    Salary = ss;
                }

                position++;

            }
            list.add(Rank, Salary);
        }

        return list;

    }

    public static EmployeeList readEmployee(String name) {
        String content = new String();
        String firstName = "";
        String lastName = "";
        String gender = "";
        String phone = "";
        String email = "";
        String id = "";
        String hireDate = "";
        String endDate = "";
        String social = "";

        openFile(name);

        EmployeeList list = new EmployeeList();
        while (input.hasNextLine()) {

            content = input.nextLine();

            String[] arr = content.split(" ");
            int position = 1;
            for (String ss : arr) {

                if (position == 1) {
                    lastName = ss;
                }

                if (position == 2) {
                    firstName = ss;
                }

                if (position == 3) {
                    gender = ss;
                }

                if (position == 4) {
                    phone = ss;
                }

                if (position == 5) {
                    id = ss;
                }

                if (position == 6) {
                    social = ss;
                }

                if (position == 7) {
                    email = ss;
                }

                if (position == 8) {
                    hireDate = ss;
                }
                if (position == 9) {
                    endDate = ss;
                }

                position++;

            }
            list.add(firstName, lastName, gender, social, id, phone, email, hireDate, endDate);
        }

        return list;

    }

    public static void addEmpRecords(EmployeeList list) {
        try {
            output = new java.util.Formatter("Employees.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }

        EmployeeNode test = list.getHead();
        for (int i = 0; i < list.size(); i++) {

            output.format("%s %s %s %s %s %s %s %s %s%n", test.getLastName(),
                    test.getFirstName(), test.getGender(), test.getPhone(),
                    test.getEmployeeID(), test.getSocial(),
                    test.getEmail(), test.getHireDate(), test.getEndDate());

            test = test.getNext();
        }

    }

    public static AssignmentsList readAssignments(String name) {
        String content = new String();
        String empID = "";
        String department = "";
        String rank = "";
        String beginDate = "";
        String endDate = "";

        openFile(name);

        AssignmentsList list = new AssignmentsList();
        while (input.hasNextLine()) {

            content = input.nextLine();

            String[] arr = content.split(" ");
            int position = 1;
            for (String ss : arr) {

                if (position == 1) {
                    empID = ss;
                }

                if (position == 2) {
                    department = ss;
                }

                if (position == 3) {
                    rank = ss;
                }

                if (position == 4) {
                    beginDate = ss;
                }

                if (position == 5) {
                    endDate = ss;
                }

                position++;

            }
            list.add(department, empID, rank, beginDate, endDate);
        }

        return list;

    }

    public static void addToAssList(AssignmentsList list) {
        try {
            output = new Formatter("Assignments.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }

        AssignmentNode test = list.getHead();
        for (int i = 0; i < list.size(); i++) {

            output.format("%s %s %s %s %s%n", test.getEmployeeID(),
                    test.getDepartment(), test.getRank(), test.getBeginDate(),
                    test.getEndDate());

            test = test.getNext();
        }

    }

    public static void closeFile() {
        if (output != null) {
            output.close();
        }

    }

}
