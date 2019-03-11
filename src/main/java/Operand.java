import org.apache.log4j.Logger;

public class Operand {
    final static Logger logger = Logger.getLogger(Operand.class);

    private Boolean value;

    public Operand(String value) {
        if (value.equals("NULL")) this.value = null;
        else if (value == null) this.value = null;
        else this.value = Boolean.valueOf(value);

        logger.info("Створено операнд зі значенням " + this.value);
    }

    Boolean value() {
        return value;
    }

    void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == null) {
            return "NULL";
        } else {
            return value.toString();
        }
    }
}
