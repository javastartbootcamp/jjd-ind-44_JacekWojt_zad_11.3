package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Processor cpu = new Processor("Intel", "i5", "IN123", 2200, 50);
            Ram ram = new Ram("Kingston", "DDR5", "KN123", 32, 1800, 60);
            HardDrive hard = new HardDrive("Samsung", "EVO", "SM123", 512);
            Computer comp1 = new Computer(cpu, ram, hard);
            comp1.showInfo();
            comp1.getProcessor().overclock(200);
            comp1.showInfo();
            comp1.getRam().overclock(200);
            comp1.showInfo();
        } catch (OverheatingTemperatureException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
