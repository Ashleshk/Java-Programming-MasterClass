import java.util.ArrayList;

public class Combo implements BillBurguerItem {

    ArrayList<BillBurguerItem> comboItems = new ArrayList<>();
    String comboName;
    public void addItem(BillBurguerItem item) {
        comboItems.add(item);
    }

    public void removeItem(BillBurguerItem item) {
        comboItems.remove(item);
    }

    public ArrayList<BillBurguerItem> getCombo() {
        return comboItems;
    }
    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    @Override
    public double itemisedItem() {
        double subTotal = 0;
        for (BillBurguerItem item : comboItems) {
            subTotal += item.itemisedItem();
        }
        System.out.println("additional "
                + this.comboName
                + ": "
                + this.itemisedItem()
                + " subtotal: "
                + (double) Math.round(subTotal * 100)/100
        );
        return Math.round(subTotal * 100)/100;
    }
}
