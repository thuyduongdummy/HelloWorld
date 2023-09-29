package OCA_SE8.Test5.Sellable;

interface Sellable {
    double getPrice();

    default String symbol() {
        return "$";
    }
}
