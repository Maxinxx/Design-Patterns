package Chapter01;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ������");
		double numberA = sc.nextDouble();
		System.out.println("�������������+��-��*��/��");
		String operate = sc.next();
		System.out.println("������ڶ�������");
		double numberB = sc.nextDouble();
		
		Operation op = OperationFactory.createOperate(operate);
		op.setNumberA(numberA);
		op.setNumberB(numberB);
		
		System.out.println("����ǣ�" + op.getResult());
	}
}
