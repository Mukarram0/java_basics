package week12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.logging.log4j.*;

class HttpWrapper implements AutoCloseable {
    private final HttpURLConnection connection;

    public HttpWrapper(URL url) throws IOException {
        this.connection = (HttpURLConnection) url.openConnection();
    }

    public HttpURLConnection getConnection() {
        return connection;
    }

    @Override
    public void close() {
        connection.disconnect();
    }
}

// Custom Exception
class NetworkConnectionException extends Exception {
    public NetworkConnectionException(String message) {
        super(message);
    }
}

public class hcl {
    private static final Logger log = LogManager.getLogger(hcl.class);

    public static void performNetworkOperation(String urlString, boolean simulateOpException) {
        try {
            URL url = new URL(urlString);

            // Simulate invalid URL case
            if (urlString.contains("invalid")) {
                throw new NetworkConnectionException("Could not connect to the URL.");
            }

            try (HttpWrapper wrapper = new HttpWrapper(url)) {
                HttpURLConnection connection = wrapper.getConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                System.out.println("Connection successful");

                if (simulateOpException) {
                    throw new NetworkConnectionException(
                            "An error occurred during the network operation"
                    );
                }
            }

        } catch (NetworkConnectionException e) {
            System.out.println("Exception: NetworkConnectionException - " + e.getMessage());
            log.error("Log:NetworkConnectionException occurred.");

        } catch (IOException e) {
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