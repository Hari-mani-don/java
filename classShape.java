import java.lang.reflect.*;



public class Shape {
    public static void main(String args[]){
    //     String s1 = "hari";
    //     String s2 = "mani";
    //     String s3 = new String("java");
    //     String s4 = new String("hari");
    //     //System.out.println(s4.equals(s3));
    //    Box box = new Box(20, "hari");
    //    //Box bo = new Box(20, "harii");
    //    Class cls = box.getClass();
    //    //System.out.println("Class Name: " + cls.getName());

    //    Method method[]= cls.getMethods();
    //    for (Method method2 : method) {
    //       System.out.println(method2.getName());
    //    }
    //    try {
    //    System.out.println(method[3].invoke(box, 20, 30, 40));
    // } catch (IllegalAccessException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // } catch (IllegalArgumentException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // } catch (InvocationTargetException e) {
    //     // TODO Auto-generated catch block
    //     e.printStackTrace();
    // }
    // System.out.println(cls.getConstructor(20));
    //  System.out.println();
       //System.out.println(box.isEquals(bo));

    //   Shap s[] = new Shap[2];
    //   s[0] = new Square(20);
    //   s[1] = new Triangle(20, 20, 20);
      
    //   for (Shap sh : s) {
    //      sh.area();
    //   }
    
    //   Square.area();
    //   Box.display();
    //   Box box = new Box(0);
    //   box.minValue(20, 30, 49);
//     Triangle triangle = new Triangle();
//     triangle.access();
//     Square square = new Square();
//     //square.harii();
//     square.mani();
//        Days day = Days.FRIDAY;
//        Days day2 = Days.MONDAY;
//        System.out.println(day.ordinal());
//        System.out.println(day.valueOf("SUNDAY"));
//        System.out.println(day.toString());
//        System.out.println(day.getAbbr());
       
//        int result = day.compareTo(day2);
//           if(result<0){
//             System.out.println("day less than day2");
//           }else if(result>0){
//             System.out.println("day greaterthan day2");
//           }else {
//             System.out.println("day same as days");
        // int i = 10;
        // Integer i1 = Integer.valueOf(i);
        // int j = i1.intValue();
        // Integer i2 = 20;
        // int k = i2;
        // String s = "123";
        // Integer l = Integer.parseInt(s);
        // System.out.println((i1 + i2)+ " "+ (j+k+ l));        
        //   Outer o = new Outer();
        //   o.num = 20;
        //   o.display();
        //   System.out.println(o.num);

        //   Outer.Inner in = new Outer.Inner();
        //   in.x =40;
        //   in.display();
        //   System.out.println(in.x);
       dog dg =  new dog();
       dg.bird();
       dg.cat();
       
    }
    }

interface Birsds{
    void bird();
}
interface Animal extends Birsds{
    void cat();
    
}
class dog implements Animal{
    @Override
    public void cat(){
        System.out.println("this is a dog");
    }
    @Override
    public void bird(){
        System.out.println("This is a bird");
    }
}

class cate implements Animal{
    @Override
    public void cat(){
        System.out.println("This is a cat");
    }
    @Override
   public void bird(){
    System.out.println("Harimani");
   }
 
}
   
//  }
// enum Days{
//     SUNDAY("S"), MONDAY("M"),TUESDAY("T"),WEDNESDAY("W"),
//     THURSDAY("THU"),FRIDAY("F"),SATURDAY("SAT");
//     String abbr;
//     Days(String abbr){
//         this.abbr = abbr;
//     }
//     public String getAbbr() {
//         return abbr;
//     }
// }
// abstract class Hari{
//    // abstract void area();
//     public  void display(){
//          System.out.println("Welcome to Mathametical World: ");
//     }
// }

// class Square{
//     protected  int side=30;
//     protected double hari;
//     private void harii(){
//         System.out.println(side);
//     }
//     public void mani(){
//         harii();
//         System.out.println(hari);
//     }
  
    //  public Square(double side, double hari){
    //     this.side = side;
    //  }
    // public double getSide(){
    //     return side;
    // }
    // public void setSide(double side){
    //     this.side = side;
    // } 
    // public static void area(){
    //     System.out.println("This is an Square Value : ");
    // }
//  }
// class Triangle extends Square{
//     public void access(){
        
//        // Square.harii();
//       side =40;
//       System.out.println(side);
//    }
// }
// class Outer{
//     int num;
//     void display(){
//         System.out.println("Outer");
//     }
//     static class Inner{
//         int x;
//         void display(){
//             System.out.println("Inner");
//         }
//     }
// }
