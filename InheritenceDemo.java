public class inheritenceDemo {
    public static void main(String args[]){
        employee Emplo = new employee("hari", 2000, "20/03/2003");
        Emplo.diplayInfo();
        
        //System.out.println(em);
        //double em = Emplo.rasiseSalary(100);
        
        System.out.println();
       // Emplo.rasiseSalary("mani", 20000, 10);
       Manager m1 = new Manager("mani", 50000, "20/03/2023", 50);
    
      m1.diplayInfo();
      employee e2= new Manager("hari", 200, "20/03/2000", 5000);
      e2.diplayInfo();

    }
}
