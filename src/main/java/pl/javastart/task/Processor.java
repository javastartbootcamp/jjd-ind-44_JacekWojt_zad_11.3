package pl.javastart.task;

public class Processor extends Component implements Overclockable {
    private int clocking;
    private int temp;

    public Processor(String producer, String modelName, String serialNo, int clocking, int temp) {
        super(producer, modelName, serialNo);
        if (temp < 0) {
            throw new IllegalArgumentException("Temperatura procesora nie może być poniżej 0 stopni.");
        }
        this.clocking = clocking;
        this.temp = temp;
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
        if (temp + (increaseClocking / 10) <= MAX_TEMP) {
            clocking += increaseClocking;
            temp += increaseClocking / 10;
            System.out.println("Taktowanie procesora zostało zwiększone o " + increaseClocking);
        } else {
            throw new OverheatingTemperatureException("Podkręcenie procesora niemożliwe z powodu przekroczenia maksymalnej temperatury.");
        }
    }
}
