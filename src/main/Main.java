package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wartoscBelford;
		for (int i = 1 ;i<10;i++)
		{
			wartoscBelford=Math.log10(i+1)-Math.log10(i);
			wartoscBelford*=100;
			System.out.println(i + " " + wartoscBelford ); 
		}
	}

}
