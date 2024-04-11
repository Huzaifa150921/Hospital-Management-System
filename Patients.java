
public class Patients{
	private int id;
	private String name;
    private int age;
    private String gender;
	private String diease;
    private  String condition;

public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setcondition(String condition){
        this.condition=condition;
    }

    public String getcondition(){
        return condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDiease() {
        return diease;
    }

    public void setDiease(String diease) {
        this.diease = diease;
    }

    public Patients(int id,String name,int age,String gender,String diease,String condition){
       
         setId(id);
         setName(name);
         setAge(age);
         setGender(gender);
         setDiease(diease);
         setcondition(condition);
    }
    
    public String toString(){
      
       return "\033[33mName:\033[0m "+name+"\033[33m ID:\033[0m "+id+"\033[33m Age:\033[0m "+age+"\033[33m Gender:\033[0m "+gender+" \033[33m Diease:\033[0m "+diease+"\033[33m Condition:\033[0m "+condition;
      
    }

   
}// class