package az.coders.ada_students.lessons.lesson_6;

public class Assignment3_syl {
    public static void main(String[] args) {
        int c = 1;
        for(int i = 1; i <= 50; i++){
            if(c % 10 == 0) System.out.println();
            c++;
            System.out.printf("%-6d", (3*i*i - i)/2);
        }

    }
}