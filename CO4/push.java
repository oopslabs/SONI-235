package generic;
import java.util.ArrayList;
class Stack<T>{
	ArrayList<T> stack;
	int top,n;
	Stack(int i){
		this.n=i;
		this.stack=new ArrayList<T>(i);
	}
	void push1(T data){
		if((top+1)==n){
			System.out.println("Stack overflow");
		}
		else{
			top++;
			if(stack.size()>top){
				stack.set(top,data);
			}
			else{
				stack.add(data);
			}
		}
	}
	void display(){
	for(int i=0;i<top+1;i++){
		System.out.println(stack.get(i));
	}
}
}
public class push {

	public static void main(String[] args) {
		Stack<Integer> obj1=new Stack<Integer>(5);
		System.out.println("pushing elements are 10,20,30,40,50");
		obj1.push1(10);
		obj1.push1(20);
		obj1.push1(30);
		obj1.push1(40);
		obj1.push1(50);
		System.out.println("display the pushed elements:");
		obj1.display();
		
		}

}
