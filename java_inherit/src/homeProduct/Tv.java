package homeProduct;

public class Tv extends House {
	int channel = 10; //ä��
	int vol = 5; //�Ҹ�
	
	Tv(){
		
	}
	//�Ű����� �ִ� ������ �޼���
	Tv(String brand, int price){
		super(brand, price); // �θ�Ŭ���� �����ڸ޼��� ȣ��
		super.power();
	}
	
	void channelUp() {
		this.channel++;
	}
	
	void channelDw() {
		this.channel--;
	}
}
