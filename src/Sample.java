
public class Sample extends Example {

	void m1(){

		System.out.println("Sample m1");
	}
	
	public static void main(String[] args){
		
		Sample s=new Sample();
		//compile-time polymorphism
		s.m1();
		s.m2();
		
		Example e=new Sample();
		e.m1(); //Run-time ploymorphism
		e.m2(); //compile-time polymorphism
	}
}

