package Example.Models;

import java.util.Date;
import java.util.List;

public class Receipt {
    private String terminalNum;
    private String sellerName;
    private Date date;
    private List<Item> item;
    private Double price;
    private Double remains;
    private Double cash;

    public Receipt(String terminalNum, String sellerName, Date date, List<Item> item, Double price,Double cash, Double remains) {
        this.terminalNum = terminalNum;
        this.sellerName = sellerName;
        this.date = date;
        this.item = item;
        this.price = price;
        this.remains = remains;
        this.cash = cash;
    }

    public String getTerminalNum() {
        return terminalNum;
    }

    public void setTerminalNum(String terminalNum) {
        this.terminalNum = terminalNum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRemains() {
        return remains;
    }

    public void setRemains(Double remains) {
        this.remains = remains;
    }

    @Override
    public String toString() {
        return terminalNum + "\n"+ sellerName + "\n" + date + "\n" +
                "------------------------------------------"+ "\n" +
                item + "\n" +
                "------------------------------------------"+ "\n" +
                "К оплате: " + price + "\n" +
                "Наличными: " + cash + "\n" +
                "Сдача: "     + remains + "\n" +
                "Спасибо за покупку!" + "\n" +
                "------------------------------------------" + "\n";


    }
}
