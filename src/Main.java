public class Main {
    public static void main(String[] args) {

        System.out.println(randomizeValue());
        int[] values = randomazeArray(5);
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер",values[0],values[1],values[2],values[3],values[4]);
        values = randomazeArray(5);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",values[0],values[1],values[2],values[3],values[4]);
        values = randomazeArray(5);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли",values[0],values[1],values[2],values[3],values[4]);
        values = randomazeArray(7);
        Slytherin DracoMalfoy = new Slytherin("Драко Малфой",values[0],values[1],values[2],values[3],values[4], values[5],values[6]);
        values = randomazeArray(7);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю",values[0],values[1],values[2],values[3],values[4], values[5],values[6]);
        values = randomazeArray(7);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",values[0],values[1],values[2],values[3],values[4], values[5],values[6]);
        values = randomazeArray(5);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",values[0],values[1],values[2],values[3],values[4]);
        values = randomazeArray(5);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",values[0],values[1],values[2],values[3],values[4]);
        values = randomazeArray(5);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли",values[0],values[1],values[2],values[3],values[4]);
        values = randomazeArray(5);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг",values[0],values[1],values[2],values[3],values[4]);
        values = randomazeArray(5);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил",values[0],values[1],values[2],values[3],values[4]);
        values = randomazeArray(5);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби",values[0],values[1],values[2],values[3],values[4]);

        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        justinFinchFletchley.compareHogwartsStudents(padmaPatil);
        zhouChang.compareRavenclawsStudents(marcusBelby);

    }
    public static int[] randomazeArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=randomizeValue();
        }
        return array;
    }
    public static int randomizeValue(){
        return (int)(Math.random()*100);
    }
}