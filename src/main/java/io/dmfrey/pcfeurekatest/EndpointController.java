package io.dmfrey.pcfeurekatest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@Slf4j
public class EndpointController {

    @GetMapping
    @ResponseStatus( OK )
    public void get() {
        log.info( "get : enter, calling get" );

    }

}
