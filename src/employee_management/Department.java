package java_bug_nest.src.employee_management;

import java.util.HashSet;
import java.util.Set;

/** TODO : a department is a collection of employees. It has a name and a set of employees in it. */
public class Department {
  private String DepartmentName;
  private Set<FullTimeEmployee> FullTimeEmployees;
  private Set<PartTimeEmployee> PartTimeEmployees;

  public Department(String DepartmentName) {
    this.DepartmentName = DepartmentName;
    this.FullTimeEmployees = new HashSet<>();
    this.PartTimeEmployees = new HashSet<>();
  }

  /**
   * TODO : Employees should never ever be duplicated in a single department. Please check if it
   * already exists in the department before inserting if need be. Duplicate here means : their
   * employee id and name are the same.
   *
   * <p>TODO : for our HR officer, give a function to show all details about employees, including
   * their pay.
   */
  // Polymorphisme (add, remove employee in employee type and show employee)
  public void addEmployee(FullTimeEmployee employee) {
    if (employee != null && !FullTimeEmployees.contains(employee)) {
      FullTimeEmployees.add(employee);
    }
  }

  public void addEmployee(PartTimeEmployee employee) {
    if (employee != null && !PartTimeEmployees.contains(employee)) {
      PartTimeEmployees.add(employee);
    }
  }

  public void showEmployee() {
    System.out.println("Employee in : " + DepartmentName + ":");
    for (FullTimeEmployee employee : FullTimeEmployees) {
      System.out.println(employee);
    }
    for (PartTimeEmployee employee : PartTimeEmployees) {
      System.out.println(employee);
    }
  }
}
