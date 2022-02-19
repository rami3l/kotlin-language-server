package org.javacs.kt.classpath

import java.nio.file.Paths
import org.javacs.kt.util.userHome

internal val gradleHome =
    System.getenv("GRADLE_USER_HOME")?.let { Paths.get(it) } ?: userHome.resolve(".gradle")
// TODO: try and figure out if mavenHome is in non-default position (requires finding and parsing
// settings.xml)
internal val mavenHome = userHome.resolve(".m2")
