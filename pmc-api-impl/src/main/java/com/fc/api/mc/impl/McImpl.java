package com.fc.api.mc.impl;

import com.fc.api.mc.Mc;
import com.fc.api.mc.McResult;
import com.fc.api.mc.bo.McParams;
import com.fc.api.security.SecurityContext;
import java.util.function.Function;
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

    public <T> T build(
            @NotNull final SecurityContext securityContext,
            @NotNull final McParams params,
            @NotNull Function<McResult, T> mapper
    ) {
        logger.debug("build securityContext={}, params={}", securityContext, params);
        throw new UnsupportedOperationException();
    }

}
