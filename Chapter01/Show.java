package Chapter01;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数：");
		double numberA = sc.nextDouble();
		System.out.println("请输入运算符（+、-、*、/）");
		String operate = sc.next();
		System.out.println("请输入第二个数：");
		double numberB = sc.nextDouble();
		
		Operation op = OperationFactory.createOperate(operate);
		op.setNumberA(numberA);
		op.setNumberB(numberB);
		
		System.out.println("结果是：" + op.getResult());
	}
}
