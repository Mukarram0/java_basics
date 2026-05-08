package week12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
class Excp extends Exception {
    public Excp(String msg) {
        super(msg);
    }
}
class HttpConnect implements AutoCloseable {
    private final HttpURLConnection connection;

    public HttpConnect(URL url) throws IOException {
        this.connection = (HttpURLConnection) url.openConnection();
    }

    public HttpURLConnection getConnection() {
        return connection;
    }

    @Override
    public void close() {
        if (connection != null) {
            connection.disconnect();
        }
    }
}
public class HC {
    public static void performNetworkOperation(String urlString, boolean simulateOpException) {

        try {
            // Simulate invalid URL
            if (urlString.contains("invalid")) {
                throw new Excp("Could not connect to the URL.");
            }

            URL url = new URL(urlString);

            try (HttpConnect wrapper = new HttpConnect(url)) {
                HttpURLConnection connection = wrapper.getConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                System.out.println("Connection successful");

                // Simulate runtime error
                if (simulateOpException) {
                    throw new Excp("An error occurred during the network operation.");
                }
            }

        } catch (Excp e) {
            System.out.println("Exception: NetworkConnectionException - " + e.getMessage());

        } catch (IOException e) {
            // Optional fallback (not required)
            System.out.println("Exception: IOException - " + e.getMessage());

        } finally {
            System.out.println("Connection closed");
        }
    }
    public static void main(String[] args) {

        System.out.println("Test Case 1:");
        performNetworkOperation("http://example.com", false);

        System.out.println("\nTest Case 2:");
        performNetworkOperation("http://invalid-url", false);

        System.out.println("\nTest Case 3:");
        performNetworkOperation("http://example.com", true);
    }
}