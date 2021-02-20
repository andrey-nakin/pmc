package com.fc.pmc.api.mc.impl;

import com.fc.pmc.api.mc.Mc;
import com.fc.pmc.api.mc.McResult;
import com.fc.pmc.api.mc.bo.McParams;
import com.fc.pmc.api.security.SecurityContext;
import java.util.function.Function;
import javax.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Andrey Nakin
 */
@Service
@Scope(proxyMode = ScopedProxyMode.DEFAULT)
final public class McImpl implements Mc {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional
    @Override
    public <T> T build(
            @NotNull final SecurityContext securityContext,
            @NotNull final McParams params,
            @NotNull Function<McResult, T> mapper
    ) {
        logger.debug("build securityContext={}, params={}", securityContext, params);
        return build2(securityContext, params, mapper);
    }

    @Transactional
    @Override
    public <T> T build2(
            @NotNull final SecurityContext securityContext,
            @NotNull final McParams params,
            @NotNull Function<McResult, T> mapper
    ) {
        logger.debug("build2 securityContext={}, params={}", securityContext, params);
        throw new UnsupportedOperationException();
    }
    
}
