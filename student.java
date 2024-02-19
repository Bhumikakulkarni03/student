import java.util.Arrays;
class student extends course{
    String name="Spandana";
    String dept="BCA";
    int sem=4;
    String getname(){
        return name;
    }
    String getdept(){
        return dept;
    }
    int getsem(){
        return sem;
    }
    public static void main(String args[]){
        student s1=new student();
        course c=new course();
        System.out.println("Name is: "+s1.getname());
        System.out.println("Department is: "+s1.getdept());
        System.out.println("Semister is: "+s1.getsem());
        String s[]=c.getCourse();
        System.out.println("Courses are: ");
        for(String j:s){
            System.out.println(j);
        }
        int m[]= c.getMarks();
        System.out.println("Courses for which marks is less than 40: ");
        for(int i:m){
            if(i<40){
                c.setMarks(i);
                System.out.println(i);

            }
        }
    }
}