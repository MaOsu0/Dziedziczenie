package Exmple1;

public class ExhaustPart extends Part{
    private boolean isConform;

    public boolean isConform() {
        return isConform;
    }

    public void setConform(boolean conform) {
        isConform = conform;
    }


    public ExhaustPart(int partNumber, String producerName, String modelName, int batchNumber, boolean isConform) {
        super(partNumber, producerName, modelName, batchNumber);
        this.isConform = isConform;
    }
}
