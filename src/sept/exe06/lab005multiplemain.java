package sept.exe06;

public class lab005multiplemain {
    public static void main(String[]args){
        System.out.print("hello wolrd..."); // real main function entry point of jvm
    }
    public static void main(String args){ // this are just clone and method overloading
        System.out.print("hello wolrd...");
    }
    public void main(){
        System.out.print("hello wolrd...");
    }
}
