public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    public double tax(){
        if (this.salary < 1000){
            return salary;
        }else {
            double tax = salary* 0.03;
            return tax;
        }


}
