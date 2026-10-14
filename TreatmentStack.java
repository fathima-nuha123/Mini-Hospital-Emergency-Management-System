public TreatmentStack() {
    treatments = new Stack<>();
}

public void addTreatment(String treatment) {
    treatments.push(treatment);
    System.out.println("Treatment record added.");
}

public void viewLatestTreatment() {
    if (treatments.isEmpty()) {
        System.out.println("No treatment records found.");
    } else {
        System.out.println("Latest Treatment: " + treatments.peek());
    }
}

public void removeLatestTreatment() {
    if (treatments.isEmpty()) {
        System.out.println("No treatment records to remove.");
    } else {
        System.out.println("Removed Treatment: " + treatments.pop());
    }
}

public void displayTreatments() {
    if (treatments.isEmpty()) {
        System.out.println("No treatment records found.");
        return;
    }

    System.out.println("\n===== Treatment Records =====");

    for (int i = treatments.size() - 1; i >= 0; i--) {
        System.out.println(treatments.get(i));
    }
}