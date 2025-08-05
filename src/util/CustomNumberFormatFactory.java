package util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class CustomNumberFormatFactory {
    private static final NumberFormatter DECIMAL_FORMATTER;
    private static final NumberFormatter INTEGER_FORMATTER;
    
    static {
        DecimalFormat desDecimalFormat = new DecimalFormat("#0.00");
        DECIMAL_FORMATTER = new NumberFormatter(desDecimalFormat);
        DECIMAL_FORMATTER.setValueClass(Double.class);
        DECIMAL_FORMATTER.setAllowsInvalid(false);
        DECIMAL_FORMATTER.setMinimum(0.0);
    }
    
    static {
        NumberFormat integerFormat = NumberFormat.getIntegerInstance();
        integerFormat.setGroupingUsed(false);
        INTEGER_FORMATTER = new NumberFormatter(integerFormat);
        INTEGER_FORMATTER.setValueClass(Double.class);
        INTEGER_FORMATTER.setAllowsInvalid(false);
        INTEGER_FORMATTER.setMinimum(0.0);
    }
    
    private static JFormattedTextField createDecimalField() {
        JFormattedTextField field = new JFormattedTextField();
        applyDecimalFormat(field);
        return field;
    }

    public static void applyDecimalFormat(JFormattedTextField field) {
        field.setFormatterFactory(new DefaultFormatterFactory(DECIMAL_FORMATTER));
    }
    
    private static JFormattedTextField createIntegerField() {
        JFormattedTextField field = new JFormattedTextField();
        applyIntegerFormat(field);
        return field;
    }

    public static void applyIntegerFormat(JFormattedTextField field) {
        field.setFormatterFactory(new DefaultFormatterFactory(INTEGER_FORMATTER));
    }
}
