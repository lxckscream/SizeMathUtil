package main.screamoov;

public enum Sizes {
    BIT(1L),
    BITE(8L),
    KB(1024L*8),
    MB(1024L*1024*8),
    GB(1024L*1024*1024*8),
    TB(1024L*1024*1024*1024*8),
    PB(1024L*1024*1024*1024*1024*8);

    private final long bits;

    Sizes(long bits) {this.bits = bits;}

    public long getBits() {
        return bits;
    }
}
