package jp.k_ui.sample.logbridge;

import org.apache.log4j.Logger;

/**
 * Log4J を使ったサンプル
 */
public class Log4jSample implements Sample {

	static final private Logger LOG = Logger.getLogger(Log4jSample.class);

	@Override
	public void sample() {
		LOG.trace("a trace-level log");
		LOG.debug("a debug-level log");
		LOG.info("a info-level log");
		LOG.error("a error-level log");
		LOG.fatal("a fatal-level log");
	}
}
