package jp.k_ui.sample.logbridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J を使ったサンプル
 */
public class Slf4jSample implements Sample {

	static final private Logger LOG = LoggerFactory.getLogger(Slf4jSample.class);

	@Override
	public void sample() {
		LOG.trace("a trace-level log");
		LOG.debug("a debug-level log");
		LOG.info("a info-level log");
		LOG.warn("a warn-level log");
		LOG.error("a error-level log");
	}

}
