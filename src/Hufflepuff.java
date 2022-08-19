public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int spelling, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, spelling, transgression);
        checkAndSetDefaultInputValue(industriousness, loyalty, honesty);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String toString() {
        return "Пуффендуй : " + super.toString() +
                " honesty - " + honesty +
                " industriousness - " + industriousness +
                " loyalty - " + loyalty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        checkAndSetDefaultInputValue(industriousness);
        this.industriousness = industriousness;
    }


    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        checkAndSetDefaultInputValue(loyalty);
        this.loyalty = loyalty;
    }


    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        checkAndSetDefaultInputValue(honesty);
        this.honesty = honesty;
    }


    public int compareHufflepuffsStudents(Hufflepuff anotherStudent) {
        int studentMagicQualities = sumQualities(honesty, loyalty, industriousness);
        int compareStudentMagicQualities = sumQualities(anotherStudent.getHonesty(), anotherStudent.getLoyalty(), anotherStudent.getIndustriousness());
        String faculty = " лучший Пуффендуец, чем ";
        return compareQualities(this.getName(), studentMagicQualities, anotherStudent.getName(), compareStudentMagicQualities, faculty);
    }


}
