public class Main{
    public static void main(String[] args) {

        StudentGrade a = new StudentGrade("Aman",88,84);

        System.out.println("English marks - " + a.getEnglishMarks());
        System.out.println("Math marks - " + a.getMathMarks());
        System.out.println("Average - " + a.getAverageMarks());
    }
}