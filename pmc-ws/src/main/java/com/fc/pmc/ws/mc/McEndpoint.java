package com.fc.pmc.ws.mc;

import com.fc.api.mc.Mc;
import com.fc.pmc.ws.dto.mc.McResultDto;
import com.fc.pmc.ws.dto.mc.McParamsDto;
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
@RequestMapping("/v1/mc")
public class McEndpoint {

    private final Mc mc;

    public McEndpoint(Mc mc) {
        this.mc = mc;
    }

    @PostMapping
    @NotNull
    public McResultDto calculate(
            @NotNull final @RequestBody McParamsDto params
    ) {
        return null;
    }

}
