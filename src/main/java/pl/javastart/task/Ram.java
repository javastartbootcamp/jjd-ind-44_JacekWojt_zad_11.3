package pl.javastart.task;

public class Ram extends Component implements Overclockable {
    private int size;
    private int clocking;
    private int temp;

    public Ram(String producer, String modelName, String serialNo, int size, int clocking, int temp) {
        super(producer, modelName, serialNo);
        if (temp < 0) {
            throw new IllegalArgumentException("Temperatura pamięci ram nie może być poniżej 0 stopni.");
        }
        this.size = size;
        this.clocking = clocking;
        this.temp = temp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getClocking() {
        return clocking;
    }

    public void setClocking(int clocking) {
        this.clocking = clocking;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public void overclock(int increaseClocking) {
        if (temp + (increaseClocking / 100) * 15 <= MAX_TEMP) {
            clocking += increaseClocking;
            temp += (increaseClocking / 100) * 15;
            System.out.println("Taktowanie pamięci ram zostało zwiększone o " + increaseClocking);
        } else {
            throw new OverheatingTemperatureException("Podkręcenie pamięci ram niemożliwe z powodu przekroczenia maksymalnej temperatury.");
        }
    }
}
