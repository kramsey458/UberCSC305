public class Rating {

    double totalStars;
    double totalRates;

    public Rating(int stars, int rates) {
        this.totalStars = stars;
        this.totalRates = rates;
    }

    public double calculateRating(){
        return totalStars/totalRates;
    }

    public double getTotalStars() {
        return totalStars;
    }

    public void setTotalStars(double totalStars) {
        this.totalStars = totalStars;
    }

    public double getTotalRates() {
        return totalRates;
    }

    public void setTotalRates(double totalRates) {
        this.totalRates = totalRates;
    }
}