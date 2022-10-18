
public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	
	public Employee (String name,double salary,int workHours,int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		double vergi=0;
		
		if(salary>1000) {
			vergi = (salary /100) *3;
		}
		
		
		return vergi;
	}
	public double bonus() {
		double bonus1 = 0;
		if(workHours>40) {
			bonus1 = (workHours - 40) * 30; 
		}
	
		return bonus1;
	}
	
	public double raiseSalary() {
		double maas_artisi = 0;
		if((2021-hireYear)<10) {
			maas_artisi = (salary/100)*5;
			
		}
		if((2021-hireYear)>9) {
			maas_artisi = (salary/100)*10;
			
		}
		if((2021-hireYear)>19) {
			maas_artisi = (salary/100)*15;
			
		}
		
		return maas_artisi ; 
	}
	
	public String toString() {
		double vergiden_sonra = salary + (bonus()-tax());
		double toplam = vergiden_sonra + raiseSalary();
		return "Adi :" + name + "\n" + "Maaþý: " + salary + "\n" + "Çalýþma Saati : " + workHours+ "\n" + "Baþlangýç Yýlý : " + hireYear + "\n" + "Vergi : " + tax() + "\n" + "Bonus : " + bonus() + "\n" + "Maas Artisi : " + raiseSalary() + "\n"+"Vergi ve Bonuslar ile birlikte maas : " + vergiden_sonra +  "\n" + "Toplam Maas : " + toplam;
	}
	
	public static void main(String[]args) {
		Employee e =new Employee("kemal",2000,45,1985);
		
		System.out.println(e.toString());
		
		
	}

	


}
