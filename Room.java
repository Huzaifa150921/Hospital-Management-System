public class Room<T1, T2> {
    private int roomNumber;
    private int capacity;
    private String roomType;
    private Graph<T1, T2> patientsGraph;
    private ArrayList<T1> patients;
    private ArrayList<T2> doctors;

    public Room(int roomNumber, int capacity, String roomType) {
        this.roomNumber = roomNumber;
        setCapacity(capacity);
        this.roomType = roomType;
        patientsGraph = new Graph<>();
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void addPatient(T1 patient) {
        patientsGraph.addVertex(patient);
        if (patient instanceof Patients) {
            patients.add(patient);
        }
    }

    public void removePatient(T1 patient) {
        patientsGraph.removeVertex(patient);
        if (patient instanceof Patients) {
            patients.remove(patient);
        }
    }

    public void addDoctor(T2 doctor) {
        patientsGraph.addVertex1(doctor);
        if (doctor instanceof Doctors) {
            doctors.add(doctor);
        }
    }

    public void removeDoctor(T2 doctor) {
        patientsGraph.removeVertex1(doctor);
        if (doctor instanceof Doctors) {
            doctors.remove(doctor);
        }
    }

    public void assignPatient(T1 patient, T2 doctor) {
        patientsGraph.addEdge(patient,doctor);
    }

    public ArrayList<T1> getPatients() {
        return patients;
    }
    
    public ArrayList<T2> getDoctors() {
        return doctors;
    }

    public Doctors findDoctorByName(String name) {
        for (int i = 0; i < doctors.size(); i++) {
            Doctors doctor = (Doctors) doctors.get(i);
            if (doctor.getName().equals(name)) {
                return doctor;
            }
        }
        return null; // doctor not found
    }

    public Patients findPatientByName(String name) {
        for (int i = 0; i < patients.size(); i++) {
            Patients patient = (Patients) patients.get(i);
            if (patient.getName().equals(name)) {
                return patient;
            }
        }
        return null; // patient not found
    }

    public String toString() {
        return "\033[33mRoom Number\033[0m: " + roomNumber +
                "\033[33m No.Of Beds:\033[0m " + capacity +
                "\033[33m Room Type:\033[0m " + roomType;
    }

  

}
