import java.util.Scanner;
class SimpleInterestCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("Simple Interest Calculator");
		System.out.println("===================================");
		System.out.print("Prinicpal Amount:");
        double P = sc.nextDouble();
		System.out.print("Rate of Interse(p.a):");
        double R = sc.nextDouble();
		System.out.print("Time Period:");
        double T = sc.nextDouble();
		double SI = (P*T*R)/(100);
		System.out.println("===================================");
		System.out.println("Prinicpal Amount:"+P);
        System.out.println("Total Interest:"+SI);
		System.out.println("Total Amount:"+(P+SI));

		


	}
}
