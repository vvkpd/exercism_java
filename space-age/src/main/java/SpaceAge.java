class SpaceAge {

    private final double seconds;
    private final double periodicSecond;

    private enum Age {
        Mercury(0.2408467d), Mars(1.8808158d),
        Venus(0.61519726d), Jupiter(11.862615d),
        Saturn(29.447498d), Uranus(84.016846d),
        Neptune(164.79132d);

        private double period;

        Age(double period) {
            this.period = period;
        }
    }

    SpaceAge(double seconds) {
        this.seconds = seconds;
        this.periodicSecond = 31557600;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return getSeconds() / periodicSecond;
    }

    double onMercury() {
        return getSeconds() / (periodicSecond * Age.Mercury.period);
    }

    double onVenus() {
        return getSeconds() / (periodicSecond * Age.Venus.period);
    }

    double onMars() {
        return getSeconds() / (periodicSecond * Age.Mars.period);
    }

    double onJupiter() {
        return getSeconds() / (periodicSecond * Age.Jupiter.period);
    }

    double onSaturn() {
        return getSeconds() / (periodicSecond * Age.Saturn.period);
    }

    double onUranus() {
        return getSeconds() / (periodicSecond * Age.Uranus.period);
    }

    double onNeptune() {
        return getSeconds() / (periodicSecond * Age.Neptune.period);
    }

}
