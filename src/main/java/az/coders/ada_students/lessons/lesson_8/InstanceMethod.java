package az.coders.ada_students.lessons.lesson_8;

public class InstanceMethod {
    public static void main(String[] args) {
        InstanceMethod example = new InstanceMethod();
        System.out.println(example.operation1(5,8));
        System.out.println(example.operation2(3,7));
    }
int c, h;

    public int operation1(int a, int b) {
    c = a+b;
    return c;
    }
    public int operation2(int c, int d) {
        h = c*d;
        return h;
    }
}
