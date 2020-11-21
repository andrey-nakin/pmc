package com.fc.pmc.ws.mc;

import com.fc.pmc.api.mc.Mc;
import com.fc.pmc.ws.WsApiConstants;
import com.fc.pmc.ws.WsApiTags;
import com.fc.pmc.ws.dto.mc.McResultDto;
import com.fc.pmc.ws.dto.mc.McParamsDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import javax.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andrey
 */
@RestController
@RequestMapping(WsApiConstants.URL_BASE + "/mc")
@Tags(value = {
    @Tag(name = WsApiTags.MONTE_CARLO)})
public class McEndpoint {

    private final Mc mc;

    public McEndpoint(Mc mc) {
        this.mc = mc;
    }

    @PostMapping
    @NotNull
    @Operation(summary = "Monte-Carlo calculation")
    public McResultDto calculate(
            @NotNull final @RequestBody McParamsDto params
    ) {
        return null;
    }

}
