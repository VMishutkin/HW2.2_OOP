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
        checkAndSetDefaultInputValue(wisdom);
        this.wisdom = wisdom;
    }


    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        checkAndSetDefaultInputValue(wise);
        this.wise = wise;
    }


    public int getCreativity() {
        return creativity;
    }


        public void setCreativity ( int creativity){
            checkAndSetDefaultInputValue(creativity);
            this.creativity = creativity;
        }


        public int compareRavenclawsStudents (Ravenclaw anotherStudent){
            int studentMagicQualities = sumQualities(wisdom, wise, creativity);
            int compareStudentMagicQualities = sumQualities(anotherStudent.getWisdom(), anotherStudent.getWise(), anotherStudent.getCreativity());
            String faculty = " лучший Когтеврановец, чем ";
            return compareQualities(this.getName(), studentMagicQualities, anotherStudent.getName(), compareStudentMagicQualities, faculty);
        }
    }
