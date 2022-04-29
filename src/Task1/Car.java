package Task1;

public class Car {
    String model;
    double volume;
    int createdDate;
    int numberOfDoors;

    public Car() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setCreatedDate(int createdDate) {
        this.createdDate = createdDate;
    }

    public int getCreatedDate() {
        return createdDate;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    public void getInfoCar() {
        System.out.println("Модель авто: " + model + "; \nОбъём двигателя: " + volume + "; \nГод выпуска: " + createdDate + "; \nЧисло дверей: " + numberOfDoors);
    }
}
