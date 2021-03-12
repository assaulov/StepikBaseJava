package OOP;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        int result;
        long template;
        template = Double.doubleToLongBits(re);
        result= (int) (template ^ (template>>>32));
        template = Double.doubleToLongBits(im);
        result = 31* result + (int) (template ^ (template>>>32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        ComplexNumber that = (ComplexNumber) obj;

        if(Double.compare(that.re,re) !=0) return false;
        return Double.compare(that.im, im) == 0;
    }
}