package trade.engine.orders;

public class ExchangeOrder {

    private Long clientId;
    private String product;
    private int quantity;
    private double price;
    private String side;
    private String status;
    private String exchange;

    public ExchangeOrder(Long clientId, String product, int quantity, double price, String side, String status, String exchange) {
        this.clientId = clientId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
        this.status = status;
        this.exchange = exchange;
    }

    public ExchangeOrder() {
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "ExchangeOrder{" +
                "clientId=" + clientId +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", side='" + side + '\'' +
                ", status='" + status + '\'' +
                ", exchange='" + exchange + '\'' +
                '}';
    }
}
