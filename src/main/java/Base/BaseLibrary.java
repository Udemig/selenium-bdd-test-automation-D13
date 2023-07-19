package Base;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class BaseLibrary  {
    public static String BaseURL="https://www.amazon.com.tr/";
    ObjectMapper objectMapper = new ObjectMapper();

    public String elementRead(String modul, String dataName){
        String element = "";
        try {
            JsonNode rootNode = objectMapper.readTree(new File("Data/Data.json"));
            JsonNode addressNode = rootNode.get(modul);
            element = addressNode.get(dataName).asText();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(element);
        return element;
    }
}
