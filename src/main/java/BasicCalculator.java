public class BasicCalculator implements ICalculator{

    private String calculatorModel;
    private String version;

    public BasicCalculator(String calculatorModel, String version) {
        this.calculatorModel = calculatorModel;
        this.version = version;
    }

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int exponentiation(int base, int exponent) {
        throw new UnsupportedOperationException("This operation can't be made by this phone.");
    }

    @Override
    public String about() {
        return ". BasicCalculator" +
                " Model: " + calculatorModel +
                ", version:" + version;
    }
}
