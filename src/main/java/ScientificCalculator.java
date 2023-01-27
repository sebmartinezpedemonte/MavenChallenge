public class ScientificCalculator implements ICalculator {

    private String calculatorModel;
    private String version;

    public ScientificCalculator(String calculatorModel, String version) {
        this.calculatorModel = calculatorModel;
        this.version = version;
    }

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int exponentiation(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    @Override
    public String about() {
        return ". Scientific Calculator" +
                " calculator Model: " + calculatorModel +
                ", version:" + version;
    }
}
