package caculator;

public class DivCal extends Caculator{ //나누기
	@Override
	protected double cal(double num1, double num2) {
		if(num1==0) {
			System.out.println("잘못된숫자입력");
			return 0;
		}
		
		return num1/num2;
	}
	
}
