
public class Hospital {
    private ArrayList<Patients> patients;
    private ArrayList<Doctors> doctors;
    

    public Hospital(){
        patients=new ArrayList<>();
        doctors=new ArrayList<>();
        
    }
 
    public void addPatient(Patients patient){
        patients.add(patient);
    }

    public void addDoctor(Doctors doctor){
        doctors.add(doctor);
    }

    public void removeDoctor(Doctors doctor){
        doctors.remove(doctor);
    }

    public void removePatient(Patients patient){
        patients.remove(patient);
    }

    public ArrayList<Patients> getPatient(){
    return patients;
    }

    public ArrayList<Doctors> getDoctor(){
        return doctors;
    }
   

   public boolean isEmptyPatients(){
    return patients.isEmpty();
   }

   public boolean isEmptyDoctor(){
    return doctors.isEmpty();
   }

   public Patients findPatientByName(String name) {
    for (int i = 0; i < patients.size(); i++) {
        Patients patient = patients.get(i);
        if (patient.getName().equals(name)) {
            return patient;
        }
    }
    return null; // patient not found
}

public Patients findPatientById(int id) {
    for (int i = 0; i < patients.size(); i++) {
        Patients patient = patients.get(i);
        if (patient.getId() == id) {
            return patient;
        }
    }
    return null; // patient not found
}

public Doctors findDoctorByName(String name) {
    for (int i = 0; i < doctors.size(); i++) {
        Doctors doctor = doctors.get(i);
        if (doctor.getName().equals(name)) {
            return doctor;
        }
    }
    return null; // doctor not found
}

public Doctors findDoctorById(int id) {
    for (int i = 0; i < doctors.size(); i++) {
        Doctors doctor = doctors.get(i);
        if (doctor.getId() == id) {
            return doctor;
        }
    }
    return null; // doctor not found
}




}
