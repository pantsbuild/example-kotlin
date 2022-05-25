package org.pantsbuild.example

import kotlin.test.Test
import kotlin.test.assertEquals

import org.pantsbuild.example.lib.ExampleLib

internal class ExampleLibTest {
  @Test
  fun testShouldSayHello() {
    assertEquals(ExampleLib.hello(), "Hello World!")
  }
}

