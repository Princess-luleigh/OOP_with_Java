
// Driver class
class clockImp {

    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay(5, 30);
        clockDisplay.tick();

        System.out.println(clockDisplay.getDisplayValue());
                  CounterDisplay counterDisplay = new CounterDisplay(3);
                  clockDisplay.tick();
                  clockDisplay.tick();

        System.out.println(counterDisplay.getDisplayValue());
                  clockDisplay.tick();
        System.out.println("00");
                  clockDisplay.tick();
    }
}