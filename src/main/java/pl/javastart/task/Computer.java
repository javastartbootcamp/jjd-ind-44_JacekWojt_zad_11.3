package pl.javastart.task;

public class Computer {
    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;

    public Computer(Processor processor, Ram ram, HardDrive hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    void showInfo() {
        System.out.println("CPU\n" + "Producent " + processor.getProducer() + "; Model " + processor.getModelName()
                + "; Numer seryjny " + processor.getSerialNo() + "; Taktowanie " + processor.getClocking() + "; Temperatura " + processor.getTemp()
                + "\nRAM\n" + "Producent " + ram.getProducer() + "; Model " + ram.getModelName() + "; Numer seryjny "
                + ram.getSerialNo() + "; Rozmiar " + ram.getSize() + "; Takowanie " + ram.getClocking() + "; Temperatura " + ram.getTemp());
    }
}
