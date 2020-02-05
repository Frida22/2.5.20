package SerwisDTO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJavaObjectToJson {
    public static void main(String[] args) {

        Users users = new Users("Bond", 5);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(users);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
