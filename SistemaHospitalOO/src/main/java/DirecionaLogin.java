import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DirecionaLogin {

    // Método para verificar se o login está cadastrado no JSON
    public static boolean verificaLogin(String username, String password) {
        JSONParser parser = new JSONParser();

        try {
            // Carrega o arquivo JSON
            JSONArray loginsArray = (JSONArray) parser.parse(new FileReader("logins.json"));

            // Percorre a lista de logins
            for (Object loginObj : loginsArray) {
                JSONObject loginData = (JSONObject) loginObj;
                
                String usuario = (String) loginData.get("user");
                String senha = (String) loginData.get("senha");

                // Verifica se o usuário e senha digitados correspondem
                if (usuario.equals(username) && senha.equals(password)) {
                    return true; // Login bem-sucedido
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        
        return false; // Login falhou
    }


}

