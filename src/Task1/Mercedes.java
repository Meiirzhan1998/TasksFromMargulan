package Task1;

public class Mercedes extends Car implements IDriver {
    public Mercedes() {
    }

    public void getInfoCar() {
        System.out.print(model + "\nОбъём двигателя: " + volume + ";\nГод выпуска: " + createdDate + ";\nЧисло дверей: " + numberOfDoors+"\n \n");
    }

    @Override
    public void drive() {
        System.out.print("Водитель водит: ");
        getInfoCar();
    }
}
