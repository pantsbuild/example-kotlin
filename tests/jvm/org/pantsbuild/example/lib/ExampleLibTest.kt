package org.pantsbuild.example

import org.pantsbuild.example.lib.ExampleLib
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ExampleLibTest {
    @Test
    fun testShouldSayHello() {
        assertEquals(ExampleLib.hello(), "Hello World!")
    }
}
