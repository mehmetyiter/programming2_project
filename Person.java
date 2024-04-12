import java.time.LocalDate;
import java.time.Period;

public class Person {
    private static String firstName; //to store the first name
    private static String lastName; //to store the second name
    private String address; //to store the address
    protected LocalDate birthdate; //to store the date of birth //Mehmet Yiter I changed the access modifier to protected for using in the Doctor class
    private String phone; //to store the phone number
    private int age; //to store age
    
    //create a constructor with parameters
    public Person(String firstName,String lastName, String address, LocalDate birthdate, String phone) {
        Person.firstName = firstName;
        Person.lastName = lastName;
        this.address = address;
        this.birthdate = birthdate;
        this.phone = phone;
        this.calculateAge();
    }
    
    //method to calculate age
    private void calculateAge() {
        LocalDate today = LocalDate.now();
        this.age = Period.between(this.birthdate, today).getYears();
    }
    
    //method to set name
    public void setName(String firstName,String secondName) {
    	 Person.firstName = firstName;
         Person.lastName = secondName;
    }

    //method to return name
    public String getName(String firstName,String secondName) {
    	String name = firstName + "\s" +secondName;
        return name;
    }
    
    //method to set address
    public void setAddress(String address) {
        this.address = address;
    }
    
    //method to return address
    public String getAddress() {
        return address;
    }
    
    //method to set date of birth
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
        this.calculateAge();
    }
     
    //method to return date of birth
    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    //method to set phone
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    //method to return phone number
    public String getPhone() {
        return phone;
    }
    
    //method to return age
    public int getAge() {
        return age;
    }
    
    //method return informations as String
    public String getInfo() {
		return "Name:" + getName(firstName, lastName)+ "\n" +
				"Address: " + getAddress() + "\n" +
				"Birthdate: " + getBirthdate() + "\n" +
				"Phone: " + getPhone() + "\n" +
				"Age: " + getAge();
    	
    }

    // Patient class
    class PatientPerson extends Person {
        private String insuranceCompany;
        private String employer;
    
        public PatientPerson(String name, String dateOfBirth, String insuranceCompany, String employer) {
            super(firstName, lastName, address, birthdate, phone);
            this.insuranceCompany = insuranceCompany;
            this.employer = employer;
        }
    
        // Getters and setters for insuranceCompany and employer
        public String getInsuranceCompany() {
            return insuranceCompany;
        }
    
        public void setInsuranceCompany(String insuranceCompany) {
            this.insuranceCompany = insuranceCompany;
        }
    
        public String getEmployer() {
            return employer;
        }
    
        public void setEmployer(String employer) {
            this.employer = employer;
        }
    }

    // this main method is to try to excute the program, it can be deleted.
    public static void main(String[] args) {
    	
        LocalDate birthdate = LocalDate.of(1990, 5, 15);
        Person person1 = new Person("John", "Doe", "123 Main St, Anytown, USA", birthdate, "555-123-4567");
        System.out.println(person1.getInfo());
        
    }
}