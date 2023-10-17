public class Grade {
    private int numGrade;
    private char letterGrade;

    public Grade(int initNumGrade) {
        numGrade = initNumGrade;
        if (numGrade >= 65) {
            letterGrade = 'S';
        }
        else {
            letterGrade = 'U';
        }
    }

    public int getNumGrade() {
        return numGrade;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char newLetterGrade) {
        letterGrade = newLetterGrade;
    }

    public String toString() {
        return "Score: " + numGrade + ", Letter Grade: " + letterGrade;
    }

    public boolean isSatisfactory() {
        return letterGrade == 'S';
    }

    public boolean equals(Grade other) {
        return letterGrade == other.letterGrade;
    }
}
