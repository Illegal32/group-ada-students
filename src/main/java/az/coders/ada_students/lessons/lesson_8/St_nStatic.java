package az.coders.ada_students.lessons.lesson_8;

public class St_nStatic {
    public static void main(String[] args) {
        examp1();
        St_nStatic newObj = new St_nStatic();
        newObj.examp2();
    }
    public static void examp1(){
        System.out.println("Static method");
    }


    public void examp2(){
        System.out.println("Non-Static method");
        examp1();
    }
}
