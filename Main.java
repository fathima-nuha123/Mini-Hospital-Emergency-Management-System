PatientBST patientBST = new PatientBST();
    EmergencyQueue emergencyQueue = new EmergencyQueue();
    TreatmentStack treatmentStack = new TreatmentStack();
    VisitLinkedList visitList = new VisitLinkedList();

    int choice;

    do {
        System.out.println("\n===== HOSPITAL EMERGENCY SYSTEM =====");
        System.out.println("1. Register Patient");
        System.out.println("2. Search Patient");
        System.out.println("3. Display All Patients");
        System.out.println("4. Add Patient to Emergency Queue");
        System.out.println("5. Treat Next Patient");
        System.out.println("6. Add Treatment Record");
        System.out.println("7. Display Treatment Records");
        System.out.println("8. Add Hospital Visit");
        System.out.println("9. Display Hospital Visits");
        System.out.println("10. Exit");
        System.out.print("Enter your choice: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine();
            continue;
        }

        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Patient ID: ");
                String id = scanner.nextLine();

                if (patientBST.search(id) != null) {
                    System.out.println("Patient ID already exists.");
                    break;
                }

                System.out.print("Enter Patient Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Age: ");
                int age;

                try {
                    age = Integer.parseInt(scanner.nextLine());

                    if (age < 0) {
                        System.out.println("Age cannot be negative.");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age.");
                    break;
                }

                System.out.print("Enter Condition: ");
                String condition = scanner.nextLine();

                System.out.print("Enter Priority (1 = Highest): ");
                int priority;

                try {
                    priority = Integer.parseInt(scanner.nextLine());

                    if (priority < 1) {
                        System.out.println("Priority must be 1 or higher.");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid priority.");
                    break;
                }

                Patient patient = new Patient(
                    id, name, age, condition, priority
                );

                patientBST.insert(patient);
                System.out.println("Patient registered successfully.");
                break;

            case 2:
                System.out.print("Enter Patient ID to search: ");
                String searchId = scanner.nextLine();

                Patient found = patientBST.search(searchId);

                if (found != null) {
                    System.out.println(found);
                } else {
                    System.out.println("Patient not found.");
                }
                break;

            case 3:
                patientBST.displayPatients();
                break;

            case 4:
                System.out.print("Enter Patient ID: ");
                String queueId = scanner.nextLine();

                Patient queuePatient = patientBST.search(queueId);

                if (queuePatient != null) {
                    emergencyQueue.addPatient(queuePatient);
                } else {
                    System.out.println("Register the patient first.");
                }
                break;

            case 5:
                Patient treated = emergencyQueue.treatNextPatient();

                if (treated != null) {
                    treatmentStack.addTreatment(
                        "Treated Patient: " + treated.getPatientId()
                        + " - " + treated.getName()
                    );
                }
                break;

            case 6:
                System.out.print("Enter treatment details: ");
                String treatment = scanner.nextLine();
                treatmentStack.addTreatment(treatment);
                break;

            case 7:
                treatmentStack.displayTreatments();
                break;

            case 8:
                System.out.print("Enter Visit ID: ");
                String visitId = scanner.nextLine();

                if (visitList.searchVisit(visitId) != null) {
                    System.out.println("Visit ID already exists.");
                    break;
                }

                System.out.print("Enter Patient ID: ");
                String visitPatientId = scanner.nextLine();

                if (patientBST.search(visitPatientId) == null) {
                    System.out.println("Register the patient first.");
                    break;
                }

                System.out.print("Enter Visit Date: ");
                String date = scanner.nextLine();

                System.out.print("Enter Diagnosis: ");
                String diagnosis = scanner.nextLine();

                Visit visit = new Visit(
                    visitId, visitPatientId, date, diagnosis
                );

                visitList.addVisit(visit);
                break;

            case 9:
                visitList.displayVisits();
                break;

            case 10:
                System.out.println("Exiting Hospital Emergency System.");
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }

    } while (choice != 10);

    scanner.close();
}