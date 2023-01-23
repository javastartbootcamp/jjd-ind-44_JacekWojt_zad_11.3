package pl.javastart.task;

public class HardDrive extends Component {
    private int size;

    public HardDrive(String producer, String modelName, String serialNo, int size) {
        super(producer, modelName, serialNo);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
