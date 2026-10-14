public class PatientBST {

    private class Node {
        Patient patient;
        Node left, right;

        Node(Patient patient) {
            this.patient = patient;
            left = right = null;
        }
    }

    private Node root;

    public PatientBST() {
        root = null;
    }

    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    private Node insertRec(Node root, Patient patient) {
        if (root == null) {
            return new Node(patient);
        }

        if (patient.getPatientId().compareToIgnoreCase(
                root.patient.getPatientId()) < 0) {
            root.left = insertRec(root.left, patient);
        } else if (patient.getPatientId().compareToIgnoreCase(
                root.patient.getPatientId()) > 0) {
            root.right = insertRec(root.right, patient);
        } else {
            System.out.println("Patient ID already exists.");
        }

        return root;
    }

    public void displayPatients() {
        displayRec(root);
    }

    private void displayRec(Node root) {
        if (root != null) {
            displayRec(root.left);
            System.out.println(root.patient);
            displayRec(root.right);
        }
    }
}