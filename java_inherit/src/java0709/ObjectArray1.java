package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		//��ȭ ���� 5�� �Է�
		
		Movie[] mv = new Movie[5];
		mv[0] = new Movie("���˵���", "������", 18);
		mv[1] = new Movie("�λ��̵�ƿ�2", "�̽�", 12);
		mv[2] = new Movie("Ż��", "������", 12);
		mv[3] = new Movie("������ŷ", "�輺��", 12);
		mv[4] = new Movie("Ȥ��Ż��", "����", 12);
		
		for(int i=0; i<mv.length; i++) {
			System.out.println(mv[i]);
		}
		
		for(Movie movie : mv) {
			System.out.println(movie);
		}
		
	}

}

/*
	�迭�� ����
	������Ÿ��[] �������� = new ������Ÿ��[�迭ũ��];
 	
 	int[] arr = new int[10];
 	intŸ���� ���� 10�� ����(intŸ������ ����� ���� 10�� �ִ� �Ͱ� ���ٰ� �����ȴ�.)
 	
 	Movie[] mv = new Movie[10];
 	MovieŬ������ �������� 10�� ������ ��.
 	��ü 10���� ����� �ƴ� ��ü�� ���� �� �ִ� �������� 10���� �������.
 	mv[0] = new Movie();
 	mv[1] = new Movie();
 	...
 	�̷��� �ϳ��� new �����ڸ� �̿��� ��ü�� ���� �־���� �Ѵ�.
 

*/