public Visit(String visitId, String patientId, String date, String diagnosis) {
    this.visitId = visitId;
    this.patientId = patientId;
    this.date = date;
    this.diagnosis = diagnosis;
}

public String getVisitId() {
    return visitId;
}

public String getPatientId() {
    return patientId;
}

public String getDate() {
    return date;
}

public String getDiagnosis() {
    return diagnosis;
}

@Override
public String toString() {
    return "Visit ID: " + visitId
            + ", Patient ID: " + patientId
            + ", Date: " + date
            + ", Diagnosis: " + diagnosis;
}