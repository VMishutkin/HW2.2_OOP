import java.util.stream.IntStream;

public abstract class Hogwarts {
    private int spelling;
    private int transgression;
    private String name;

    @Override
    public String toString() {
        return "name - " + name + " transgression - " + transgression + " spelling - " + spelling + " ";
    }

    public void print() {
        System.out.println(this);
    }

    public void setSpelling(int spelling) {
       checkAndSetDefaultInputValue(spelling);
            this.spelling = spelling;
    }

    public void setTransgression(int transgression) {
       checkAndSetDefaultInputValue(transgression);
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

    public Hogwarts(String name, int spelling, int transgression) {
        this.name = name;
        checkAndSetDefaultInputValue(spelling, transgression);
        this.spelling = spelling;
        this.transgression = transgression;

    }

    protected int sumQualities(int... magicQualities) {
        return IntStream.of(magicQualities).sum(); //Общий для класса и наследников метод который суммирует требуемые для проверки качества
    }

    protected int compareQualities(String firstStudentName, int firstStudentMagicQualities, String secondStudentName, int secondStudentMagicQualities, String betterString) {
        // Общий для всех метод который сравнивает двух студентов по сумме качеств и подставляет имена и строку с текстом кто лучше.
        if (firstStudentMagicQualities > secondStudentMagicQualities) {
            System.out.println(firstStudentName + betterString + secondStudentName);

        } else if (firstStudentMagicQualities == secondStudentMagicQualities) {
            System.out.printf("%s и %s имеют одинаковые качества.%n", firstStudentName, secondStudentName);
        } else {
            System.out.printf(secondStudentName + betterString + firstStudentName);
        }
        return firstStudentMagicQualities - secondStudentMagicQualities;
    }

    public int compareHogwartsStudents(Hogwarts anotherQualities) {
        //метод сравнения двух учеников хогвартса по общим качествам
        int studentMagicQualities = sumQualities(this.getSpelling(), this.transgression);
        int compareStudentMagicQualities = sumQualities(anotherQualities.getSpelling(), anotherQualities.getTransgression());
        String betterString = " обладает бОльшей мощностью магии, чем ";
        return compareQualities(this.getName(), studentMagicQualities, anotherQualities.getName(), compareStudentMagicQualities, betterString);
    }

    protected void checkAndSetDefaultInputValue(int... qualities) {
        //метод проверяет что вводимое значение характеристики находится в диапазоне от 0 до 100 и если нет то устанавливает значение по умолчанию *1*
        for (int i = 0; i < qualities.length; i++) {
            if (qualities[i] < 0) {
                qualities[i] = 0;

            } else if (qualities[i] > 100) {
                qualities[i] = 100;
            }
        }
    }



}
