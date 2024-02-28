package clases;

public class InvoiceItem {
    private int Qty;
    private double unitPrice;

    public InvoiceItem(String a101, String penRed, int q, double up) {
        Qty=q;
        unitPrice=up;
    }
    public String toString(){
        return "clases.InvoiceItem[id="+getId()+", desc="+getDesc()+", qty="+ Qty + ", unitPrice=" + unitPrice+"]";
    }
    public int setQty(int Qty) {
        this.Qty=Qty;
        return Qty;
    }

    public double setUnitPrice(double unitPrice) {
        this.unitPrice=unitPrice;
        return unitPrice;
    }

    public String getId() {
        return "A101";

    }

    public String getDesc() {
        return "Pen Red";
    }

    public int getQty() {
        return Qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotal() {
        return unitPrice * Qty;
    }
}
