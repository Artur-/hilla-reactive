package com.example.application;

import java.time.Duration;

import com.vaadin.flow.server.auth.AnonymousAllowed;

import dev.hilla.Endpoint;
import dev.hilla.Nonnull;
import reactor.core.publisher.Flux;

@Endpoint
@AnonymousAllowed
public class HelloEndpoint {

    public @Nonnull String sayHello(String name) {
        return "Hello " + name;
    }

    public @Nonnull Flux<@Nonnull String> sayManyThings(String name) {
        return Flux.just("Hello " + name, "How are you doing " + name, "Good bye " + name)
                .delayElements(Duration.ofMillis(800));
    }
}
