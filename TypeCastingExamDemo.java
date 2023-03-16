import java.io.*;
public class TypeCastingExamDemo {
	public static void main(String args[]) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		int a;
		String b;
		System.out.println("Enter a number: ");
		b = dis.readLine();
		a = Integer.parseInt(b);
		System.out.println("String Value: "+b);
		System.out.println("Integer Value: "+a);
	}
}