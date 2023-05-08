package Demo;

class Student{
	int id;
	String name;
//    Student(int i,String n){
//		id = i;
//		name = n;
//	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class constructorDemo {
	public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();
	
	s1.display();
	s2.display();
	}
}

//class std {
//	int id;
//	String name;
//	
//	std(int i,String n){
//		id = i;
//		name = n;
//		
//	}
//	void display() {
//		System.out.println(id+" "+name);
//	}
//}