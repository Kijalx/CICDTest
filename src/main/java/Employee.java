public class Employee {
    private String name;
    private String ppsID;
    private String phoneNumber;
    private String gender;
    private String employmentType;
    private int age;
    public Employee(String empName,String empPPSID,String empPhoneNumber,String empGender,String empType,int empAge){

    }
    public String getEmpName() {
        return name;
    }

    public void setEmpName(String empName) {
        if(empName.length() >= 5 && empName.length() <= 22){
            name = empName;
        }
        else{
            new IllegalArgumentException("Name must have between 5 and 22 letters");
        }
    }
}
