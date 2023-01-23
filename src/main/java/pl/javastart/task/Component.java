package pl.javastart.task;

public abstract class Component {
    private String producer;
    private String modelName;
    private String serialNo;

    public Component(String producer, String modelName, String serialNo) {
        this.producer = producer;
        this.modelName = modelName;
        this.serialNo = serialNo;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
}
