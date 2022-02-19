package org.javacs.kt.externalsources

import java.nio.file.Path
import org.javacs.kt.CompilerClassPath

class ClassPathSourceJarProvider(private val cp: CompilerClassPath) : SourceJarProvider {
    override fun fetchSourceJar(compiledJar: Path): Path? =
        cp.classPath.firstOrNull { it.compiledJar == compiledJar }?.sourceJar
}
