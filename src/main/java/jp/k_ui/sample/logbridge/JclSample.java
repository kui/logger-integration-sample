package jp.k_ui.sample.logbridge;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Apache Commons Logging のサンプル
 */
public class JclSample implements Sample {

	static final private Log LOG = LogFactory.getLog(JclSample.class);

	@Override
	public void sample() {
		LOG.trace("a trace-level log");
		LOG.debug("a debug-level log");
		LOG.info("a info-level log");
		LOG.warn("a warn-level log");
		LOG.error("a error-level log");
		LOG.fatal("a fatal-level log");
	}
}
