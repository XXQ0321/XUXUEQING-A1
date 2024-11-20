import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {

    private static List<Appointment> appointmentList = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner g1 = new GeneralPractitioner(1, "mike", 33, "GP001");
        GeneralPractitioner g2 = new GeneralPractitioner(2, "tony", 24, "GP002");
        GeneralPractitioner g3 = new GeneralPractitioner(3, "tom", 56, "GP003");

        Dentists d1 = new Dentists(4, "rita", 27, "D001");
        Dentists d2 = new Dentists(5, "james", 29, "D002");

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        Appointment a = createAppointment("patientA", "123456", "08:00", g1);
        Appointment b = createAppointment("patientB", "567891", "10:00", g2);
        Appointment c = createAppointment("patientC", "677236", "10:00", d1);
        Appointment d = createAppointment("patientD", "938432", "14:30", d1);
        appointmentList.add(a);
        appointmentList.add(b);
        appointmentList.add(c);
        appointmentList.add(d);
        printExistingAppointments();
        cancelBooking("677236");
        printExistingAppointments();

        System.out.println("------------------------------");
    }

    public static Appointment createAppointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        Appointment a = new Appointment(patientName, patientPhone, timeSlot, doctor);
        return a;
    }

    public static void printExistingAppointments() {
        System.out.println("now appointmentList is: ");

        if (appointmentList.size() == 0) {
            System.out.println("no any appointment");
            return;
        }

        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println(appointmentList.get(i));
        }
    }

    public static void cancelBooking(String patientPhone) {
        System.out.println("cancel appointment of " + patientPhone);
        List<Appointment> newA = new ArrayList<>();
        boolean have = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (patientPhone.equals(appointmentList.get(i).getPatientPhone())) {
                have = true;
            } else {
                newA.add(appointmentList.get(i));
            }
        }
        appointmentList = newA;
        if (!have) {
            System.out.println("no appointment of " + patientPhone);
        }
    }
}
