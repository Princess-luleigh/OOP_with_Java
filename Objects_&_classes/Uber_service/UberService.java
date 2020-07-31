package OBJECTS;

public class UberService {

    private String name;

    private int costPerMinute;

    private int costPerKilometer;

    private int baseFare;

    private int cancellationFee;

    public UberService() {

    }

    public void setDetails(String name, int i, int j, int k, int l) {

        this.name = name;

        this.costPerMinute = i;

        this.costPerKilometer = j;

        this.baseFare = k;

        this.cancellationFee = l;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getCostPerMinute() {

        return costPerMinute;

    }

    public void setCostPerMinute(int costPerMinute) {

        this.costPerMinute = costPerMinute;

    }

    public int getCostPerKilometre() {

        return costPerKilometer;

    }

    public void setCostPerKilometre(int costPerKilometer) {

        this.costPerKilometer = costPerKilometer;

    }

    public int getBaseFare() {

        return baseFare;

    }

    public void setBaseFare(int baseFare) {

        this.baseFare = baseFare;

    }

    public int getCancellationFee() {

        return cancellationFee;

    }

    public void setCancellationFee(int cancellationFee) {

        this.cancellationFee = cancellationFee;

    }

    public double calculateFare(double minutes, double distance){

        double totalCost = getBaseFare() + getCostPerMinute() * minutes + getCostPerKilometre() * distance;

        return totalCost;

    }

}

