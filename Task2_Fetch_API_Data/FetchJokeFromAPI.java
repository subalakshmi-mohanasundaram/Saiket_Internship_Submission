import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchJokeFromAPI {

    public static void main(String[] args) {

        try {
            // API URL
            URL url = new URL("https://official-joke-api.appspot.com/random_joke");

            // Open HTTP connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read API response
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            String json = response.toString();

            // Extract joke setup and punchline (simple parsing)
            String setup = json.split("\"setup\":\"")[1].split("\"")[0];
            String punchline = json.split("\"punchline\":\"")[1].split("\"")[0];

            // Display output
            System.out.println("😂 Random Joke from API 😂\n");
            System.out.println("Setup    : " + setup);
            System.out.println("Punchline: " + punchline);

        } catch (Exception e) {
            System.out.println("Error while fetching data from API.");
            e.printStackTrace();
        }
    }
}
