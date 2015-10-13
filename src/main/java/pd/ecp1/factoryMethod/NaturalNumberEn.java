package pd.ecp1.factoryMethod;

public class NaturalNumberEn extends NaturalNumber {

    private static final String[] textValue = {"zero", "one", "two", "three", "four", "five"};

    public NaturalNumberEn(int value) {
        super(value);
        this.setTextValue(textValue);
    }
}
