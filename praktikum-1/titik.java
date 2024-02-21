class titik {
    double absis;
    double ordinat;
    static int counterTitik;

    titik() {
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }

    titik(double x, double y){
        counterTitik++;
        absis = x;
        ordinat = y;
    }

    void setAbsis(double a) {
        absis = a;
    }

    void setOrdinat(double o) {
        ordinat = o;
    }

    double getOrdinat() {
        return ordinat;
    }
    double getAbsis(){
        return absis;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

}