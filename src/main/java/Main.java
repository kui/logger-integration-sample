import java.util.Arrays;
import java.util.List;

import jp.k_ui.sample.logbridge.JclSample;
import jp.k_ui.sample.logbridge.JulSample;
import jp.k_ui.sample.logbridge.Log4jSample;
import jp.k_ui.sample.logbridge.Sample;
import jp.k_ui.sample.logbridge.Slf4jSample;

import org.slf4j.bridge.SLF4JBridgeHandler;

public class Main {
	static {
		SLF4JBridgeHandler.removeHandlersForRootLogger();
		SLF4JBridgeHandler.install();
	}

	public static void main(String[] args) {
		List<Sample> samples = Arrays.asList(new JulSample(), new JclSample(), new Log4jSample(), new Slf4jSample());

		for (Sample s : samples) {
			System.out.println("\n###\t" + s.getClass().getSimpleName() + "\t###");
			s.sample();
		}
	}
}
