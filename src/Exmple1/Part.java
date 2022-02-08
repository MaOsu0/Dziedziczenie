package Exmple1;

public class Part {
//    unikalny numer identyfikacyjny, przechowuje nazwę producenta, model i serię produktu
            private int partNumber;
            private String producerName;
            private String modelName;
            private int batchNumber;

    public Part(int partNumber, String producerName, String modelName, int batchNumber) {
        this.partNumber = partNumber;
        this.producerName = producerName;
        this.modelName = modelName;
        this.batchNumber = batchNumber;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }
}
