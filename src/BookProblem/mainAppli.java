package BookProblem;
import EmployeeProblem.*;
public class mainAppli {

	public static void main(String[] args) {
		
		Employee obj =new Employee(12,"purna","atike",1000);
		System.out.println(obj);
		Author a1 =new Author("purna","purna@gmail.com",'m');
		Book ob1=new Book("Alchemist",298.5,2,a1);
		System.out.println(ob1);
	}

}
