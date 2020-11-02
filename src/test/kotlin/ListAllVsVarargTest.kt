import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ListAllVsVarargTest : FunSpec({
    test("example") {
        7 * 6 shouldBe 42
    }

    // 10000 diff: 13645955, 7861334
    // 10_000_000 diff: 785202782, 5986165303
    // 100_000_000 diff: 3281635881, 3921936691
    test("all(vararg)") {
        val timeStart = System.nanoTime()
        (1..100_000_000).forEach {
            all(it, it + 1, it + 2, it + 3, it + 4, it + 5, it + 6, it + 7, it + 8, it + 9) { it < 10000 }
        }
        println(System.nanoTime() - timeStart)
    }

    // 10000 diff: 39916121, 16098458
    // 10_000_000 diff: 1024229919, 835147426
    // 100_000_000 diff: 5986165303, 6051028875
    test("listof.all") {
        val timeStart = System.nanoTime()
        (1..100_000_000).forEach {
            listOf(it, it + 1, it + 2, it + 3, it + 4, it + 5, it + 6, it + 7, it + 8, it + 9).all { it < 10000 }
        }
        println(System.nanoTime() - timeStart)
    }
})

fun <T> all(vararg args: T, predicate: (T) -> Boolean): Boolean {
    return args.all(predicate)
}
