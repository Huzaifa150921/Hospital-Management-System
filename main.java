import java.util.Scanner;
import java.util.InputMismatchException;
public class main {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
System.out.println("\033[35mWelcome to SSH Hospital\033[0m");
        Hospital hospital=new Hospital();
        int r1Capacity;
        int r2Capacity;
        int r3Capacity;
        int r4Capacity;
        int r5Capacity;
        
        try{ 
        while(true){
        
         
        System.out.println("\033[33mPress 1 to manege Patients\nPress 2 to manege Doctors\nPress 3 to manege Rooms\nPress 0 to quit\033[0m");
         int HospitalManegment=in.nextInt();
         
        
         while(HospitalManegment<0 || HospitalManegment>3){
           
        System.out.println("\033[31mYou have entered Invalid input\033[0m");
        System.out.println("\033[34mPlease Select a key from the following:\033[0m");
        break;
            
}//  loop


         if(HospitalManegment==0){
            System.out.println("\033[31mWARNING! Your data will lost if you quit.\033[0m");
            System.out.println("\033[35mStill Do you want to quit (Y/N)?\033[0m");
            char c=in.next().charAt(0);
            while(true){
            if(c=='n' || c=='N'){
                System.out.println("\033[34mPlease Select a key from the following:\033[0m");
                break;
            }// if
            else if(c=='Y' || c=='y'){
                System.out.println("\033[32mProgram terminated\033[0m");
                System.exit(0);
            }// else if
            else{
                System.out.println("\033[31mYou have enterd Invalid Input.\033[0m");
                System.out.println("\033[31mProcess Failed!\033[0m");
                break;
            }
        }// while
         }// if
         //----------------------------------------- Patients---------------------------------------------------
         if(HospitalManegment==1){
          while(true){
        System.out.println("\033[36mPress 1 to admit Patient\nPress 2 to print Patients\nPress 3 to search Patient\nPress 0 to Go Back\033[0m");
        
         int PatientManegment=in.nextInt();
         while(PatientManegment<0 || PatientManegment>3){
           
            System.out.println("\033[31mYou have entered Invalid input\033[0m");
            System.out.println("\033[34mPlease Select a key from the following:\033[0m");
            break;
                
    }//  loop

          if(PatientManegment==0){
            break;
          }// Go back to previou loop
         
      else if(PatientManegment ==1){
        Patients patient1=new Patients(211370161, "Huzaifa", 20, "Male","Fever","Normal");
        Patients patient2=new Patients(211370168, "Sheriyar", 20, "Male","Flu","Normal");
        Patients patient3=new Patients(211370130, "Shahzaib", 20, "Male", "cold","Normal");
        Patients patient4=new Patients(21133034, "Ali", 28, "Male", "cancer","Critical");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
       System.out.println("\033[34mHow many Patients to you want to add\033[0m");
      int itratepatient=in.nextInt();
       while(itratepatient<0){
        System.out.println("\033[31mYou have entered Invalid input. Input should be > 0\033[0m");
        System.out.println("\033[34mHow many Patients to you want to add\033[0m");
         itratepatient=in.nextInt();
       }// while
       for(int i=0;i<itratepatient;i++){
        System.out.println("\033[34mEnter data for Patient "+(i+1)+"\033[0m");
        System.out.println("Enter Patient ID:");
    int id = in.nextInt();
    while(id<0){
        System.out.println("\033[31mYou have enterd Invalid Input. ID should be > 0\033[0m");
        System.out.println("Enter Patient ID:");
     id = in.nextInt();
    }// while
    System.out.println("Enter Patient Name:");
    String name = in.next();
    System.out.println("Enter Patient Age:");
    int age = in.nextInt();
    while(age<=0){
        System.out.println("\033[31mYou have enterd Invalid Input. Age should be > 0\033[0m");
        System.out.println("Enter Patient Age:");
     age = in.nextInt();
    }// while
    System.out.println("Enter Patient Gender: \nPress 1 for Male\nPress 2 for Female");
    int choice1= in.nextInt();
    String gender;
   if(choice1<=0 || choice1>2){
    System.out.println("\033[31mProcess Failed!\033[0m");
    System.out.println("\033[31mYou have enterd Invalid Input.\033[0m");
    break;
   }
   else if(choice1==1){
     gender="Male";
   }
   else{
 gender="Female";
   }
    System.out.println("Enter Patient Disease:");
    String disease = in.next();
    System.out.println("Enter Patient Condition: \nPress 1 for Normal\nPress 2 for Critical");
    int choice= in.nextInt();
    String condition;
   if(choice<=0 || choice>2){
    System.out.println("\033[31mProcess Failed!\033[0m");
    System.out.println("\033[31mYou have enterd Invalid Input.\033[0m");
    break;
   }
   else if(choice==1){
     condition="Normal";
   }
   else{
 condition="Critical";
   }
   
int Admission=2000;
int room=5000;
System.out.println("How many days patient want to admit");
int admit=in.nextInt();
while(admit<=0){
    System.out.println("\033[31mYou have entered invalid input\033[0m");
    System.out.println("How many days patient want to admit");
    admit=in.nextInt();
}
System.out.println("\033[35mPatient "+(i+1)+" Bill\033[0m");
System.out.println("\033[35mAdmission Charges: \033[0m"+Admission);
System.out.println("\033[35mRoom Charges: \033[0m"+room*admit);
System.out.println("\033[35mTax Charges: \033[0m"+(room*admit)/3);
System.out.println("\033[35mTotal Charges: \033[0m" + ((room * admit) / 3 + Admission + (room * admit)));

System.out.println("\033[33mPress 1 to pay\033[0m");
int bill=in.nextInt();

 if(bill==1){
    Patients patient = new Patients(id, name, age, gender, disease,condition);
   
    hospital.addPatient(patient);
    System.out.println("\033[32mPatient "+(i+1)+" Successfuly added\033[0m");
}
   else{
    System.out.println("\033[31mProcess Failed!");
    System.out.println("\033[31mYou have entered invalid input");
    
   }
      
       } // Patient case 1 for loop
 }// Patient case 1

    else if(PatientManegment ==2){
      
        if(hospital.isEmptyPatients()==true){
            System.out.println("\033[33mPatients list is Empty\033[0m");
        }// if
        else{
            ArrayList<Patients> patientAddPrint = hospital.getPatient();
        System.out.println("\033[35mPatients are:\033[0m");
        for (int i = 0; i < patientAddPrint.size(); i++) {
            Patients patient = patientAddPrint.get(i);
            System.out.println(patient.toString());
    } //  Patient case 2 for loop
}// else
    }//  Patient case 2

    
    else if(PatientManegment ==3){
        System.out.println("\033[34mEnter patient Name do you want to search\033[0m");
        String Patientname=in.next();
        while(true){
        if(hospital.findPatientByName(Patientname)==null){
            System.out.println("\033[31mPatient not found. Check you typed the name Correctly.\033[0m");
            System.out.println("\033[34mPress 1 if you want to search patient by id\nPress 0 to go back\033[0m");
            int choice=in.nextInt();
            while(choice<0 || choice >1){
                System.out.println("\033[31mYou have entered Invalid input\033[0m");
                System.out.println("\033[34mPlease Select a key from the following:\033[0m");
                System.out.println("\033[34mPress 1 if you want to search patient by id\nPress 0 to go back\033[0m");
               choice=in.nextInt();
            }// while
            if(choice==0){
            break;
            }// if
            else if(choice == 1){
                System.out.println("\033[34mEnter ID of Patient\033[0m");
                int searchID=in.nextInt();
                if(hospital.findPatientById(searchID)==null){
                    System.out.println("\033[31mPatient not found.\033[0m");
                    break;
                }// if
                Patients Patientsearch = hospital.findPatientById(searchID);
        System.out.println("\033[32mName:\033[0m " + Patientsearch.getName() +"\033[32m Patient ID:\033[0m "+Patientsearch.getId()+ "\033[32m Patient age is:\033[0m " + Patientsearch.getAge() +"\033[32m Patient Diease is:\033[0m " +Patientsearch.getDiease()+"\033[32m Patient Condition:\033[0m "+Patientsearch.getcondition());
        break;
            }// else if
        }// if outer
        Patients Patientsearch = hospital.findPatientByName(Patientname);
        System.out.println("\033[32mName:\033[0m " + Patientsearch.getName() +"\033[32m Patient ID:\033[0m "+Patientsearch.getId()+ "\033[32m Patient age is:\033[0m " + Patientsearch.getAge() +"\033[32m Patient Diease is:\033[0m " +Patientsearch.getDiease()+"\033[32m Patient Condition:\033[0m "+Patientsearch.getcondition());
        break;
    }// case 3 infinite loop
    }// patient case 3
}// infinite sub manegment while
         }// Hospital case 1 
        

//----------------------------------------- Doctors---------------------------------------------------

        if(HospitalManegment==2){
            while(true){
          System.out.println("\033[36mPress 1 to hier Doctor\nPress 2 to print Doctors\nPress 3 to search Doctor\nPress 4 to remove Doctor\nPress 0 to Go Back\033[0m");
          
           int DoctortManegment=in.nextInt();
           while(DoctortManegment<0 || DoctortManegment>4){
           
            System.out.println("\033[31mYou have entered Invalid input\033[0m");
            System.out.println("\033[34mPlease Select a key from the following:\033[0m");
            break;
                
    }//  loop

  
            if(DoctortManegment==0){
              break;
            }// Go back to previous loop
           
        else if(DoctortManegment ==1){
            Doctors doctor1=new Doctors(211370161, "Huzaifa","Male","Surgery");
            Doctors doctor2=new Doctors(211370168, "Sheriyar", "Male","Infections");
            Doctors doctor3=new Doctors(211370130, "Shahzaib", "Male", "Cancer");
            Doctors doctor4=new Doctors(21133034, "Ali", "Male", "Allergies");
            hospital.addDoctor(doctor1);
            hospital.addDoctor(doctor2);
            hospital.addDoctor(doctor3);
            hospital.addDoctor(doctor4);
         System.out.println("\033[34mHow many Doctors to you want to add\033[10m");
         int itratedoctor=in.nextInt();
         while(itratedoctor<0){
            System.out.println("\033[31mYou have entered Invalid input. Input should be > 0\033[0m");
            System.out.println("\033[34mHow many Doctors to you want to add\033[0m");
             itratedoctor=in.nextInt();
           }// while
         for(int i=0;i<itratedoctor;i++){
          System.out.println("\033[34mEnter data for Doctor "+(i+1)+"\033[0m");
          System.out.println("Enter Doctor ID:");
         int id=in.nextInt();
         while(id<0){
            System.out.println("\033[31mYou have enterd Invalid Input. ID should be > 0\033[0m");
            System.out.println("Enter Doctor ID:");
         id = in.nextInt();
        }// while
         System.out.println("Enter Doctor Name:");
        String name=in.next();
        System.out.println("Enter Doctor Gender: \nPress 1 for Male\nPress 2 for Female");
    int choice1= in.nextInt();
    String gender;
   if(choice1<=0 || choice1>2){
    System.out.println("\033[31mProcess Failed!\033[0m");
    System.out.println("\033[31mYou have enterd Invalid Input.\033[0m");
    break;
   }
   else if(choice1==1){
     gender="Male";
   }
   else{
 gender="Female";
   }
         System.out.println("Enter Doctor Specilty: \nPress 1 for Surgery\nPress 2 for Infections\nPress 3 for Cancer\nPress 4 for Allergies");
         int choice= in.nextInt();
         String specialty;
        if(choice<=0 || choice>4){
         System.out.println("\033[31mProcess Failed!\033[0m");
         System.out.println("\033[31mYou have enterd Invalid Input.\033[0m");
         break;
        }
        else if(choice==1){
          specialty="Surgery";
        }
        else if(choice==2){
      specialty="Infections";
        }
        else if(choice==3){
            specialty="Cancer";
        }
        else{
            specialty="Allergies";
        }

         Doctors doctor=new Doctors(id, name, gender, specialty);
         hospital.addDoctor(doctor);
         System.out.println("\033[32mDoctor "+(i+1)+" successfully added\033[0m");
         } // Doctor case 1 for loop
   }// Doctor case 1

   else if(DoctortManegment ==2){

    if(hospital.isEmptyDoctor()==true){
        System.out.println("\033[33mDoctors list is Empty\033[0m");
    }// if
    else{
    ArrayList<Doctors> doctorAddPrint = hospital.getDoctor();
    System.out.println("\033[35mDoctors are:\033[0m");
    for (int i = 0; i < doctorAddPrint.size(); i++) {
        Doctors doctor = doctorAddPrint.get(i);
        System.out.println(doctor.toString());
} //  Doctor case 2 for loop
    }// esle
}//  Doctor case 2

else if(DoctortManegment==3){
    System.out.println("\033[34mEnter Doctor Name do you want to search\033[0m");
    String Doctorname=in.next();
    while(true){
        if(hospital.findDoctorByName(Doctorname)==null){
            System.out.println("\033[31mDoctor not found. Check you typed the name Correctly.\033[0m");
            System.out.println("\033[34mPress 1 if you want to search Doctor by id\nPress 0 to go back\033[0m");
            int choice=in.nextInt();
            while(choice<0 || choice >1){
                System.out.println("\033[31mYou have entered Invalid input\033[0m");
                System.out.println("\033[34mPlease Select a key from the following:\033[0m");
                System.out.println("\033[34mPress 1 if you want to search Doctor by id\nPress 0 to go back\033[0m");
               choice=in.nextInt();
            }// while
            if(choice==0){
            break;
            }// if
            else if(choice==1){
                System.out.println("\033[34mEnter ID of Doctor\033[0m");
                int IDsearch=in.nextInt();
                if(hospital.findDoctorById(IDsearch)==null){
                    System.out.println("\033[31mDoctor not found.\033[0m");
                    break;
                }// if
            Doctors doctorsearch=hospital.findDoctorById(IDsearch);
            System.out.println("\033[32mName:\033[0m Dr."+doctorsearch.getName() +"\033[32m ID:\033[0m "+doctorsearch.getId()+ "\033[32m Gender:\033[0m " + doctorsearch.getGender() +"\033[32m Specialty:\033[0m " +doctorsearch.getSpecialty());
            break;
            }//else if
        }// if
    Doctors doctorsearch=hospital.findDoctorByName(Doctorname);
    System.out.println("\033[32mName:\033[0m Dr."+doctorsearch.getName() +"\033[32m ID:\033[0m "+doctorsearch.getId()+ "\033[32m Gender:\033[0m " + doctorsearch.getGender() +"\033[32m Specialty:\033[0m " +doctorsearch.getSpecialty());
    break;
    }// case3 infinte loop
}// Doctor Manegment case 3 

              else if(DoctortManegment==4){
                System.out.println("\033[34mEnter Doctor Name do you want to remove\033[0m");
                String Doctorname=in.next();
                while(true){
                    if(hospital.findDoctorByName(Doctorname)==null){
                        System.out.println("\033[31mDoctor doesn't exist. Check you typed the name Correctly.\033[0m");
                        System.out.println("\033[34mPress 1 if you want to remove Doctor by id\nPress 0 to go back\033[0m");
                        int choice=in.nextInt();
                        while(choice<0 || choice >1){
                            System.out.println("\033[31mYou have entered Invalid input\033[0m");
                            System.out.println("\033[34mPlease Select a key from the following:\033[0m");
                            System.out.println("\033[34mPress 1 if you want to search Doctor by id\nPress 0 to go back\033[0m");
                           choice=in.nextInt();
                        }// while
                        if(choice==0){
                        break;
                        }// if
                        else if(choice==1){
                            System.out.println("\033[34mEnter ID of Doctor\033[0m");
                            int IDsearch=in.nextInt();
                            if(hospital.findDoctorById(IDsearch)==null){
                                System.out.println("\033[31mDoctor doesn't exist.\033[0m");
                                break;
                            }// if
                        Doctors doctorsearch=hospital.findDoctorById(IDsearch);
                        System.out.println("\033[32mName:\033[0m Dr."+doctorsearch.getName() +"\033[32m ID:\033[0m "+doctorsearch.getId()+ "\033[32m Gender:\033[0m " + doctorsearch.getGender() +"\033[32m Specialty:\033[0m " +doctorsearch.getSpecialty());
                        
                        System.out.println("\033[35mAre you sure you want to remove doctor (Y/N)?\033[0m");
                        char c=in.next().charAt(0);
                    
                        if(c=='Y' || c== 'y'){
                            hospital.removeDoctor(doctorsearch);
                            System.out.println("\033[32mDoctor removed Successfuly\033[0m");
                            break;
                        }// if
                        else if(c=='n' || c=='N'){
                            break;
                        }// elase if
                        else{
                            System.out.println("\033[31mYou have entered Invalid Input.\033[0m");
                            System.out.println("\033[31mProcess Failed!\033[0m");
                            break;
                        }// else
                        }//else if
                    }// if
                Doctors doctorsearch=hospital.findDoctorByName(Doctorname);
                System.out.println("\033[32mName:\033[0m Dr."+doctorsearch.getName() +"\033[32m ID:\033[0m "+doctorsearch.getId()+ "\033[32m Gender:\033[0m " + doctorsearch.getGender() +"\033[32m Specialty:\033[0m " +doctorsearch.getSpecialty());
                System.out.println("\033[35mAre you sure you want to remove doctor (Y/N)?\033[0m");
                char c=in.next().charAt(0);
            
                if(c=='Y' || c== 'y'){
                    hospital.removeDoctor(doctorsearch);
                    System.out.println("\033[32mDoctor removed Successfuly\033[0m");
                    break;
                }// if
                else if(c=='n' || c=='N'){
                    break;
                }// elase if
                else{
                    System.out.println("\033[31mYou have entered Invalid Input.\033[0m");
                    break;
                }// else
                }// case4 infinte loop
              } //  doctor Manegment case 4
} //infinite sub manegment while
        }// Hospital case 2
       
            //_______________________________Room_______________________________________

        else if(HospitalManegment==3){
            Room<Patients,Doctors> r1=new Room<>(1, 5,"Surgery");
            Room<Patients,Doctors> r2=new Room<>(2, 5,"Infections");
            Room<Patients,Doctors> r3=new Room<>(3, 5,"Cancer");
            Room<Patients,Doctors> r4=new Room<>(4, 5,"Allergies");
            Room<Patients,Doctors> r5=new Room<>(5, 2,"ICU");

             r1Capacity=r1.getCapacity();
             r2Capacity=r2.getCapacity();
             r3Capacity=r3.getCapacity();
             r4Capacity=r4.getCapacity();
             r5Capacity=r5.getCapacity();

             
          
            while(true){
             
            System.out.println("\033[36mPress 1 to check Rooms Status\nPress 2 to move  Patients in Room\nPress 3 to check moved paitents\nPress 4 to move Doctors in Room\nPress 5 to check moved Doctors\nPress 6 to assign patients to Doctor\nPress 0 to Go Back\033[0m");
    
            
          int  roomManegment=in.nextInt();
          while(roomManegment<0 || roomManegment>7){
            System.out.println("\033[31mYou have entered Invalid input\033[0m");
            System.out.println("\033[34mPlease Select a key from the following:\033[0m");
            break;
                
    }//  loop
    if(roomManegment==0){
        break;
    } // room manegement case 0
    else if(roomManegment==1){
       
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println( r4.toString());
        System.out.println( r5.toString());
        
    }// room manegement case 1
      else if(roomManegment==2){
       
       while(true){
      
        
        if(hospital.isEmptyPatients()==true){
            System.out.println("\033[33mPatients list is Empty\033[0m");
            break;
        }// if
       
            ArrayList<Patients> patientAddPrint = hospital.getPatient();
        System.out.println("\033[35mAdmitted patient list:\033[0m");
        for (int i = 0; i < patientAddPrint.size(); i++) {
            Patients patient = patientAddPrint.get(i);
            System.out.println(patient.toString());
        }//for
        System.out.println("\033[34mEnter patient Name do you want to move:\033[0m");
        String Patientname=in.next();
        if(hospital.findPatientByName(Patientname)==null){
            System.out.println("\033[31mProcess Failed!\033[0m");
            System.out.println("\033[31mPatient doesn't exist. Check you typed the name Correctly.\033[0m");
          break;
        }
        Patients Patientsearch = hospital.findPatientByName(Patientname);
        System.out.println("\033[32mName:\033[0m " + Patientsearch.getName() +"\033[32m ID:\033[0m "+Patientsearch.getId()+ "\033[32m Age:\033[0m " + Patientsearch.getAge() +" \033[32m Diease:\033[0m " +Patientsearch.getDiease()+"\033[32m Condition:\033[0m "+Patientsearch.getcondition());
        System.out.println("\033[34mRooms Status:\033[0m");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println( r5.toString());
        System.out.println("\033[34mEnter room number ");
        int roomnum=in.nextInt();
       while(roomnum<0 || roomnum>5){
        System.out.println("\033[31mProcess Failed!\033[0m");
                System.out.println("\033[31mYou have entered Invalid input\033[0m"); 
              break; 
        }//  loop 
        if(Patientsearch.getcondition().equals("Normal")){
            if(roomnum==1){
    
                if(r1.getCapacity()==0){
                    System.out.println("\033[31mProcess Failed!\033[0m");
                    System.out.println("\033[31mRoom is Full\033[0m");
                   break;
                }// if        
    
    
        r1.addPatient(Patientsearch);
        r1.setCapacity(r1Capacity-1);
        hospital.removePatient(Patientsearch);
        System.out.println("\033[32m"+Patientsearch.getName()+" moved to Room "+r1.getRoomNumber());
    break;
            }// if
            
          
    
            if(roomnum==2){
                if(r2.getCapacity()==0){
                    System.out.println("\033[31mProcess Failed!\033[0m");
                    System.out.println("\033[31mRoom is Full\033[0m");
                   break;
                }// if
             
                    r2.addPatient(Patientsearch);
                    r2.setCapacity(r2Capacity-1);
                    hospital.removePatient(Patientsearch);
                    System.out.println("\033[32m"+Patientsearch.getName()+" moved to Room "+r2.getRoomNumber());
               break;
                        }// if
                      
         
                        if(roomnum==3){
                            if(r3.getCapacity()==0){
                                System.out.println("\033[31mProcess Failed!\033[0m");
                                System.out.println("\033[31mRoom is Full\033[0m");
                               break;
                            }// if
                           
                                r3.addPatient(Patientsearch);
                                r3.setCapacity(r3Capacity-1);
                                hospital.removePatient(Patientsearch);
                                System.out.println("\033[32m"+Patientsearch.getName()+" moved to Room "+r3.getRoomNumber());
                            break;
                                    }// if
                                  
    
                                    if(roomnum==4){
                                        if(r4.getCapacity()==0){
                                            System.out.println("\033[31mProcess Failed!\033[0m");
                                            System.out.println("\033[31mRoom is Full\033[0m");
                                           break;
                                        }// if
                                      
                                            r4.addPatient(Patientsearch);
                                            r4.setCapacity(r4Capacity-1);
                                            hospital.removePatient(Patientsearch);
                                        System.out.println("\033[32m"+Patientsearch.getName()+" moved to Room "+r4.getRoomNumber());
                                        break;
                                                }// if
                                                
                                            }// if
                                            else{
                                                System.out.println("\033[31mProcess Failed!\033[0m");
                                                System.out.println("\033[31mCritical Condition! Patient Should move to ICU\033[0m");
                                            
                                               }
    
    if(Patientsearch.getcondition().equals("Critical")){
        
                                                if(roomnum==5){
                                                    if(r5.getCapacity()==0){
                                                        System.out.println("\033[31mProcess Failed!\033[0m");
                                                        System.out.println("\033[31mRoom is Full\033[0m");
                                                       break;
                                                    }// if        
                                        
                                            r5.addPatient(Patientsearch);
                                            r5.setCapacity(r5Capacity-1);
                                            hospital.removePatient(Patientsearch);
                                            System.out.println("\033[32m"+Patientsearch.getName()+" moved to Room "+r5.getRoomNumber());
                                        break;
                                                }// if
                                                break;
                                            }// if
                                            
                                           else{
                                            System.out.println("\033[31mProcess Failed!\033[0m");
                                            System.out.println("\033[31mNormal Condition! Patient Should move to Room\033[0m");
                                            
                                           }
                                                break;
    
}// roomloop
    }//room manegement case 2

else if(roomManegment==3){
     
     if(r1.getPatients().isEmpty()) {
        System.out.println("\033[31mRoom 1 is Empty\033[0m");
        
    }
    else{
ArrayList<Patients> patientPrint1 = r1.getPatients();
System.out.println("\033[35mPatients in Room 1:\033[0m");
for (int i = 0; i < patientPrint1.size(); i++) {
    Patients patient = patientPrint1.get(i);
    System.out.println(patient.toString());
}//for
    }// else

if(r2.getPatients().isEmpty()){
    System.out.println("\033[31mRoom 2 is Empty\033[0m");
   
}
else{
ArrayList<Patients> patientPrint2= r2.getPatients();
System.out.println("\033[35mPatients in Room 2:\033[0m");
for (int i = 0; i < patientPrint2.size(); i++) {
    Patients patient = patientPrint2.get(i);
    System.out.println(patient.toString());
}//for
}// else

if(r3.getPatients().isEmpty()){
    System.out.println("\033[31mRoom 3 is Empty\033[0m");
   
}
else{
ArrayList<Patients> patientPrint3= r3.getPatients();
System.out.println("\033[35mPatients in Room 3:\033[0m");
for (int i = 0; i < patientPrint3.size(); i++) {
    Patients patient = patientPrint3.get(i);
    System.out.println(patient.toString());
}//for
}// else
  
if(r4.getPatients().isEmpty()){
    System.out.println("\033[31mRoom 4 is Empty\033[0m");
   
}
else{
ArrayList<Patients> patientPrint4= r4.getPatients();
System.out.println("\033[35mPatients in Room 4:\033[0m");
for (int i = 0; i < patientPrint4.size(); i++) {
    Patients patient = patientPrint4.get(i);
    System.out.println(patient.toString());
}//for
}// else

if(r5.getPatients().isEmpty()){
    System.out.println("\033[31mICU is Empty\033[0m");
   
}
else{
ArrayList<Patients> patientPrint5= r5.getPatients();
System.out.println("\033[35mPatient in ICU:\033[0m");
for (int i = 0; i < patientPrint5.size(); i++) {
    Patients patient = patientPrint5.get(i);
    System.out.println(patient.toString());
}//for
}// else
}//room manegement case 3


else if(roomManegment==4){
   
    
   while(true){
     
     if(hospital.isEmptyDoctor()==true){
         System.out.println("\033[33mDoctors list is Empty\033[0m");
         break;
     }// if
    
         ArrayList<Doctors> doctorAddPrint = hospital.getDoctor();
     System.out.println("\033[35mHired Doctors list:\033[0m");
     for (int i = 0; i < doctorAddPrint.size(); i++) {
         Doctors doctor = doctorAddPrint.get(i);
         System.out.println(doctor.toString());
     }//for
     System.out.println("\033[34mEnter doctor name do you want to move:\033[0m");
     String Doctorname=in.next();
     if(hospital.findDoctorByName(Doctorname)==null){
         System.out.println("\033[31mProcess Failed!\033[0m");
         System.out.println("\033[31mDoctor doesn't exist. Check you typed the name Correctly.\033[0m");
       break;
     }
     Doctors doctorsearch=hospital.findDoctorByName(Doctorname);
     System.out.println("\033[32mName:\033[0m Dr."+doctorsearch.getName() + "\033[32m ID:\033[0m "+doctorsearch.getId()+ "\033[32m Gender:\033[0m " + doctorsearch.getGender() +"\033[32m Specialty:\033[0m " +doctorsearch.getSpecialty());
     System.out.println("\033[34mRooms Status:\033[0m");
     System.out.println(r1.toString());
     System.out.println(r2.toString());
     System.out.println(r3.toString());
     System.out.println(r4.toString());
     System.out.println(r5.toString());
     System.out.println("\033[34mEnter room number ");
     int roomnum=in.nextInt();
    while(roomnum<0 || roomnum>5){
     System.out.println("\033[31mProcess Failed!\033[0m");
             System.out.println("\033[31mYou have entered Invalid input\033[0m"); 
           break; 
     }//  loop 


     if(doctorsearch.getSpecialty().equals("Surgery") && roomnum==1){
    r1.addDoctor(doctorsearch);
    hospital.removeDoctor(doctorsearch);
    System.out.println("\033[32m"+doctorsearch.getName()+" moved to Room "+r1.getRoomNumber());
break;
      
    }// if
    

   if(doctorsearch.getSpecialty().equals("Infections") && roomnum==2){
r2.addDoctor(doctorsearch);
hospital.removeDoctor(doctorsearch);
System.out.println("\033[32m"+doctorsearch.getName()+" moved to Room "+r2.getRoomNumber());
break; 
}// if


if(doctorsearch.getSpecialty().equals("Cancer") && roomnum==3){
r3.addDoctor(doctorsearch);
hospital.removeDoctor(doctorsearch);
System.out.println("\033[32m"+doctorsearch.getName()+" moved to Room "+r3.getRoomNumber());
 break;
}// if


if(doctorsearch.getSpecialty().equals("Allergies") && roomnum==4){
r4.addDoctor(doctorsearch);
hospital.removeDoctor(doctorsearch);
System.out.println("\033[32m"+doctorsearch.getName()+" moved to Room "+r4.getRoomNumber());
break;
  
}// if



if(roomnum==5){
r5.addDoctor(doctorsearch);
hospital.removeDoctor(doctorsearch);
System.out.println("\033[32m"+doctorsearch.getName()+" moved to Room "+r5.getRoomNumber());
break;
} // if

System.out.println("\033[31mProcess Failed!\033[0m");
System.out.println("\033[31mSpeciality not match!\033[0m");

  break;

   }// while
 }//room manegement case 4

 else if(roomManegment==5){
     
    if(r1.getDoctors().isEmpty()) {
       System.out.println("\033[31mNo Doctor in Room 1\033[0m");
       
   }
   else{
ArrayList<Doctors> doctorPrint1 = r1.getDoctors();
System.out.println("\033[35mDoctors in Room 1:\033[0m");
for (int i = 0; i < doctorPrint1.size(); i++) {
   Doctors doctors = doctorPrint1.get(i);
   System.out.println(doctors.toString());
}//for
   }// else

   if(r2.getDoctors().isEmpty()) {
    System.out.println("\033[31mNo Doctor in Room 2\033[0m");
    
}
else{
ArrayList<Doctors> doctorPrint2 = r2.getDoctors();
System.out.println("\033[35mDoctors in Room 2:\033[0m");
for (int i = 0; i < doctorPrint2.size(); i++) {
Doctors doctors = doctorPrint2.get(i);
System.out.println(doctors.toString());
}//for
}// else

if(r3.getDoctors().isEmpty()) {
    System.out.println("\033[31mNo Doctor in Room 3\033[0m");
    
}
else{
ArrayList<Doctors> doctorPrint3 = r3.getDoctors();
System.out.println("\033[35mDoctors in Room 3:\033[0m");
for (int i = 0; i < doctorPrint3.size(); i++) {
Doctors doctors = doctorPrint3.get(i);
System.out.println(doctors.toString());
}//for
}// else
 
if(r4.getDoctors().isEmpty()) {
    System.out.println("\033[31mNo Doctor in Room 4\033[0m");
    
}
else{
ArrayList<Doctors> doctorPrint4 = r4.getDoctors();
System.out.println("\033[35mDoctors in Room 4:\033[0m");
for (int i = 0; i < doctorPrint4.size(); i++) {
Doctors doctors = doctorPrint4.get(i);
System.out.println(doctors.toString());
}//for
}// else

if(r5.getDoctors().isEmpty()) {
    System.out.println("\033[31mNo Doctor in ICU\033[0m");
    
}
else{
ArrayList<Doctors> doctorPrint5 = r5.getDoctors();
System.out.println("\033[35mDoctors in ICU:\033[0m");
for (int i = 0; i < doctorPrint5.size(); i++) {
 Doctors doctors = doctorPrint5.get(i);
System.out.println(doctors.toString());
}//for
}// else
}//room manegement case 5

else if(roomManegment==6){
   
    Patients patientsearch1;
    Doctors doctorsearch;
    while(true){
        System.out.println("\033[33mPress 1 to manege room 1\nPress 2 to manege room 2\nPress 3 to manege room 3\nPress 4 to manege room 4\nPress 5 to manege ICU\nPress 0 to Go Back\033[0m");

        
      int room=in.nextInt();

      while(room<0 || room>5){
        System.out.println("\033[31mYou have entered Invalid input\033[0m");
        System.out.println("\033[34mPlease Select a key from the following:\033[0m");
        break;
            
}//  loop


if(room==0){
    break;
}// if


    //       ROOM 1
    else if(room==1){
    if(r1.getDoctors().isEmpty()) {
        System.out.println("\033[31mNo Doctor in Room 1\033[0m");
        break;
    }// if
    else{
        ArrayList<Doctors> doctorPrint1 = r1.getDoctors();
System.out.println("\033[35mDoctors in Room 1:\033[0m");
for (int i = 0; i < doctorPrint1.size(); i++) {
   Doctors doctors = doctorPrint1.get(i);
   System.out.println(doctors.toString());
}//for
        System.out.println("\033[34mEnter doctor name to assign patient:\033[0m");
        String Doctorname=in.next();
        if(r1.findDoctorByName(Doctorname)==null){
            System.out.println("\033[31mProcess Failed!\033[0m");
            System.out.println("\033[31mDoctor doesn't exist. Check you typed the name Correctly.\033[0m");
          break;
        }// if
         doctorsearch=r1.findDoctorByName(Doctorname);
        System.out.println("\033[32mDoctor Successfuly Selected\033[0m");
    }// else
//__________________________________________________________________________________-
    if(r1.getPatients().isEmpty()) {
        System.out.println("\033[31mNo Patient in Room 1\033[0m");
        break;
    }// if
    else{
        ArrayList<Patients> patientPrint1 = r1.getPatients();
System.out.println("\033[35mPatients in Room 1:\033[0m");
for (int i = 0; i < patientPrint1.size(); i++) {
   Patients patients = patientPrint1.get(i);
   System.out.println(patients.toString());
}//for
   

        System.out.println("\033[34mEnter patient name to assign doctor:\033[0m");
        String patientname=in.next();
        if(r1.findPatientByName(patientname)==null){
            System.out.println("\033[31mProcess Failed!\033[0m");
            System.out.println("\033[31mPatient doesn't exist. Check you typed the name Correctly.\033[0m");
          break;
        }// if
        
          patientsearch1=r1.findPatientByName(patientname);
        System.out.println("\033[32mPatient Successfuly Selected\n\033[0m");
    }// else
    r1.assignPatient(patientsearch1,doctorsearch);
    System.out.println("\033[32m"+patientsearch1.getName()+ " assigned to Dr." +doctorsearch.getName()+"\033[0m");

}//room 1


    //       ROOM 2
    else if(room==2){
        if(r2.getDoctors().isEmpty()) {
            System.out.println("\033[31mNo Doctor in Room 2\033[0m");
            break;
        }// if
        else{
            ArrayList<Doctors> doctorPrint1 = r2.getDoctors();
    System.out.println("\033[35mDoctors in Room 2:\033[0m");
    for (int i = 0; i < doctorPrint1.size(); i++) {
       Doctors doctors = doctorPrint1.get(i);
       System.out.println(doctors.toString());
    }//for
            System.out.println("\033[34mEnter doctor name to assign patient:\033[0m");
            String Doctorname=in.next();
            if(r2.findDoctorByName(Doctorname)==null){
                System.out.println("\033[31mProcess Failed!\033[0m");
                System.out.println("\033[31mDoctor doesn't exist. Check you typed the name Correctly.\033[0m");
              break;
            }// if
             doctorsearch=r2.findDoctorByName(Doctorname);
            System.out.println("\033[32mDoctor Successfuly Selected\033[0m");
        }// else
    //__________________________________________________________________________________-
        if(r2.getPatients().isEmpty()) {
            System.out.println("\033[31mNo Patient in Room 2\033[0m");
            break;
        }// if
        else{
            ArrayList<Patients> patientPrint1 = r2.getPatients();
    System.out.println("\033[35mPatients in Room 2:\033[0m");
    for (int i = 0; i < patientPrint1.size(); i++) {
       Patients patients = patientPrint1.get(i);
       System.out.println(patients.toString());
    }//for
       
    
            System.out.println("\033[34mEnter patient name to assign doctor:\033[0m");
            String patientname=in.next();
            if(r2.findPatientByName(patientname)==null){
                System.out.println("\033[31mProcess Failed!\033[0m");
                System.out.println("\033[31mPatient doesn't exist. Check you typed the name Correctly.\033[0m");
              break;
            }// if
            
              patientsearch1=r2.findPatientByName(patientname);
            System.out.println("\033[32mPatient Successfuly Selected\n\033[0m");
        }// else
        r2.assignPatient(patientsearch1,doctorsearch);
        System.out.println("\033[32m"+patientsearch1.getName()+ " assigned to Dr." +doctorsearch.getName()+"\033[0m");
    
    }//room 2

     //       ROOM 3
     else if(room==3){
        if(r3.getDoctors().isEmpty()) {
            System.out.println("\033[31mNo Doctor in Room 3\033[0m");
            break;
        }// if
        else{
            ArrayList<Doctors> doctorPrint1 = r3.getDoctors();
    System.out.println("\033[35mDoctors in Room 3:\033[0m");
    for (int i = 0; i < doctorPrint1.size(); i++) {
       Doctors doctors = doctorPrint1.get(i);
       System.out.println(doctors.toString());
    }//for
            System.out.println("\033[34mEnter doctor name to assign patient:\033[0m");
            String Doctorname=in.next();
            if(r3.findDoctorByName(Doctorname)==null){
                System.out.println("\033[31mProcess Failed!\033[0m");
                System.out.println("\033[31mDoctor doesn't exist. Check you typed the name Correctly.\033[0m");
              break;
            }// if
             doctorsearch=r3.findDoctorByName(Doctorname);
            System.out.println("\033[32mDoctor Successfuly Selected\033[0m");
        }// else
    //__________________________________________________________________________________-
        if(r3.getPatients().isEmpty()) {
            System.out.println("\033[31mNo Patient in Room 3\033[0m");
            break;
        }// if
        else{
            ArrayList<Patients> patientPrint1 = r3.getPatients();
    System.out.println("\033[35mPatients in Room 3:\033[0m");
    for (int i = 0; i < patientPrint1.size(); i++) {
       Patients patients = patientPrint1.get(i);
       System.out.println(patients.toString());
    }//for
       
    
            System.out.println("\033[34mEnter patient name to assign doctor:\033[0m");
            String patientname=in.next();
            if(r3.findPatientByName(patientname)==null){
                System.out.println("\033[31mProcess Failed!\033[0m");
                System.out.println("\033[31mPatient doesn't exist. Check you typed the name Correctly.\033[0m");
              break;
            }// if
            
              patientsearch1=r3.findPatientByName(patientname);
            System.out.println("\033[32mPatient Successfuly Selected\n\033[0m");
        }// else
        r3.assignPatient(patientsearch1,doctorsearch);
        System.out.println("\033[32m"+patientsearch1.getName()+ " assigned to Dr." +doctorsearch.getName()+"\033[0m");
    
    }//room 3

         //       ROOM 4
         else if(room==4){
            if(r4.getDoctors().isEmpty()) {
                System.out.println("\033[31mNo Doctor in Room 4\033[0m");
                break;
            }// if
            else{
                ArrayList<Doctors> doctorPrint1 = r4.getDoctors();
        System.out.println("\033[35mDoctors in Room 4:\033[0m");
        for (int i = 0; i < doctorPrint1.size(); i++) {
           Doctors doctors = doctorPrint1.get(i);
           System.out.println(doctors.toString());
        }//for
                System.out.println("\033[34mEnter doctor name to assign patient:\033[0m");
                String Doctorname=in.next();
                if(r4.findDoctorByName(Doctorname)==null){
                    System.out.println("\033[31mProcess Failed!\033[0m");
                    System.out.println("\033[31mDoctor doesn't exist. Check you typed the name Correctly.\033[0m");
                  break;
                }// if
                 doctorsearch=r4.findDoctorByName(Doctorname);
                System.out.println("\033[32mDoctor Successfuly Selected\033[0m");
            }// else
        //__________________________________________________________________________________-
            if(r4.getPatients().isEmpty()) {
                System.out.println("\033[31mNo Patient in Room 4\033[0m");
                break;
            }// if
            else{
                ArrayList<Patients> patientPrint1 = r4.getPatients();
        System.out.println("\033[35mPatients in Room 4:\033[0m");
        for (int i = 0; i < patientPrint1.size(); i++) {
           Patients patients = patientPrint1.get(i);
           System.out.println(patients.toString());
        }//for
           
        
                System.out.println("\033[34mEnter patient name to assign doctor:\033[0m");
                String patientname=in.next();
                if(r4.findPatientByName(patientname)==null){
                    System.out.println("\033[31mProcess Failed!\033[0m");
                    System.out.println("\033[31mPatient doesn't exist. Check you typed the name Correctly.\033[0m");
                  break;
                }// if
                
                  patientsearch1=r4.findPatientByName(patientname);
                System.out.println("\033[32mPatient Successfuly Selected\n\033[0m");
            }// else
            r4.assignPatient(patientsearch1,doctorsearch);
            System.out.println("\033[32m"+patientsearch1.getName()+ " assigned to Dr." +doctorsearch.getName()+"\033[0m");
        
        }//room 4

               //       ROOM 5
               else if(room==5){
                if(r5.getDoctors().isEmpty() ) {
                    System.out.println("\033[31mNo Doctor in ICU\033[0m");
                    break;
                }// if
                else{
                    ArrayList<Doctors> doctorPrint1 = r5.getDoctors();
            System.out.println("\033[35mDoctors in ICU:\033[0m");
            for (int i = 0; i < doctorPrint1.size(); i++) {
               Doctors doctors = doctorPrint1.get(i);
               System.out.println(doctors.toString());
            }//for
                    System.out.println("\033[34mEnter doctor name to assign patient:\033[0m");
                    String Doctorname=in.next();
                    if(r5.findDoctorByName(Doctorname)==null){
                        System.out.println("\033[31mProcess Failed!\033[0m");
                        System.out.println("\033[31mDoctor doesn't exist. Check you typed the name Correctly.\033[0m");
                      break;
                    }// if
                     doctorsearch=r5.findDoctorByName(Doctorname);
                    System.out.println("\033[32mDoctor Successfuly Selected\033[0m");
                }// else
            //__________________________________________________________________________________-
                if(r5.getPatients().isEmpty()) {
                    System.out.println("\033[31mNo Patient in ICU\033[0m");
                    break;
                }// if
                else{
                    ArrayList<Patients> patientPrint1 = r5.getPatients();
            System.out.println("\033[35mPatients in ICU:\033[0m");
            for (int i = 0; i < patientPrint1.size(); i++) {
               Patients patients = patientPrint1.get(i);
               System.out.println(patients.toString());
            }//for
               
            
                    System.out.println("\033[34mEnter patient name to assign doctor:\033[0m");
                    String patientname=in.next();
                    if(r5.findPatientByName(patientname)==null){
                        System.out.println("\033[31mProcess Failed!\033[0m");
                        System.out.println("\033[31mPatient doesn't exist. Check you typed the name Correctly.\033[0m");
                      break;
                    }// if
                    
                      patientsearch1=r5.findPatientByName(patientname);
                    System.out.println("\033[32mPatient Successfuly Selected\n\033[0m");
                }// else
                r5.assignPatient(patientsearch1,doctorsearch);
                System.out.println("\033[32m"+patientsearch1.getName()+ " assigned to Dr." +doctorsearch.getName()+"\033[0m");
                
                r5.removePatient(patientsearch1);
            
            }//room 5
}//  room while
}//room manegment 6
            }
            }//infinite sub manegment while
        }// infinite while loop
    }// try
 
     
     catch(InputMismatchException e){
              
        System.out.println("\033[31mSomething Went Wrong. Input should be Integer [0-9]\033[0m"); 
}// catch
}// main
}// class

