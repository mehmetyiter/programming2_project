//Mehmet Yiter
import java.io.FileWriter;
import java.io.IOException;


public class Doctor extends Person {
    private String dateOfEmployment;
    private String specialty;

    public Doctor(String firstName, String lastName, String birthdate, String dateOfEmployment, String specialty) {
        super(firstName, lastName, birthdate);
        this.dateOfEmployment = dateOfEmployment;
        this.specialty = specialty;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getSpecialty() {
        return specialty;
    }

    // Store the name, date of birth, date of employment, and specialty of a doctor to the database as Doctor.txt
    public void storeDoctor() {
        // Code to store the doctor to the database
        try {
            FileWriter writer = new FileWriter("Doctor.txt", true);
            //getName fromPerson.class to writer.write()

            writer.write(getName() + "," + getbirthday() + "," + dateOfEmployment + "," + specialty + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error storing doctor to the database: " + e.getMessage());
        }
    }
});
        this.dateOfEmployment = dateOfEmployment;
        this.specialty = specialty;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getSpecialty() {
        return specialty;
    }

    // Store the name, date of birth, date of employment, and specialty of a doctor to the database as Doctor.txt
    public void storeDoctor() {
        // Code to store the doctor to the database
        try {
            FileWriter writer = new FileWriter("Doctor.txt", true);
            writer.write(getName() + "," + getDob() + "," + dateOfEmployment + "," + specialty + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error storing doctor to the database: " + e.getMessage());
        }
    }
}