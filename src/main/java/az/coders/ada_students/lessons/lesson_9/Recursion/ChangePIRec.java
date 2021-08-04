package az.coders.ada_students.lessons.lesson_9.Recursion;

public class ChangePIRec {
    public static void main(String[] args) {
        System.out.println(changePi("pipizazapizza"));
    }
    public static String changePi(String str) {
//    if(str.length() == 0) return str;
//    if(str.startsWith("pi"))
//        return 3.14 + changePi(str.substring(2));
//    return str.substring(0,1) + changePi(str.substring(1));
        if(str.contains("pi")){
            return changePi(str.replace("pi", "3.14"));
        }
        return str;
    }
}
