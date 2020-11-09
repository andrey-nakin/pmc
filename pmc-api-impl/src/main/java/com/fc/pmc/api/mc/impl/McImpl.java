package com.fc.pmc.api.mc.impl;

import com.fc.api.mc.Mc;
import com.fc.api.mc.bo.McParams;
import com.fc.api.mc.bo.McResult;
import com.fc.api.security.SecurityContext;
import javax.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrey Nakin
 */
@Service
public class McImpl implements Mc {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @NotNull
    public McResult build(
            @NotNull final SecurityContext securityContext,
            @NotNull final McParams params
    ) {
        logger.debug("build securityContext={}, params={}", securityContext, params);
        throw new UnsupportedOperationException();
    }

}
