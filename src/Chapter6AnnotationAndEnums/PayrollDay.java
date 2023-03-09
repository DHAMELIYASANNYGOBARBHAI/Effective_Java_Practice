package Chapter6AnnotationAndEnums;//public enum Chapter6AnnotationAndEnums.PayrollDay {
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
//    SATURDAY, SUNDAY;
//    private static final int MINS_PER_SHIFT = 8 * 60;
//    int pay(int minutesWorked, int payRate) {
//        int basePay = minutesWorked * payRate;
//        int overtimePay;
//        switch(this) {
//            case SATURDAY: case SUNDAY: // Weekend
//                overtimePay = basePay / 2;
//                break;
//            default: // Weekday
//                overtimePay = minutesWorked <= MINS_PER_SHIFT ?
//                        0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
//        }
//        return basePay + overtimePay;
//    }
//}

public enum PayrollDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);
    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    PayrollDay() {
        this.payType = PayType.WEEKDAY;
    }  // Default

    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    // The strategy enum type
    private enum PayType {

        // hear we define our enum constant
        WEEKDAY {
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MINS_PER_SHIFT ? 0 :
                        (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate / 2;
            }
        };

        abstract int overtimePay(int mins, int payRate); // command abstarct mathod so we spicficyli define into the subconstant

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked, int payRate)  // method of enum class
        {
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }
}
