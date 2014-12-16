package com.rattboi.deprest

import com.rattboi.deprest.controllers.DefaultController
import io.dropwizard.jersey.setup.JerseyEnvironment
import io.dropwizard.setup.Environment
import org.junit.Before
import org.junit.Test

import static org.mockito.Mockito.*

class DeprestApplicationTest {

    def application = new DeprestApplication()
    def envMock = mock(Environment.class)
    def jerseyMock = mock(JerseyEnvironment.class)

    @Before
    void setup() {
        when(envMock.jersey()).thenReturn(jerseyMock);
    }

    @Test
    void shouldRegisterDefaultController() {
        def conf = new DeprestConfiguration()
        application.run(conf, envMock)
        verify(jerseyMock, atLeastOnce()).register(DefaultController.class)
    }
}
