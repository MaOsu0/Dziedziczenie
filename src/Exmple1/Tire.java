package Exmple1;

public class Tire extends Part{
    private double tireSize;
    private double tireWidth;

    public Tire(int partNumber, String producerName, String modelName, int batchNumber, double tireSize, double tireWidth) {
        super(partNumber, producerName, modelName, batchNumber);
        this.tireSize = tireSize;
        this.tireWidth = tireWidth;
    }

    public double getTireSize() {
        return tireSize;
    }

    public void setTireSize(double tireSize) {
        this.tireSize = tireSize;
    }

    public double getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(double tireWidth) {
        this.tireWidth = tireWidth;
    }

}
