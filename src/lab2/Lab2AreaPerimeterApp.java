package lab2;
import java.util.Scanner;

public class Lab2AreaPerimeterApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		

double Length;
double Width;
double Area;
double Perimeter;
double Height;
double Volume;


System.out.print("Enter Length: ");
Length = scnr.nextDouble();

System.out.print("Enter Width: ");
Width = scnr.nextDouble();

Area = Length * Width;
Perimeter = Length * 2 + Width * 2;



System.out.println("Area equals: " + Area); 
System.out.println("Perimeter equals: " + Perimeter);


System.out.println("Enter Height: ");
Height = scnr.nextDouble();

System.out.println("Calculate Volume: ");
Volume = scnr.nextDouble();

Volume = Length * Width * Height;

System.out.println("Volume equals: " + Volume);




	}

}
