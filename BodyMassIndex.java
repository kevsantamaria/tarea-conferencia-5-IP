import java.util.Scanner;

public class BodyMassIndex{
  public static void main(String args[]){
    
   Scanner in = new Scanner(System.in);
   double weight, height, bodyMassIndex;

   System.out.println("Ingrese su peso en kilogramos:");
   weight = in.nextDouble();

   System.out.println("Ingrese su estatura en metros:");
   height = in.nextDouble();

   bodyMassIndex = calculateBodyMassIndex(weight, height);
   System.out.println("Su indice de masa corporal es de: " + bodyMassIndex);  

   in.close();
 }
public static double calculateBodyMassIndex(double weight, double height){
    double bodyMassIndex = weight/Math.pow(height,2);
    return bodyMassIndex;
  }

} 	 			