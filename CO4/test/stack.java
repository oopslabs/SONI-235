package generic;
class printer<T>{
	T data;
	printer(T i){
		data=i;
	}
	void display()
	{
		System.out.println(data);
	}
}
public class stack {

	public static void main(String[] args) {
		printer<Integer> p=new printer<Integer>(5);
		p.display();
		printer<String> p1=new printer<String>("hello");
		p1.display();
		printer<Double> p2=new printer<Double>(3.14);
		p2.display();

	}

}
