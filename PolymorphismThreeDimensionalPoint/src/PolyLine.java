class PolyLine implements Measurable {
    private double length;


    public PolyLine(double length) {
        this.length = length;
    }


    @Override
    public double getLength() {
        return length;
    }
}