import java.util.stream.IntStream;

public abstract class Hogwarts {
    private int spelling;
    private int transgression;
    private String name;

    @Override
    public String toString() {
        return  "name - " + name + " transgression - " + transgression + " spelling - " + spelling + " ";
    }

    public void setSpelling(int spelling) {
        if(checkInputQualityValue(spelling))
        this.spelling = spelling;
    }

    public void setTransgression(int transgression) {
        if(checkInputQualityValue(transgression))
        this.transgression = transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpelling() {
        return spelling;
    }

    public int getTransgression() {
        return transgression;
    }

    public String getName() {
        return name;
    }

    public Hogwarts(String name, int spelling, int transgression){
        this.name = name;
        checkAndSetDefaultInputValue(spelling,transgression);
        this.spelling=spelling;
        this.transgression=transgression;

    }
    protected int sumMagicQualities(int... magicQualities){
        return IntStream.of(magicQualities).sum();
    }

    protected int compareMagicQualities(String firstStudentName, int firstStudentMagicQualities, String secondStudentName, int secondStudentMagicQualities, String betterString){

        if (firstStudentMagicQualities>secondStudentMagicQualities){
            System.out.println(firstStudentName+betterString+secondStudentName);

        }else if (firstStudentMagicQualities==secondStudentMagicQualities){
            System.out.printf("%s и %s имеют одинаковые качества.%n", firstStudentName, secondStudentName);
        }else {
            System.out.printf(secondStudentName+betterString+firstStudentName);
        }
        return firstStudentMagicQualities-secondStudentMagicQualities;
    }

    public int compareHogwartsStudents(Hogwarts compareStudent){
        int studentMagicQualities = sumMagicQualities(this.getSpelling(), this.transgression);
        int compareStudentMagicQualities = sumMagicQualities(compareStudent.getSpelling(), compareStudent.getTransgression());
        String betterString = " обладает бОльшей мощностью магии, чем ";
        return compareMagicQualities(this.getName(), studentMagicQualities, compareStudent.getName(), compareStudentMagicQualities, betterString);
    }
    protected void checkAndSetDefaultInputValue(int... qualities) {
        for (int i = 0; i < qualities.length; i++) {
            if(qualities[i]<0 || qualities[i]>100){
                qualities[i] = 1;

            }
        }
    }
    protected boolean checkInputQualityValue(int quality) {
       if(quality<0 || quality>100) {
           System.out.println("Характеристики должны быть в диапазоне от 0 до 100");
           return false;
       }
        return true;
    }
    
}
