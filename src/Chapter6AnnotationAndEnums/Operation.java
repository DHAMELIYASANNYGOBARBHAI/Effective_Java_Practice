package Chapter6AnnotationAndEnums;

public enum Operation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    },
    Newop("*/+") {
        public double apply(double x, double y) {
            return (x * y) / (x + y);
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);


    // Do the arithmetic operation represented by this constant
//    public double apply(double x, double y) {
//        switch(this) {
//            case PLUS:   return x + y;
//            case MINUS:  return x - y;
//            case TIMES:  return x * y;
//            case DIVIDE: return x / y;
//
//        }
//        throw new AssertionError("Unknown op: " + this);
//    }


}
