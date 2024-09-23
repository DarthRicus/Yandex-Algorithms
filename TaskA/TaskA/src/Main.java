import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // �������� ������ � ����
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        // ������ ������ �� ������, � Person, � �������� ��� ���� int numberOfTree, int distance
        Person vasya = parseStringToInt(s1);
        Person masha = parseStringToInt(s2);
        // ����������, ��� ������ ����� ������
        if(vasya.numberOfTree > masha.numberOfTree){
            System.out.println(numberOfPaintedTrees(vasya,masha));
        }else{
            System.out.println(numberOfPaintedTrees(masha,vasya));
        }
    }
    static class Person{
        int numberOfTree;
        int distance;

        public Person(int numberOfTree, int distance) {
            this.numberOfTree = numberOfTree;
            this.distance = distance;
        }
    }
    public static  Person parseStringToInt(String stringToParse){
        String[] parts= stringToParse.split(" ");
        int numberOfTree = Integer.parseInt(parts[0]);
        int distance = Integer.parseInt(parts[1]);
        return new Person(numberOfTree, distance);
    }
    public static int numberOfPaintedTrees(Person person1, Person person2){
        // ��� �������� ������ ���� ������� ���������� � �������� ������� ���� �������� ��� ����� �����
        int maxTreePerson1 = person1.numberOfTree + person1.distance;
        int minTreePerson1 = person1.numberOfTree - person1.distance;
        int maxTreePerson2 = person2.numberOfTree + person2.distance;
        int minTreePerson2 = person2.numberOfTree - person2.distance;
        // ��������� ������ ������, ����� ������� ������ �������� ��������� ������ � ������� ������� ��������
        if(maxTreePerson2 <= maxTreePerson1 && minTreePerson2 >= minTreePerson1 ){
            return person1.distance * 2 + 1;
        } else if (maxTreePerson1 <= maxTreePerson2 && minTreePerson1 >= minTreePerson2) {
            return person2.distance * 2 + 1;
        }
        // ������� ���������� ����������� ���������
        if(minTreePerson1 <= maxTreePerson2){
            return (person1.distance + person2.distance + 1) * 2 - Math.abs(maxTreePerson2 - minTreePerson1 + 1);
        } else{
            return (person1.distance + person2.distance + 1) * 2;
        }
    }

}
