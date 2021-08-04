package az.coders.ada_students.lessons.lesson_9.Recursion;

public class CountABCRec {
    public static void main(String[] args) {
        System.out.println(countAbc("abaxxaba"));
    }
    public static int countAbc(String str) {
        if(str.length() <= 2)
            return 0;
         int count = 0;
        if(str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")){
            count++;
            return count + countAbc(str.substring(2));}
        return countAbc(str.substring(1));
    }
}
