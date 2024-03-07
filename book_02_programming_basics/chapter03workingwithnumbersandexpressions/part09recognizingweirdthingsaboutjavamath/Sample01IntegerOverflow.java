package book_02_programming_basics.chapter03workingwithnumbersandexpressions.part09recognizingweirdthingsaboutjavamath;

public class Sample01IntegerOverflow {
    public static void main(String[] args) {
        int a = 1000000000;
        System.out.println(a); // 1000000000
        a += 1000000000;
        System.out.println(a); // 2000000000
        a += 1000000000;
        System.out.println(a); // -1294967296
        a += 1000000000;
        System.out.println(a); // -294967296
        // Output:
        // 1000000000
        // 2000000000
        // -1294967296
        // -294967296
    }
}

/*
NOTE:
The first addition seems to work, but after that, the number becomes negative!
That’s because the value has reached the size limit of the int data type. Unfortunately,
Java doesn’t tell you that this error has happened. It simply crams the
int variable as full of bits as it can, discards whatever bits don’t fit, and hopes
that you don’t notice. Because of the way int stores negative values, large positive
values suddenly become large negative values. This effect is called wrap around.

The moral of the story is that if you’re working with large integers, you should use
long rather than int, because long can store much larger numbers than int. If
your programs deal with numbers large enough to be a problem for long, consider
using floating-point types instead. As you see in the next section, floating-point
types can handle even larger values than long, and they let you know when you
exceed their capacity.
*/