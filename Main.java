import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Prefix prefix =new Prefix();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		String formula = sc.nextLine();
		ArrayList<String> formulaArray = new ArrayList<String>();
		for(int i=0;i<formula.length();i++) {
			formulaArray.add(i, formula.substring(i, i+1));
		}
		prefix.prefix(formulaArray);
		System.out.println("���� ǥ���");
		for(int i=0;i<formulaArray.size();i++) {
			System.out.print(formulaArray.get(i));
		}
		sc.close();
	}

}
