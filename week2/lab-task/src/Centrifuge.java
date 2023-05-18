public class Centrifuge extends LabEquipament{
    private int maxRPM;
    private static final int MIN_RPM = 500;

    public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
        super(manufacturer, model, year);
        this.maxRPM = maxRPM;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if (maxRPM < MIN_RPM)
            throw new IllegalArgumentException("RMP must be greater or equal to " + MIN_RPM);
        this.maxRPM = maxRPM;
    }

    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }
}
