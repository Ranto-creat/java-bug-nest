package java_bug_nest.src.employee_management;

import java.util.Objects;

public class FullTimeEmployee {
  protected double monthlySalary;
  private int employeeId;
  private String name;

  public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
    this.employeeId = employeeId;
    this.name = name;
    this.monthlySalary = monthlySalary;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getName() {
    return name;
  }

  public double getMonthlySalary() {
    return monthlySalary;
  }

  public double calculatePay() {
    return monthlySalary;
  }

  @Override
  public String toString() {
    return "FullTimeEmployee{" +
            "employeeId=" + employeeId +
            ", name='" + name + '\'' +
            ", monthlySalary=" + monthlySalary +
           '}';
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FullTimeEmployee that = (FullTimeEmployee) o;
    return employeeId == that.employeeId && Double.compare(monthlySalary, that.monthlySalary) == 0 && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, name, monthlySalary);
  }
}
