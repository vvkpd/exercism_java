class Darts {

    private final double x;
    private final double y;

    Darts(double x, double y) {

        this.x = x;
        this.y = y;
    }

    int score() {
        double hypotenuse = Math.sqrt(x * x + y * y);
        if (hypotenuse <= 1)
            return 10;
        if (hypotenuse <= 5)
            return 5;
        if (hypotenuse <= 10)
            return 1;
        else return 0;

    }

}
