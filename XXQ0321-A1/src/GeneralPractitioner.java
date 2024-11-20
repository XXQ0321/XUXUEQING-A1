public class GeneralPractitioner extends HealthProfessional {
    private String medicalLicenseNumber; // Physician's license number

    public GeneralPractitioner() {
    }

    public GeneralPractitioner(int id, String name, int age, String medicalLicenseNumber) {
        super(id, name, age);
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public String getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public void setMedicalLicenseNumber(String medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    @Override
    public String toString() {
        return "The general practitioner details are：" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", medicalLicenseNumber='" + medicalLicenseNumber + "\'" +
                '}';
    }
}
