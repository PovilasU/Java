package Tu38_48_InstantMessagingPorgramWithStreamsAndSockets;
import javax.swing.JFrame;

public class ServerTest {
	public static void main(String[] args) {
		Server rimma = new Server();
		rimma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rimma.startRunning();

	}
}
