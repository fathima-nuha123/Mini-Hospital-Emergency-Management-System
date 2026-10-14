public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String condition;
    private int priority;

    public Patient(String patientId, String name, int age, String condition, int priority) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.condition = condition;
        this.priority = priority;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCondition() {
        return condition;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId
                + ", Name: " + name
                + ", Age: " + age
                + ", Condition: " + condition
                + ", Priority: " + priority;
    }
}