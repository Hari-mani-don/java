class Manager extends employee{
    private double bonus;
    Manager(String name, double salary, String joiningDate, double bonus){
        super(name, salary, joiningDate);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
   public void diplayInfo(){
       double totalSalay = getSalary() + bonus;
       System.out.println("Name: "+ getName());
       System.out.println("Salary: "+ totalSalay);   
       System.out.println("Date of Joining: "+ getJoiningDate());
       System.out.println("Bonus: "+ getBonus());
    }
}
