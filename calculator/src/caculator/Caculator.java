package caculator;

abstract class Caculator {

	public final void caculate(double num1, double num2) {
		double result = cal(num1, num2);
		printResult(result);
	}


protected abstract double cal(double num1, double num2);
private void printResult(double result) {
	System.out.println("°á°ú : "+result);
}

}