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
	
	//indexOf나 contains같은 메서드를 사용하려면 최상위 클래스인 object 클래스에
	//equal 메서드를 오버라이딩해주면 된다.
	@Override
	public boolean equals(Object obj) {
		//클래스 타입도 형변환이 가능하다. 다만 부모클래스와 자식클래스 관계여야하고
		//부모클래스를 자식클래스로 바꾸는것만 가능 반대는 안된다.
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
