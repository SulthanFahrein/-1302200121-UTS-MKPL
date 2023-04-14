package lib;


import java.time.LocalDate;

public class Employee {
	
	protected Employee() {
		
	}

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private LocalDate dateJoined;	
	private boolean isForeigner;
	private Gender gender;
	public enum Gender {
        MALE,
        FEMALE
    }
	


	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, LocalDate dateJoined, boolean isForeigner, Gender gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.dateJoined = dateJoined;
		this.isForeigner = isForeigner;
		this.gender = gender;
		
	}

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public boolean isForeigner() {
        return isForeigner;
    }


    public Gender getGender() {
        return gender;
    }
	
}