public VisitLinkedList() {
    visits = new LinkedList<>();
}

public void addVisit(Visit visit) {
    visits.add(visit);
    System.out.println("Visit record added successfully.");
}

public Visit searchVisit(String visitId) {
    for (Visit visit : visits) {
        if (visit.getVisitId().equalsIgnoreCase(visitId)) {
            return visit;
        }
    }

    return null;
}

public void displayVisits() {
    if (visits.isEmpty()) {
        System.out.println("No visit records found.");
        return;
    }

    System.out.println("\n===== Hospital Visit Records =====");

    for (Visit visit : visits) {
        System.out.println(visit);
    }
}