public class DeliveryOrder {
    private DeliveryType deliveryType;
    private IsFragile isFragile;
    private IsCold isCold;

    public DeliveryOrder(DeliveryType deliveryType, IsFragile isFragile, IsCold isCold) {
        this.deliveryType = deliveryType;
        this.isFragile = isFragile;
        this.isCold = isCold;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "isPedestrian=" + deliveryType +
                ", isFragile=" + isFragile +
                ", isCold=" + isCold +
                '}';
    }
}
