public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int gumption;
    private int powerLusting;

    public Slytherin(String name, int spelling, int transgression, int cunning, int determination, int ambition, int gumption, int powerLusting) {
        super(name, spelling, transgression);
        checkAndSetDefaultInputValue(cunning, determination, ambition, gumption, powerLusting);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.gumption = gumption;
        this.powerLusting = powerLusting;
    }

    public String toString() {
        return "Слизерин : " + super.toString() +
                " cunning - " + cunning +
                " determination - " + determination +
                " ambition - " + ambition
                + " gumption - " + gumption +
                " powerLusting - " + powerLusting;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (checkInputQualityValue(cunning)) {
            this.cunning = cunning;
        }
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (checkInputQualityValue(determination)) {
            this.determination = determination;
        }
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (checkInputQualityValue(ambition)) {
            this.ambition = ambition;
        }
    }

    public int getGumption() {
        return gumption;
    }

    public void setGumption(int gumption) {
        if (checkInputQualityValue(gumption)) {
            this.gumption = gumption;
        }
    }

    public int getPowerLusting() {
        return powerLusting;
    }

    public void setPowerLusting(int powerLusting) {
        if (checkInputQualityValue(powerLusting)) {
            this.powerLusting = powerLusting;
        }
    }

    public int compareSlytherinsStudents(Slytherin compareStudent) {
        int studentMagicQualities = sumMagicQualities(cunning, determination, ambition, gumption, powerLusting);
        int compareStudentMagicQualities = sumMagicQualities(compareStudent.getCunning(), compareStudent.getDetermination(),
                compareStudent.getAmbition(), compareStudent.getGumption(), compareStudent.getPowerLusting());
        String faculty = " лучший Слизеринец, чем ";
        return compareMagicQualities(this.getName(), studentMagicQualities, compareStudent.getName(), compareStudentMagicQualities, faculty);
    }

}
