import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Employee {
	
	int empNo;
	String empName;
	int salary;
	String city;
	
	public Employee(int empNo, String empName, int salary, String city) {
		this.empName = empName;
		this.city = city;
		this.empNo = empNo;
		this.salary = salary;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String getCity() {
		return city;
	}
	
	public String toString() {
		return empName+", "+empNo+", "+salary+", "+city;
	}
	
}

class crudEmployee {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		List<Employee> data = new ArrayList<Employee>();
		
		int choice;
		
		do {
			
			System.out.println("1. Insert | 2. Display | 3. Search | 4. Delete | 5. Update");
			System.out.print("Enter your choice: ");
			choice = sc1.nextInt();
			
			switch(choice) {
				
				case 1:
					
					System.out.print("Enter employee number: ");
					int eno = sc1.nextInt();
					
					System.out.print("Enter employee name: ");
					String name = sc2.nextLine();
					
					System.out.print("Enter employee salary: ");
					int salary = sc1.nextInt();
					
					System.out.print("Enter employee city: ");
					String city = sc2.nextLine();
					
					data.add(new Employee(eno, name, salary, city));
					break;
					
				case 2:
					
					System.out.println("---------------------------\n");
					Iterator<Employee> i = data.iterator();
					
					while(i.hasNext()) {
						Employee e = i.next();
						System.out.println(e);
					}
					
					System.out.println("---------------------------\n");
					break;
					
				case 3:
					
					boolean found = false;
					
					System.out.println("---------------------------\n");
					System.out.println("Enter the employee number to search: ");
					eno = sc1.nextInt();
					
					i = data.iterator();
					while(i.hasNext()) {
						
						Employee e = i.next();
						
						if(eno==e.getEmpNo()) {
							
							System.out.println(e);
							found = true;
							
						}
					}
					
					if(!found) {
						System.out.println("Employee not found !");
					}
					
					System.out.println("---------------------------\n");
					break;
				
				case 4:
					
					found = false;
					
					System.out.println("---------------------------\n");
					System.out.println("Enter the employee number to delete: ");
					eno = sc1.nextInt();
					
					i = data.iterator();
					while(i.hasNext()) {
						
						Employee e = i.next();
						
						if(eno==e.getEmpNo()) {
							
							i.remove();
							found = true;
							
						}
					}
					
					if(!found) {
						System.out.println("Employee not found !");
					} else {
						System.out.println("Employee deleted successfully !");
					}
					
					System.out.println("---------------------------\n");
					break;
					
				case 5:
					
					found = false;
					
					System.out.println("---------------------------\n");
					System.out.println("Enter the employee number to update: ");
					eno = sc1.nextInt();
					
					ListIterator<Employee> li = data.listIterator();
					while(li.hasNext()) {
						
						Employee e = li.next();
						
						if(eno==e.getEmpNo()) {
							
							System.out.println("Enter new name: ");
							name = sc2.nextLine();
							
							System.out.println("Enter new salary: ");
							salary = sc1.nextInt();
							
							System.out.println("Enter new city: ");
							city = sc2.nextLine();
							
							li.set(new Employee(eno, name, salary, city));
							
							found = true;
							
						}
					}
					
					if(!found) {
						System.out.println("Employee not found !");
					} else {
						System.out.println("Employee deleted successfully !");
					}
					
					System.out.println("---------------------------\n");
					break;
					
			}
			
		} while(choice!=0);
		
		
	}
	
}
