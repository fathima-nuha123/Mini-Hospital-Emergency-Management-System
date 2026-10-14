import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<Patient> queue;

    public EmergencyQueue() {
        queue = new LinkedList<>();
    }

    public void addPatient(Patient patient) {
        queue.offer(patient);
        System.out.println("Patient added to emergency queue.");
    }

    public Patient treatNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("No patients waiting for emergency treatment.");
            return null;
        }

        Patient patient = queue.poll();

        System.out.println("Treating patient: " + patient.getName());
        return patient;
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Emergency queue is empty.");
            return;
        }

        System.out.println("Patients waiting for emergency treatment:");

        for (Patient patient : queue) {
            System.out.println(patient);
        }
    }
}