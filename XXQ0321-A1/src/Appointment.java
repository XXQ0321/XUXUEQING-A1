public class Appointment {

    private String patientName;
    private String patientPhone;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment(){}

    public Appointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor){
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patientName='" + patientName + '\'' +
                ", patientPhone='" + patientPhone + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", doctor=" + doctor +
                '}';
    }
}
