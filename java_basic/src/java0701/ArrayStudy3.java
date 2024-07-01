package java0701;

public class ArrayStudy3 {

	public static void main(String[] args) {
		int[] number = new int[20];
		int count = 0;
		for(int i=0; i<number.length; i++) {
			 number[i] = (int)(Math.random()*30)+1;
			 if(number[i] % 5 == 0) {
				 count++;
			 }
			 System.out.print(number[i] + " ");
		}
		
		System.out.println();
		System.out.print("5의 배수 갯수 : " + count);
		

	}

}
