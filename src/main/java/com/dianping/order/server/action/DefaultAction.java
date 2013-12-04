package com.dianping.order.server.action;

import burst.web.IAction;
import burst.web.IContext;
import burst.web.IResponse;
import com.dianping.order.server.request.DefaultRequest;
import org.springframework.stereotype.Controller;

/**
 * @author Burst
 *         13-12-3 下午11:35
 */
@Controller("/")
public class DefaultAction implements IAction<DefaultRequest> {

    @Override
    public IResponse execute(DefaultRequest request, IContext context) throws Throwable {
        return null;
    }
}
