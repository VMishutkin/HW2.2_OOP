public class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int wise;
    private int creativity;

    public String toString() {
        return "Когтевран : " + super.toString() +
                " wisdom - " + wisdom +
                " wise - " + wise +
                " creativity - " + creativity;
    }

    public Ravenclaw(String name, int spelling, int transgression, int wisdom, int wise, int creativity) {
        super(name, spelling, transgression);
        checkAndSetDefaultInputValue(wisdom, wise, creativity);
        this.wisdom = wisdom;
        this.wise = wise;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (checkInputQualityValue(wisdom)) {
            this.wisdom = wisdom;
        }
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (checkInputQualityValue(wise)) {
            this.wise = wise;
        }
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (checkInputQualityValue(creativity)) {
            this.creativity = creativity;
        }
    }


    public int compareRavenclawsStudents(Ravenclaw compareStudent) {
        int studentMagicQualities = sumMagicQualities(wisdom, wise, creativity);
        int compareStudentMagicQualities = sumMagicQualities(compareStudent.getWisdom(), compareStudent.getWise(), compareStudent.getCreativity());
        String faculty = " лучший Когтеврановец, чем ";
        return compareMagicQualities(this.getName(), studentMagicQualities, compareStudent.getName(), compareStudentMagicQualities, faculty);
    }
}
