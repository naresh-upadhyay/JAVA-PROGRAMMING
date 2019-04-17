import java.lang.*;
class Test{
    public static void main(String args[]){
        Character d=3;
        //System.out.println("Integer Method :-" +a);
        //Double d = new Double("6.9685"); 
      
        // Converting this Double(Number) object to  
        // different primitive data types 
        byte b = d.byteValue();  
        short s = d.shortValue();  
        int i = d.intValue();  
        long l = d.longValue();  
        float f = d.floatValue();  
        double d1 = d.doubleValue();  
              
        System.out.println("value of d after converting it to byte : " + b); 
        System.out.println("value of d after converting it to short : " + s); 
        System.out.println("value of d after converting it to int : " + i); 
        System.out.println("value of d after converting it to long : " + l); 
        System.out.println("value of d after converting it to float : " + f); 
        System.out.println("value of d after converting it to double : " + d1); 
  
    }
}