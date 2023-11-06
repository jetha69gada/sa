import java.rmi.Naming;
import java.util.*;
public class Client {

    public static void main(String[] args) throws Exception {
        Adder1 stub = (Adder1) Naming.lookup("rmi://localhost:5001/sunoo");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	
        int sum = stub.add(a, b);

        System.out.println("The sum is: " + sum);
    }
}
