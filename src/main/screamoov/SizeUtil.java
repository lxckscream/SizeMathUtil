package main.screamoov;

public class SizeUtil {
    public static long getBits(Sizes size, int value) {
        return size.getBits() * value;
    }

    public static long getBits(Sizes size, long value) {
        return size.getBits() * value;
    }
}
