

class ClockDisplay {
    private CounterDisplay hours;
        private CounterDisplay minutes;
    // Set hours and minutes of clock
        public ClockDisplay(int pHours, int pMinutes) {
            hours = new CounterDisplay(24);
            hours.setValue(pHours);
            minutes = new CounterDisplay(60);
            minutes.setValue(pMinutes);
    }
// Set time
        public void setTime(int pHours, int pMinutes) {
            hours.setValue(pHours);
            minutes.setValue(pMinutes);
    }
        public void tick() {
            minutes.increment();
            if(minutes.getValue()==0) {
                hours.increment();
        }
    }
// Display time in two digits for hours and minutes
        public String getDisplayValue() {
            String time_str;
            if(hours.getValue()<12 && minutes.getValue()<10)

        time_str="0"+hours.getValue()+":0"+minutes.getValue();
            if(hours.getValue()<12)

        time_str="0"+hours.getValue()+":"+minutes.getValue();
            else if(minutes.getValue()<10)

        time_str=hours.getValue()+":0"+minutes.getValue();
            else
                time_str=hours.getValue()+":"+minutes.getValue();
            return time_str;
    }
}

