package Task1;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] myArray = new Car[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите модель авто:");
            String model = sc.next();
            System.out.println("Введите объем:");
            double volume = sc.nextDouble();
            System.out.println("Введите год выпуска:");
            int createdYear = sc.nextInt();
            System.out.println("Введите количество дверей:");
            int numberOfDoors = sc.nextInt();

            switch (model) {
                case "BMW":
                    BMW bmw = new BMW();
                    bmw.setModel(model);
                    bmw.setVolume(volume);
                    bmw.setCreatedDate(createdYear);
                    bmw.setNumberOfDoors(numberOfDoors);
                    myArray[i] = bmw;
                    break;
                case "Toyota":
                    Toyota toyota = new Toyota();
                    toyota.setModel(model);
                    toyota.setVolume(volume);
                    toyota.setCreatedDate(createdYear);
                    toyota.setNumberOfDoors(numberOfDoors);
                    myArray[i] = toyota;
                    break;
                case "Mercedes":
                    Mercedes mercedes = new Mercedes();
                    mercedes.setModel(model);
                    mercedes.setVolume(volume);
                    mercedes.setCreatedDate(createdYear);
                    mercedes.setNumberOfDoors(numberOfDoors);
                    myArray[i] = mercedes;
                    break;
            }
        }
        for (Car car : myArray) {
            System.out.println(car.getModel());
        }
    }
}