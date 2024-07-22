package caculator;

import java.util.Scanner;

public class Input {
	Scanner scan = new Scanner(System.in);
	private double num1, num2; 
	
	public Input() {
		System.out.print("계산할 첫번째 숫자 : ");
		num1 = scan.nextDouble();
		System.out.print("두번째 숫자 : ");
		num2 = scan.nextDouble();
		System.out.print("계산 방법을 선택해주세요(1.더하기, 2.빼기, 3.곱하기, 4.나누기) : ");
		int select = scan.nextInt();
		selectFunction(select, num1, num2);
	}
	
	private void selectFunction(int select, double num1, double num2) {
		switch(select) {
			case 1: 
				Caculator plus = new PlusCal();
				plus.caculate(num1, num2);
				break;
			case 2:
				
				break;
			case 3: 
				break;
			case 4: 
				break;
		}
	}
}
