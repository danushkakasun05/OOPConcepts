package CompileTime.Polymophism;

public class CompileTimePolymophism {
    public void myMethod(){
        System.out.println("My method");

    }
    public void myMethod(int X){
        System.out.println("My method"+X);

    }
    public void myMethod(String X){
        System.out.println("My method"+X);

    }
    public void myMethod(String X,int y){
        System.out.println("My method"+X+y);}

}
