package pl.javastart.task;

public interface Overclockable {
    int MAX_TEMP = 90;
    int CLOCKING_DIVIDER = 100;

    void overclock(int increaseClocking);
}
