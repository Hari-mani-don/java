public class employee {
    private String name;
    private double salary;
    private String joiningDate;
    // public employee(){
    //     this.name = " ";
    //     this.salary = 0.0;
    //     this.joiningDate = " ";
    // }
     public employee(String name, double salary, String joiningDate){
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
   public void setJoiningDate(String joiningDate){
         this.joiningDate = joiningDate;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
     public void setSalary(int salary){
        this.salary = salary;
     }
     public double getSalary(){
        return salary;
     }
    // public double rasiseSalary(double percent){
    //     this.salary+= salary * percent /100;
    //     return salary;
    // }
    // // public void rasiseSalary(String name, double salary, int  percent){
    //     this.name = name;
    //     this.salary = salary;
    //    salary+= salary * percent /100;
    //    System.out.println(name);
    //    System.out.println(salary);
       
    // }
    public void diplayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Date of Joining: "+joiningDate);
    }
}

