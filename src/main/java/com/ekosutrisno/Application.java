package com.ekosutrisno;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "API V2",
                version = "0.0",
                description = "Development",
                license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"),
                contact = @Contact(url = "", name = "Eko Sutrisno", email = "ekosutrisno801@gmail.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
