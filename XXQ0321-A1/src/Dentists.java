public class Dentists extends HealthProfessional{
    private String dentalLicenseNumber; // 牙医执业执照号码

    public Dentists(){}

    public Dentists(int id, String name, int age, String dentalLicenseNumber) {
        super(id, name, age);
        this.dentalLicenseNumber = dentalLicenseNumber;
    }

    public String getDentalLicenseNumber() {
        return dentalLicenseNumber;
    }

    public void setDentalLicenseNumber(String dentalLicenseNumber) {
        this.dentalLicenseNumber = dentalLicenseNumber;
    }

    @Override
    public String toString() {
        return "The dentist details are: {" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", dentalLicenseNumber='" + dentalLicenseNumber + '\'' +
                '}';
    }
}
