class Student {
    String Name;
    String Adress;
    int Roll_no;
    int Phonenumber;
    

    void Student1(){
         Student s = new Student();
         s.Name = "Melody";
         s.Adress = "Libona";
         s.Roll_no = 1;
         s.Phonenumber = 2218888;
         System.out.println("Name:" + s.Name);
          System.out.println("Adress:" + s.Adress);
          System.out.println("Roll_no:" + s.Roll_no);
           System.out.println("Phonenumber:" + s.Phonenumber);
    }
    
     void Student2(){
         Student s = new Student();
         s.Name = "Jay";
         s.Adress = " Cagayan";
         s.Roll_no = 2;
         s.Phonenumber = 2227283;
         System.out.println("Name:" + s.Name);
          System.out.println("Adress:" + s.Adress);
          System.out.println("Roll_no:" + s.Roll_no);
           System.out.println("Phonenumber:" + s.Phonenumber);
    
     }
}
    class main{
        public static void main (String[]args){
            Student s = new Student();
            
            s.Student1();
            s.Student2();
        }
    }