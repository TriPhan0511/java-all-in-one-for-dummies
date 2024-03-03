package book02.chapter03workingwithnumbersandexpressions.part09recognizingweirdthingsaboutjavamath;

import java.text.NumberFormat;

public class Sample02FloatingpointWeirdness {
    public static void main(String[] args) {
        float x = 0.1f;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(x)); // 0.1000000015
    }
}

/*
NOTE:
Floating-point numbers have problems of their own. For starters, floating-point
numbers are stored using the binary number system (base 2), but humans work
with numbers in the decimal number system (base 10). Unfortunately, accurately
converting numbers between these two systems is sometimes impossible. That’s
because in any number base, certain fractions can’t be represented exactly. One
example: Base 10 has no way to exactly represent the fraction 1/3. You can approximate
it as 0.3333333, but eventually you reach the limit of how many digits you
can store, so you have to stop. In base 2, it happens that one of the fractions you
can’t accurately represent is the decimal value 1/10. In other words, a float or
double variable can’t accurately represent 0.1.

Don’t believe me? Try running this code:

    float x = 0.1f;
    NumberFormat nf = NumberFormat.getNumberInstance();
    nf.setMinimumFractionDigits(10);
    System.out.println(nf.format(x)); // 0.1000000015

The resulting output is this:
    0.1000000015
Although 0.1000000015 is close to 0.1, it isn’t exact.

In most cases, Java’s floating-point math is close enough not to matter. The margin
of error is extremely small. If you’re using Java to measure the size of your
house, you’d need an electron microscope to notice the error. If you’re writing
applications that deal with financial transactions, however, normal rounding can
sometimes magnify the errors to make them significant. You may charge a penny
too much or too little sales tax. And in extreme cases, your invoices may actually
have obvious addition errors. For these reasons, Java has a class called BigDecimal
that can handle floating-point numbers with perfect accuracy. 

Integer types are stored in binary too, of course. But integers aren’t subject to
the same errors that floating-point types are — because integers don’t represent
fractions at all — so you don’t have to worry about this type of error for integer
types.
*/