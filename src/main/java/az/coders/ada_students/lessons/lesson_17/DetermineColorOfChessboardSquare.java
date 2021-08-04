package az.coders.ada_students.lessons.lesson_17;

class Solution_new2 {
    public boolean squareIsWhite(String coordinates) {
        char alp = coordinates.charAt(0);
        char num = coordinates.charAt(1);

        String evenLetter = "bdfh";
        String oddLetter = "aceg";
        String evenNumbers = "2468";
        String oddNumbers = "1357";

        return evenLetter.contains(alp + "") && oddNumbers.contains(num + "");
//        else if(coordinates.contains(evenLetter) && coordinates.contains(evenNumbers) ||
//                coordinates.contains(oddLetter) && coordinates.contains(oddNumbers)) return true;

    }
}

public class DetermineColorOfChessboardSquare {
    public static void main(String[] args) {
        Solution_new2 solutionNew2 = new Solution_new2();
        String coordinates = "c6";
        System.out.println(solutionNew2.squareIsWhite(coordinates));
    }
}