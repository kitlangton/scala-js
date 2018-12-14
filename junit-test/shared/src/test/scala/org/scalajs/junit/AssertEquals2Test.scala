/*
 * Scala.js (https://www.scala-js.org/)
 *
 * Copyright EPFL.
 *
 * Licensed under Apache License 2.0
 * (https://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package org.scalajs.junit

import org.junit.Assert._
import org.junit.Test
import org.scalajs.junit.utils._

class AssertEquals2Test {
  @Test def test(): Unit = {
    assertEquals("This is the message", false, true)
  }
}

class AssertEquals2TestAssertions extends JUnitTest
