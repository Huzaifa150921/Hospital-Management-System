
public class Doctors {
    private int id;
    private String name;
    private String gender;
    private String specialty;
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }



    public Doctors(int id,String name, String gender,String specialty) {
         setId(id);
         setName(name);
         setGender(gender);
         setSpecialty(specialty);
         
    }
    public String toString(){
        return "\033[33mName:\033[0m Dr."+name+"\033[33m ID:\033[0m "+id+"\033[33m Gender:\033[0m "+gender+"\033[33m Specialty:\033[0m "+specialty;
     }

   

  
}