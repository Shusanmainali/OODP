package Workshop2;

class Person {
    void displayInfo() {
        System.out.println("I am a person.");
    }
}

class Employee extends Person {
    void displayRole() {
        System.out.println("I am an employee.");
    }
}

class Manager extends Employee {
    void displayDepartment() {
        System.out.println("I manage a department.");
    }
}


public class Q2 {
	 public static void main(String[] args) {
	        Manager manager = new Manager();
	        manager.displayInfo();
	        manager.displayRole();
	        manager.displayDepartment();
	    }
}
