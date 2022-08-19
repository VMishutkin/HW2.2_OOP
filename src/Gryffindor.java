public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    @Override
    public String toString() {
        return "Гриффиндор : " + super.toString() +
                " nobility - " + nobility +
                " honor - " + honor +
                " courage - " + courage;
    }

    public Gryffindor(String name, int spelling, int transgression, int nobility, int honor, int courage) {
        super(name, spelling, transgression);
        checkAndSetDefaultInputValue(nobility, honor, courage);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void setNobility(int nobility) {
        checkAndSetDefaultInputValue(nobility);
        this.nobility = nobility;
    }


    public void setHonor(int honor) {
        checkAndSetDefaultInputValue(honor);
        this.honor = honor;
    }


    public void setCourage(int courage) {
        checkAndSetDefaultInputValue(courage);
        this.courage = courage;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public int compareGryffindorQuailities(Gryffindor anotherStudent) {
        int studentMagicQualities = sumQualities(honor, courage, nobility);
        int compareStudentMagicQualities = sumQualities(anotherStudent.getCourage(), anotherStudent.getHonor(), anotherStudent.getNobility());
        String faculty = " лучший Гриффиндорец, чем ";
        return compareQualities(this.getName(), studentMagicQualities, anotherStudent.getName(), compareStudentMagicQualities, faculty);
    }

}
