package com.example.demo.config;

import com.example.demo.ws.CompteSoapService;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration du service SOAP
 */
@Configuration
@AllArgsConstructor
public class CxfConfig {

    private CompteSoapService compteSoapService;
    private Bus bus;

    /**
     * Publication de l'endpoint SOAP
     */
    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, compteSoapService);
        endpoint.publish("/ws");
        return endpoint;
    }
}
