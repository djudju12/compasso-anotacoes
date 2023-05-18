public class Microscope extends LabEquipament {
    private int magnification;
    private static final double MIN_MAG = 1;

    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        this.magnification = magnification;
    }

    public int getMagnification() {
        return magnification;
    }

    public void setMagnification(int magnification) {
        if (magnification < MIN_MAG)
            throw new IllegalArgumentException("Magnification must be greater or equal to " + MIN_MAG);
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }
}
