package Chapter01;

public class OperationFactory {
	public static Operation createOperate(String operate) {
		Operation oper = null;
		switch(operate) {
		case "+":
			oper = new OperateAdd();
			break;
		case "-":
			oper = new OperateSub();
			break;
		case "*":
			oper = new OperateMul();
			break;
		case "/":
			oper = new OperateDiv();
			break;
		}
		return oper;
	}
}
