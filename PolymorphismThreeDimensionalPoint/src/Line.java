class Line implements Measurable {
    private double length;


    public Line(double length) {
        this.length = length;
    }


    @Override
    public double getLength() {
        return length;
    }
}