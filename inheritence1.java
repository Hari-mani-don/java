

class Animal{
  public void makeSound(){
    System.out.println("This is a MakeSound");
  }
}
class Cat extends Animal{
  public void makeSound(){
    System.out.println("This is a cat Class");
  }
}
public class Main{
  public static void main(String args[]){
    Cat cat = new Cat();
    Animal animal = new Animal();
    cat.makeSound();
    animal.makeSound();
    
  }
}
