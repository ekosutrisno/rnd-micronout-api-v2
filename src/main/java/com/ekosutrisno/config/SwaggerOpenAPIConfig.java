package com.ekosutrisno.config;

import com.ekosutrisno.Application;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:28
 */
@OpenAPIDefinition(
        info = @Info(
                title = "api-v3",
                version = "0.0"
        )
)
public class SwaggerOpenAPIConfig extends Application {
}
