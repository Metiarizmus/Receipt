package Example.Parser;

import Example.Models.Item;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CsvParser {

    public List<Item> getReadData(String path) throws IOException {
        List<Item> list = new LinkedList<>();

        FileReader reader = null;

        try {
            reader = new FileReader(path);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNext()){
                String value = scanner.next();
                String[] split = value.split(",");

                if (split.length == 3){
                    Item items = new Item(split[0],Double.parseDouble(split[1]),Integer.parseInt(split[2]));
                    list.add(items);
                }

            }

        }catch (IOException e){

        }finally {
            reader.close();
        }

        return list;
    }

}
