import Versions.KOTEST_VERSION
import Versions.MOCKK_VERSION
import Versions.KOTLIN_COROUTINES_VERSION
import Core.KOTLINX_GROUP
import Versions.ARROW_VERSION

object Versions {
    const val KOTLIN_VERSION = "1.4.10"
    const val KOTLIN_COROUTINES_VERSION = "1.4.0-M1"

    const val ARROW_VERSION = "0.10.5"

    const val KOTEST_VERSION = "4.3.0"
    const val MOCKK_VERSION = "1.10.0"

    const val DETEKT_VERSION = "1.10.0-RC1"
}

object Plugins {
    const val KOTLIN = "org.jetbrains.kotlin.jvm"
    const val KAPT = "kapt"
    const val DETEKT = "io.gitlab.arturbosch.detekt"
}

object Core {
    private const val ARROW_GROUP = "io.arrow-kt"
    const val KOTLINX_GROUP = "org.jetbrains.kotlinx"

    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val KOTLINX_COROUTINES = "$KOTLINX_GROUP:kotlinx-coroutines-core:$KOTLIN_COROUTINES_VERSION"

    const val ARROW_FX = "$ARROW_GROUP:arrow-fx:$ARROW_VERSION"
    const val ARROW_OPTICS = "$ARROW_GROUP:arrow-optics:$ARROW_VERSION"
    const val ARROW_SYNTAX = "$ARROW_GROUP:arrow-syntax:$ARROW_VERSION"
    const val ARROW_META = "$ARROW_GROUP:arrow-meta:$ARROW_VERSION"
}

object Testing {
    private const val KOTEST_GROUP = "io.kotest"
    const val KOTEST_RUNNER = "$KOTEST_GROUP:kotest-runner-junit5-jvm:$KOTEST_VERSION"
    const val KOTEST_JUNIT_RUNNER = "$KOTEST_GROUP:kotest-runner-junit5:$KOTEST_VERSION"
    const val KOTEST_ASSERTIONS = "$KOTEST_GROUP:kotest-assertions-core-jvm:$KOTEST_VERSION"
    const val KOTEST_PROPERTIES = "$KOTEST_GROUP:kotest-property-jvm:$KOTEST_VERSION"

    const val MOCKK = "io.mockk:mockk:$MOCKK_VERSION"

    const val KOTLINX_COROUTINES_TEST = "$KOTLINX_GROUP:kotlinx-coroutines-test:$KOTLIN_COROUTINES_VERSION"
}
