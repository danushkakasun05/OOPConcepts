public class Student {
    private String name;
    private String address;
    private int age;
    private int[] marks;

    public Student(String name, String address, int age, int[] marks){
        this.name=name;
        this.address=address;
        this.age=age;
        this.marks=marks;


    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
       return this.address;
    }
    public void setAddress(){
        this.address=address;
    }
    public void setMarks(int[] marks){
        this.marks=marks;
    }
    public int[] getMarks(){
        return this.marks;
    }
}
