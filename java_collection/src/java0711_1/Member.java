package java0711_1;

public class Member {
	private String name;
	private int age;
	private String birth;
	
	public Member(String name, int age, String birth) {
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return name+", "+age+", "+birth;
	}
	
	//indexOf�� contains���� �޼��带 ����Ϸ��� �ֻ��� Ŭ������ object Ŭ������
	//equal �޼��带 �������̵����ָ� �ȴ�.
	@Override
	public boolean equals(Object obj) {
		//Ŭ���� Ÿ�Ե� ����ȯ�� �����ϴ�. �ٸ� �θ�Ŭ������ �ڽ�Ŭ���� ���迩���ϰ�
		//�θ�Ŭ������ �ڽ�Ŭ������ �ٲٴ°͸� ���� �ݴ�� �ȵȴ�.
		Member tmp = (Member)obj;
		return;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
}
