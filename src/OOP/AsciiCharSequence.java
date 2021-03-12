package OOP;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{
    private byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] subBytes = new byte[length];
        for (int i = 0, j=start; i < length; i++, j++) {
                subBytes[i] = bytes[j];
            }

        return new AsciiCharSequence(subBytes);
    }

    @Override
    public String toString() {
        return new String(bytes);
    }
}
