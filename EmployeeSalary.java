public class EmployeeSalary {
    public static void main(String[] args) {
            EmployeeSalary object = new EmployeeSalary();
            object.CalculateSal("sahil" , 20000 , 1);

    }
    String name;
    float salary;
    int id;
    public void CalculateSal (String name, float salary , int id){
        float Calculate = salary * 12 ;
        System.out.println( name + "'s the total yearly salary is " + Calculate );
    }
}
