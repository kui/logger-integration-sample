package jp.k_ui.sample.logbridge;

import java.util.logging.Logger;

/**
 * {@link java.util.logging.Logger} を使ったサンプル
 */
public class JulSample implements Sample {

	final static private Logger LOG = Logger.getLogger(JulSample.class.getName());

	@Override
	public void sample() {
		LOG.finest("a finest-level log");
		LOG.finer("a finer-level log");
		LOG.fine("a fine-level log");
		LOG.config("a config-level log");
		LOG.info("a info-level log");
		LOG.warning("a warning-level log");
		LOG.severe("a severe-level log");
	}
}
