package java_bug_nest.src.employee_management;

import java.util.Objects;

public class PartTimeEmployee {
  protected double hoursWorked;
  protected double hourlyRate;
  private int employeeId;
  private String name;

  public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
    this.employeeId = employeeId;
    this.name = name;
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
    setHoursWorked(hoursWorked);
    setHourlyRate(hourlyRate);
  }

  public double calculatePay() {
    return hoursWorked * hourlyRate;
  }

  public double getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    if (hourlyRate >= 0){
      this.hourlyRate = hourlyRate;
    }
    else {
      System.out.println("Invalid hourly rate");
    }
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "PartTimeEmployee{" +
            "employeeId=" + employeeId +
            ", name='" + name + '\'' +
            ", hoursWorked=" + hoursWorked +
            ", hourlyRate=" + hourlyRate +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartTimeEmployee that = (PartTimeEmployee) o;
    return Double.compare(hoursWorked, that.hoursWorked) == 0 && Double.compare(hourlyRate, that.hourlyRate) == 0 && employeeId == that.employeeId && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hoursWorked, hourlyRate, employeeId, name);
  }
}
