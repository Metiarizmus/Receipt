import Example.Models.Item;
import Example.Models.Receipt;
import Example.Parser.CsvParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Double cash = scanner.nextDouble();

        builderReceipt(cash);

    }

    public static void builderReceipt(Double cash) throws IOException {
        CsvParser parser = new CsvParser();
        List<Item> list = new LinkedList<>();
        list.addAll(parser.getReadData("D:/Output.txt"));

        Double generalPrice = 0.0;
        Double remains = 0.0;
        for (Item q : list) {
            generalPrice+=q.getPrice()* q.getQuantity();
        }

        remains=cash-generalPrice;
        if(remains > 0 ) {
            Receipt receipt = new Receipt("Терминал №2","Божидамова Наталья",new Date(),list,generalPrice,cash,remains);
            System.out.println(receipt);
        }else {
            System.out.println("Недостаточно средств");
        }




    }

}
