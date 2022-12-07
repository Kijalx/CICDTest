public class Employee {
    private String name;
    private String ppsID;
    private String phoneNumber;
    private String gender;
    private String employmentType;
    private int age;
    public Employee(String empName,String empPPSID,String empPhoneNumber,String empGender,String empType,int empAge){
        setEmpName(empName);
        setEmpPpsID(empPPSID);
        setEmpPhoneNumber(empPhoneNumber);
        setEmpGender(empGender);
        setEmpType(empType);
        setEmpAge(empAge);
    }
    public String getEmpName() {
        return name;
    }

    public void setEmpName(String empName) {
        if(empName.length() >= 5 && empName.length() <= 22){
            name = empName;
        }
        else{
            throw new IllegalArgumentException("Name must have between 5 and 22 letters");
        }
    }

    public String getEmpPPSID() {
        return ppsID;
    }

    public void setEmpPpsID(String empPPSID) {
        if(empPPSID.length() >= 6){
            ppsID = empPPSID;
        }
        else{
            throw new IllegalArgumentException("PPSID Must have 6 or more digits");
        }
    }

    public String getEmpPhoneNum() {
        return phoneNumber;
    }

    public void setEmpPhoneNumber(String empPhoneNumber) {
        if(empPhoneNumber.length() == 11){
            phoneNumber = empPhoneNumber;
        }
        else{
            throw new IllegalArgumentException("Phone Number must have 11 digits");
        }
    }

    public String getEmpGender() {
        return gender;
    }

    public void setEmpGender(String empGender) {
        if(empGender.equalsIgnoreCase("man") || empGender.equalsIgnoreCase("women") || empGender.equalsIgnoreCase("non-binary")){
            gender = empGender;
        }
        else{
            throw new IllegalArgumentException("Gender must be either Man, Women or Non-Binary");
        }
    }

    public String getEmpType() {
        return employmentType;
    }

    public void setEmpType(String empType) {
        if(empType.equalsIgnoreCase("full-time") || empType.equalsIgnoreCase("part-time")){
            employmentType = empType;
        }
        else{
            throw new IllegalArgumentException("Employment type must be either Full-time or Part-time");
        }
    }

    public int getEmpAge() {
        return age;
    }

    public void setEmpAge(int empAge) {
        if(empAge >= 18){
            age = empAge;
        }
        else{
            throw new IllegalArgumentException("Employee must be over the age of 18");
        }
    }
}
