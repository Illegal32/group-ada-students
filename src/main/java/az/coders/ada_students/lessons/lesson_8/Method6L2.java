package az.coders.ada_students.lessons.lesson_8;

public class Method6L2 {

    public static void main(String[] args) {

        Task6 ();

    }

    public static void Task6 (){
        int x;
        for (x = 1000; x<= 10000; x++){
            int x1 = x/1000;
            int x2 = x/100%10;
            int x3 = x/10%10;
            int x4 = x%10;
            if((x1 + x2) == (x3 + x4))
                System.out.println(x + " ");
        }

    }

}
