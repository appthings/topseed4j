package org.apache.chain;

import org.apache.chain.srv.AbsNRouter;
import org.info.net.NetU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.http.FullHttpMessage;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;

/**
 *
 * Able to handle chain | cmd plugins
 *
 */
@Sharable
public class DefaultChainRouter extends AbsNRouter {

	private final static Logger logger = LoggerFactory.getLogger(DefaultChainRouter.class);

	/**
	 *
	 * If you need a different factory, override this.
	 */
	@Override
	protected void addNewChain(String path) throws Throwable {
		BasicChainFac chain = new BasicChainFac(path);
		_chainRoutes.put(path, chain);
	}

	/**
	 * Handle resource requests
	 */
	@Override
	protected FullHttpMessage resource(FullHttpRequest req, String path) {
		FullHttpMessage resp = NetU.makeEMsg("to do", HttpResponseStatus.BAD_REQUEST);
		return resp;
	}
}