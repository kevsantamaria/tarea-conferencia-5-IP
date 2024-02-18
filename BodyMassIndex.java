import java.util.Scanner;

public class BodyMassIndex{
  public static void main(String args[]){
    
   Scanner in = new Scanner(System.in);
   double weight, height, bodyMassIndex;

   System.out.println("Ingrese su peso:");
   weight = in.nextDouble();

   System.out.println("Ingrese su estatura:");
   height = in.nextDouble();

   bodyMassIndex = bodyMassIndex(weight, height);
   System.out.println("Su indice de masa corporal es de: " + bodyMassIndex);  

   in.close();
 }
public static double bodyMassIndex(double weight, double height){
    double bodyMassIndex = weight/(height*height);
    return bodyMassIndex;
  }

} 	 			