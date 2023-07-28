package Construction;

public class Car {
    private String plate;

    public Car(String plate, int model) {
        this.plate = plate;
        this.model = model;
    }

    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }


}
