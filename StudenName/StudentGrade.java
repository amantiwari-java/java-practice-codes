public class StudentGrade{

    private String name;
    private int mathMarks ;
    private int englishMarks;




    public StudentGrade(String name, int mathMarks, int englishMarks) {
        this.name = name;
        setMathMarks(mathMarks);
        setEnglishMarks(englishMarks);

    }

    public double getAverageMarks( ){
        double average = (mathMarks + englishMarks) / 2.0 ;
        return average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {

        if(mathMarks > 100 || mathMarks < 0){
            mathMarks = 0;
        }else{
        this.mathMarks = mathMarks;}
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {

        if(englishMarks > 100 || englishMarks < 0){
            englishMarks = 0;
        }else{
            this.englishMarks = englishMarks;}

    }
}