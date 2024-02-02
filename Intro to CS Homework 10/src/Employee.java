//******************************************************************
// Employee.java Author: Lewis/Loftus
//
// Represents a general paid employee.
//******************************************************************
public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;
    protected int vacationDays = 10;

    //---------------------------------------------------------------
    // Sets up an employee with the specified information.
    //---------------------------------------------------------------
    public Employee (String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate) {
        super (eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setPayRate(double rate) {
        this.payRate = rate;
    }

    //---------------------------------------------------------------
    // Returns information about an employee as a string.
    //---------------------------------------------------------------
    public String toString() {
        String result = super.toString ();
        result += "\nSocial Security Number: " + socialSecurityNumber + "" +
                "\nVacation Days: " + vacation();
        return result;
    }
    //---------------------------------------------------------------
    // Returns the pay rate for this employee.
    //---------------------------------------------------------------
    public double pay() {
        return payRate;
    }

    public int vacation() {
        return vacationDays;
    }
}
