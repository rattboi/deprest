package com.rattboi.deprest

import org.junit.Test

import static org.hamcrest.CoreMatchers.not
import static org.hamcrest.CoreMatchers.nullValue
import static org.hamcrest.MatcherAssert.assertThat

class DeprestConfigurationTest {

    @Test
    void shouldBeConstructed() {
        def configuration = new DeprestConfiguration()
        assertThat(configuration, not(nullValue()))
    }
}
