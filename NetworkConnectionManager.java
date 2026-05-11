package week12;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
class HttpConnectionWrapper implements AutoCloseable {
    private final HttpURLConnection connection;
    public HttpConnectionWrapper(URL url) throws IOException {
        this.connection = (HttpURLConnection) url.openConnection();
    }
    public HttpURLConnection getConnection() {
        return connection;
    }
    @Override
    public void close(){
        connection.disconnect();
    }
}
public class NetworkConnectionManager {
    public static void performNetworkOperation(String urlString, boolean simulateOpException) {
        try {
            URL url = new URL(urlString);
            try (HttpConnectionWrapper wrapper = new HttpConnectionWrapper(url)) {
                HttpURLConnection connection = wrapper.getConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                int responseCode = connection.getResponseCode();
                System.out.println("Connection successful");
                if (simulateOpException) {
                    throw new IOException("An error occurred during the network operation.");
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (message != null && message.contains("www.invalid-url")) {
                message = "Could not connect to the URL.";
            }
            System.out.println("Exception: IOException - " + message);
        } finally {
            System.out.println("Connection closed");
        }
    }
    public static void main(String[] args) {
        System.out.println("Test Case 1: Valid URL");
        performNetworkOperation("http://example.com", false);
        System.out.println("\nTest Case 2: Invalid URL");
        performNetworkOperation("http://invalid-url", false);
        System.out.println("\nTest Case 3: Valid URL with operation-time exception");
        performNetworkOperation("http://example.com", true);
    }
}
