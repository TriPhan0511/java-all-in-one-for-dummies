package book_02_programming_basics.chapter03workingwithnumbersandexpressions.part08formattingnumbers;

import java.text.NumberFormat;

public class FormattingNumbersSample {
    public static void main(String[] args) {
        double salesTax = 2.425;

        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println(cf.format(salesTax)); // $2.42

        double x = 199923.3288;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);
        System.out.println(nf.format(x)); // 199,923.329

        double grade = .92;
        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println(pf.format(grade)); // 92%


    }
}
