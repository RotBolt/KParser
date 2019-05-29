@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package math

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*

// NOTE THIS FILE IS AUTO-GENERATED

fun __fpclassify(__value: Double): Int {
    return kniBridge0(__value)
}

fun __signbit(__value: Double): Int {
    return kniBridge1(__value)
}

fun __isinf(__value: Double): Int {
    return kniBridge2(__value)
}

fun __finite(__value: Double): Int {
    return kniBridge3(__value)
}

fun __isnan(__value: Double): Int {
    return kniBridge4(__value)
}

fun __iseqsig(__x: Double, __y: Double): Int {
    return kniBridge5(__x, __y)
}

fun __issignaling(__value: Double): Int {
    return kniBridge6(__value)
}

fun acos(__x: Double): Double {
    return kniBridge7(__x)
}

fun __acos(__x: Double): Double {
    return kniBridge8(__x)
}

fun asin(__x: Double): Double {
    return kniBridge9(__x)
}

fun __asin(__x: Double): Double {
    return kniBridge10(__x)
}

fun atan(__x: Double): Double {
    return kniBridge11(__x)
}

fun __atan(__x: Double): Double {
    return kniBridge12(__x)
}

fun atan2(__y: Double, __x: Double): Double {
    return kniBridge13(__y, __x)
}

fun __atan2(__y: Double, __x: Double): Double {
    return kniBridge14(__y, __x)
}

fun cos(__x: Double): Double {
    return kniBridge15(__x)
}

fun __cos(__x: Double): Double {
    return kniBridge16(__x)
}

fun sin(__x: Double): Double {
    return kniBridge17(__x)
}

fun __sin(__x: Double): Double {
    return kniBridge18(__x)
}

fun tan(__x: Double): Double {
    return kniBridge19(__x)
}

fun __tan(__x: Double): Double {
    return kniBridge20(__x)
}

fun cosh(__x: Double): Double {
    return kniBridge21(__x)
}

fun __cosh(__x: Double): Double {
    return kniBridge22(__x)
}

fun sinh(__x: Double): Double {
    return kniBridge23(__x)
}

fun __sinh(__x: Double): Double {
    return kniBridge24(__x)
}

fun tanh(__x: Double): Double {
    return kniBridge25(__x)
}

fun __tanh(__x: Double): Double {
    return kniBridge26(__x)
}

fun acosh(__x: Double): Double {
    return kniBridge27(__x)
}

fun __acosh(__x: Double): Double {
    return kniBridge28(__x)
}

fun asinh(__x: Double): Double {
    return kniBridge29(__x)
}

fun __asinh(__x: Double): Double {
    return kniBridge30(__x)
}

fun atanh(__x: Double): Double {
    return kniBridge31(__x)
}

fun __atanh(__x: Double): Double {
    return kniBridge32(__x)
}

fun exp(__x: Double): Double {
    return kniBridge33(__x)
}

fun __exp(__x: Double): Double {
    return kniBridge34(__x)
}

fun frexp(__x: Double, __exponent: CValuesRef<IntVar>?): Double {
    memScoped {
        return kniBridge35(__x, __exponent?.getPointer(memScope).rawValue)
    }
}

fun __frexp(__x: Double, __exponent: CValuesRef<IntVar>?): Double {
    memScoped {
        return kniBridge36(__x, __exponent?.getPointer(memScope).rawValue)
    }
}

fun ldexp(__x: Double, __exponent: Int): Double {
    return kniBridge37(__x, __exponent)
}

fun __ldexp(__x: Double, __exponent: Int): Double {
    return kniBridge38(__x, __exponent)
}

fun log(__x: Double): Double {
    return kniBridge39(__x)
}

fun __log(__x: Double): Double {
    return kniBridge40(__x)
}

fun log10(__x: Double): Double {
    return kniBridge41(__x)
}

fun __log10(__x: Double): Double {
    return kniBridge42(__x)
}

fun modf(__x: Double, __iptr: CValuesRef<DoubleVar>?): Double {
    memScoped {
        return kniBridge43(__x, __iptr?.getPointer(memScope).rawValue)
    }
}

fun __modf(__x: Double, __iptr: CValuesRef<DoubleVar>?): Double {
    memScoped {
        return kniBridge44(__x, __iptr?.getPointer(memScope).rawValue)
    }
}

fun expm1(__x: Double): Double {
    return kniBridge45(__x)
}

fun __expm1(__x: Double): Double {
    return kniBridge46(__x)
}

fun log1p(__x: Double): Double {
    return kniBridge47(__x)
}

fun __log1p(__x: Double): Double {
    return kniBridge48(__x)
}

fun logb(__x: Double): Double {
    return kniBridge49(__x)
}

fun __logb(__x: Double): Double {
    return kniBridge50(__x)
}

fun exp2(__x: Double): Double {
    return kniBridge51(__x)
}

fun __exp2(__x: Double): Double {
    return kniBridge52(__x)
}

fun log2(__x: Double): Double {
    return kniBridge53(__x)
}

fun __log2(__x: Double): Double {
    return kniBridge54(__x)
}

fun pow(__x: Double, __y: Double): Double {
    return kniBridge55(__x, __y)
}

fun __pow(__x: Double, __y: Double): Double {
    return kniBridge56(__x, __y)
}

fun sqrt(__x: Double): Double {
    return kniBridge57(__x)
}

fun __sqrt(__x: Double): Double {
    return kniBridge58(__x)
}

fun hypot(__x: Double, __y: Double): Double {
    return kniBridge59(__x, __y)
}

fun __hypot(__x: Double, __y: Double): Double {
    return kniBridge60(__x, __y)
}

fun cbrt(__x: Double): Double {
    return kniBridge61(__x)
}

fun __cbrt(__x: Double): Double {
    return kniBridge62(__x)
}

fun ceil(__x: Double): Double {
    return kniBridge63(__x)
}

fun __ceil(__x: Double): Double {
    return kniBridge64(__x)
}

fun fabs(__x: Double): Double {
    return kniBridge65(__x)
}

fun __fabs(__x: Double): Double {
    return kniBridge66(__x)
}

fun floor(__x: Double): Double {
    return kniBridge67(__x)
}

fun __floor(__x: Double): Double {
    return kniBridge68(__x)
}

fun fmod(__x: Double, __y: Double): Double {
    return kniBridge69(__x, __y)
}

fun __fmod(__x: Double, __y: Double): Double {
    return kniBridge70(__x, __y)
}

fun isinf(__value: Double): Int {
    return kniBridge71(__value)
}

fun finite(__value: Double): Int {
    return kniBridge72(__value)
}

fun drem(__x: Double, __y: Double): Double {
    return kniBridge73(__x, __y)
}

fun __drem(__x: Double, __y: Double): Double {
    return kniBridge74(__x, __y)
}

fun significand(__x: Double): Double {
    return kniBridge75(__x)
}

fun __significand(__x: Double): Double {
    return kniBridge76(__x)
}

fun copysign(__x: Double, __y: Double): Double {
    return kniBridge77(__x, __y)
}

fun __copysign(__x: Double, __y: Double): Double {
    return kniBridge78(__x, __y)
}

fun nan(@CCall.CString __tagb: String?): Double {
    memScoped {
        return kniBridge79(__tagb?.cstr?.getPointer(memScope).rawValue)
    }
}

fun __nan(@CCall.CString __tagb: String?): Double {
    memScoped {
        return kniBridge80(__tagb?.cstr?.getPointer(memScope).rawValue)
    }
}

fun isnan(__value: Double): Int {
    return kniBridge81(__value)
}

fun j0(arg0: Double): Double {
    return kniBridge82(arg0)
}

fun __j0(arg0: Double): Double {
    return kniBridge83(arg0)
}

fun j1(arg0: Double): Double {
    return kniBridge84(arg0)
}

fun __j1(arg0: Double): Double {
    return kniBridge85(arg0)
}

fun jn(arg0: Int, arg1: Double): Double {
    return kniBridge86(arg0, arg1)
}

fun __jn(arg0: Int, arg1: Double): Double {
    return kniBridge87(arg0, arg1)
}

fun y0(arg0: Double): Double {
    return kniBridge88(arg0)
}

fun __y0(arg0: Double): Double {
    return kniBridge89(arg0)
}

fun y1(arg0: Double): Double {
    return kniBridge90(arg0)
}

fun __y1(arg0: Double): Double {
    return kniBridge91(arg0)
}

fun yn(arg0: Int, arg1: Double): Double {
    return kniBridge92(arg0, arg1)
}

fun __yn(arg0: Int, arg1: Double): Double {
    return kniBridge93(arg0, arg1)
}

fun erf(arg0: Double): Double {
    return kniBridge94(arg0)
}

fun __erf(arg0: Double): Double {
    return kniBridge95(arg0)
}

fun erfc(arg0: Double): Double {
    return kniBridge96(arg0)
}

fun __erfc(arg0: Double): Double {
    return kniBridge97(arg0)
}

fun lgamma(arg0: Double): Double {
    return kniBridge98(arg0)
}

fun __lgamma(arg0: Double): Double {
    return kniBridge99(arg0)
}

fun tgamma(arg0: Double): Double {
    return kniBridge100(arg0)
}

fun __tgamma(arg0: Double): Double {
    return kniBridge101(arg0)
}

fun gamma(arg0: Double): Double {
    return kniBridge102(arg0)
}

fun __gamma(arg0: Double): Double {
    return kniBridge103(arg0)
}

fun lgamma_r(arg0: Double, __signgamp: CValuesRef<IntVar>?): Double {
    memScoped {
        return kniBridge104(arg0, __signgamp?.getPointer(memScope).rawValue)
    }
}

fun __lgamma_r(arg0: Double, __signgamp: CValuesRef<IntVar>?): Double {
    memScoped {
        return kniBridge105(arg0, __signgamp?.getPointer(memScope).rawValue)
    }
}

fun rint(__x: Double): Double {
    return kniBridge106(__x)
}

fun __rint(__x: Double): Double {
    return kniBridge107(__x)
}

fun nextafter(__x: Double, __y: Double): Double {
    return kniBridge108(__x, __y)
}

fun __nextafter(__x: Double, __y: Double): Double {
    return kniBridge109(__x, __y)
}

fun remainder(__x: Double, __y: Double): Double {
    return kniBridge110(__x, __y)
}

fun __remainder(__x: Double, __y: Double): Double {
    return kniBridge111(__x, __y)
}

fun scalbn(__x: Double, __n: Int): Double {
    return kniBridge112(__x, __n)
}

fun __scalbn(__x: Double, __n: Int): Double {
    return kniBridge113(__x, __n)
}

fun ilogb(__x: Double): Int {
    return kniBridge114(__x)
}

fun __ilogb(__x: Double): Int {
    return kniBridge115(__x)
}

fun scalbln(__x: Double, __n: Long): Double {
    return kniBridge116(__x, __n)
}

fun __scalbln(__x: Double, __n: Long): Double {
    return kniBridge117(__x, __n)
}

fun nearbyint(__x: Double): Double {
    return kniBridge118(__x)
}

fun __nearbyint(__x: Double): Double {
    return kniBridge119(__x)
}

fun round(__x: Double): Double {
    return kniBridge120(__x)
}

fun __round(__x: Double): Double {
    return kniBridge121(__x)
}

fun trunc(__x: Double): Double {
    return kniBridge122(__x)
}

fun __trunc(__x: Double): Double {
    return kniBridge123(__x)
}

fun remquo(__x: Double, __y: Double, __quo: CValuesRef<IntVar>?): Double {
    memScoped {
        return kniBridge124(__x, __y, __quo?.getPointer(memScope).rawValue)
    }
}

fun __remquo(__x: Double, __y: Double, __quo: CValuesRef<IntVar>?): Double {
    memScoped {
        return kniBridge125(__x, __y, __quo?.getPointer(memScope).rawValue)
    }
}

fun lrint(__x: Double): Long {
    return kniBridge126(__x)
}

fun __lrint(__x: Double): Long {
    return kniBridge127(__x)
}

fun llrint(__x: Double): Long {
    return kniBridge128(__x)
}

fun __llrint(__x: Double): Long {
    return kniBridge129(__x)
}

fun lround(__x: Double): Long {
    return kniBridge130(__x)
}

fun __lround(__x: Double): Long {
    return kniBridge131(__x)
}

fun llround(__x: Double): Long {
    return kniBridge132(__x)
}

fun __llround(__x: Double): Long {
    return kniBridge133(__x)
}

fun fdim(__x: Double, __y: Double): Double {
    return kniBridge134(__x, __y)
}

fun __fdim(__x: Double, __y: Double): Double {
    return kniBridge135(__x, __y)
}

fun fmax(__x: Double, __y: Double): Double {
    return kniBridge136(__x, __y)
}

fun __fmax(__x: Double, __y: Double): Double {
    return kniBridge137(__x, __y)
}

fun fmin(__x: Double, __y: Double): Double {
    return kniBridge138(__x, __y)
}

fun __fmin(__x: Double, __y: Double): Double {
    return kniBridge139(__x, __y)
}

fun fma(__x: Double, __y: Double, __z: Double): Double {
    return kniBridge140(__x, __y, __z)
}

fun __fma(__x: Double, __y: Double, __z: Double): Double {
    return kniBridge141(__x, __y, __z)
}

fun scalb(__x: Double, __n: Double): Double {
    return kniBridge142(__x, __n)
}

fun __scalb(__x: Double, __n: Double): Double {
    return kniBridge143(__x, __n)
}

fun __fpclassifyf(__value: Float): Int {
    return kniBridge144(__value)
}

fun __signbitf(__value: Float): Int {
    return kniBridge145(__value)
}

fun __isinff(__value: Float): Int {
    return kniBridge146(__value)
}

fun __finitef(__value: Float): Int {
    return kniBridge147(__value)
}

fun __isnanf(__value: Float): Int {
    return kniBridge148(__value)
}

fun __iseqsigf(__x: Float, __y: Float): Int {
    return kniBridge149(__x, __y)
}

fun __issignalingf(__value: Float): Int {
    return kniBridge150(__value)
}

fun acosf(__x: Float): Float {
    return kniBridge151(__x)
}

fun __acosf(__x: Float): Float {
    return kniBridge152(__x)
}

fun asinf(__x: Float): Float {
    return kniBridge153(__x)
}

fun __asinf(__x: Float): Float {
    return kniBridge154(__x)
}

fun atanf(__x: Float): Float {
    return kniBridge155(__x)
}

fun __atanf(__x: Float): Float {
    return kniBridge156(__x)
}

fun atan2f(__y: Float, __x: Float): Float {
    return kniBridge157(__y, __x)
}

fun __atan2f(__y: Float, __x: Float): Float {
    return kniBridge158(__y, __x)
}

fun cosf(__x: Float): Float {
    return kniBridge159(__x)
}

fun __cosf(__x: Float): Float {
    return kniBridge160(__x)
}

fun sinf(__x: Float): Float {
    return kniBridge161(__x)
}

fun __sinf(__x: Float): Float {
    return kniBridge162(__x)
}

fun tanf(__x: Float): Float {
    return kniBridge163(__x)
}

fun __tanf(__x: Float): Float {
    return kniBridge164(__x)
}

fun coshf(__x: Float): Float {
    return kniBridge165(__x)
}

fun __coshf(__x: Float): Float {
    return kniBridge166(__x)
}

fun sinhf(__x: Float): Float {
    return kniBridge167(__x)
}

fun __sinhf(__x: Float): Float {
    return kniBridge168(__x)
}

fun tanhf(__x: Float): Float {
    return kniBridge169(__x)
}

fun __tanhf(__x: Float): Float {
    return kniBridge170(__x)
}

fun acoshf(__x: Float): Float {
    return kniBridge171(__x)
}

fun __acoshf(__x: Float): Float {
    return kniBridge172(__x)
}

fun asinhf(__x: Float): Float {
    return kniBridge173(__x)
}

fun __asinhf(__x: Float): Float {
    return kniBridge174(__x)
}

fun atanhf(__x: Float): Float {
    return kniBridge175(__x)
}

fun __atanhf(__x: Float): Float {
    return kniBridge176(__x)
}

fun expf(__x: Float): Float {
    return kniBridge177(__x)
}

fun __expf(__x: Float): Float {
    return kniBridge178(__x)
}

fun frexpf(__x: Float, __exponent: CValuesRef<IntVar>?): Float {
    memScoped {
        return kniBridge179(__x, __exponent?.getPointer(memScope).rawValue)
    }
}

fun __frexpf(__x: Float, __exponent: CValuesRef<IntVar>?): Float {
    memScoped {
        return kniBridge180(__x, __exponent?.getPointer(memScope).rawValue)
    }
}

fun ldexpf(__x: Float, __exponent: Int): Float {
    return kniBridge181(__x, __exponent)
}

fun __ldexpf(__x: Float, __exponent: Int): Float {
    return kniBridge182(__x, __exponent)
}

fun logf(__x: Float): Float {
    return kniBridge183(__x)
}

fun __logf(__x: Float): Float {
    return kniBridge184(__x)
}

fun log10f(__x: Float): Float {
    return kniBridge185(__x)
}

fun __log10f(__x: Float): Float {
    return kniBridge186(__x)
}

fun modff(__x: Float, __iptr: CValuesRef<FloatVar>?): Float {
    memScoped {
        return kniBridge187(__x, __iptr?.getPointer(memScope).rawValue)
    }
}

fun __modff(__x: Float, __iptr: CValuesRef<FloatVar>?): Float {
    memScoped {
        return kniBridge188(__x, __iptr?.getPointer(memScope).rawValue)
    }
}

fun expm1f(__x: Float): Float {
    return kniBridge189(__x)
}

fun __expm1f(__x: Float): Float {
    return kniBridge190(__x)
}

fun log1pf(__x: Float): Float {
    return kniBridge191(__x)
}

fun __log1pf(__x: Float): Float {
    return kniBridge192(__x)
}

fun logbf(__x: Float): Float {
    return kniBridge193(__x)
}

fun __logbf(__x: Float): Float {
    return kniBridge194(__x)
}

fun exp2f(__x: Float): Float {
    return kniBridge195(__x)
}

fun __exp2f(__x: Float): Float {
    return kniBridge196(__x)
}

fun log2f(__x: Float): Float {
    return kniBridge197(__x)
}

fun __log2f(__x: Float): Float {
    return kniBridge198(__x)
}

fun powf(__x: Float, __y: Float): Float {
    return kniBridge199(__x, __y)
}

fun __powf(__x: Float, __y: Float): Float {
    return kniBridge200(__x, __y)
}

fun sqrtf(__x: Float): Float {
    return kniBridge201(__x)
}

fun __sqrtf(__x: Float): Float {
    return kniBridge202(__x)
}

fun hypotf(__x: Float, __y: Float): Float {
    return kniBridge203(__x, __y)
}

fun __hypotf(__x: Float, __y: Float): Float {
    return kniBridge204(__x, __y)
}

fun cbrtf(__x: Float): Float {
    return kniBridge205(__x)
}

fun __cbrtf(__x: Float): Float {
    return kniBridge206(__x)
}

fun ceilf(__x: Float): Float {
    return kniBridge207(__x)
}

fun __ceilf(__x: Float): Float {
    return kniBridge208(__x)
}

fun fabsf(__x: Float): Float {
    return kniBridge209(__x)
}

fun __fabsf(__x: Float): Float {
    return kniBridge210(__x)
}

fun floorf(__x: Float): Float {
    return kniBridge211(__x)
}

fun __floorf(__x: Float): Float {
    return kniBridge212(__x)
}

fun fmodf(__x: Float, __y: Float): Float {
    return kniBridge213(__x, __y)
}

fun __fmodf(__x: Float, __y: Float): Float {
    return kniBridge214(__x, __y)
}

fun isinff(__value: Float): Int {
    return kniBridge215(__value)
}

fun finitef(__value: Float): Int {
    return kniBridge216(__value)
}

fun dremf(__x: Float, __y: Float): Float {
    return kniBridge217(__x, __y)
}

fun __dremf(__x: Float, __y: Float): Float {
    return kniBridge218(__x, __y)
}

fun significandf(__x: Float): Float {
    return kniBridge219(__x)
}

fun __significandf(__x: Float): Float {
    return kniBridge220(__x)
}

fun copysignf(__x: Float, __y: Float): Float {
    return kniBridge221(__x, __y)
}

fun __copysignf(__x: Float, __y: Float): Float {
    return kniBridge222(__x, __y)
}

fun nanf(@CCall.CString __tagb: String?): Float {
    memScoped {
        return kniBridge223(__tagb?.cstr?.getPointer(memScope).rawValue)
    }
}

fun __nanf(@CCall.CString __tagb: String?): Float {
    memScoped {
        return kniBridge224(__tagb?.cstr?.getPointer(memScope).rawValue)
    }
}

fun isnanf(__value: Float): Int {
    return kniBridge225(__value)
}

fun j0f(arg0: Float): Float {
    return kniBridge226(arg0)
}

fun __j0f(arg0: Float): Float {
    return kniBridge227(arg0)
}

fun j1f(arg0: Float): Float {
    return kniBridge228(arg0)
}

fun __j1f(arg0: Float): Float {
    return kniBridge229(arg0)
}

fun jnf(arg0: Int, arg1: Float): Float {
    return kniBridge230(arg0, arg1)
}

fun __jnf(arg0: Int, arg1: Float): Float {
    return kniBridge231(arg0, arg1)
}

fun y0f(arg0: Float): Float {
    return kniBridge232(arg0)
}

fun __y0f(arg0: Float): Float {
    return kniBridge233(arg0)
}

fun y1f(arg0: Float): Float {
    return kniBridge234(arg0)
}

fun __y1f(arg0: Float): Float {
    return kniBridge235(arg0)
}

fun ynf(arg0: Int, arg1: Float): Float {
    return kniBridge236(arg0, arg1)
}

fun __ynf(arg0: Int, arg1: Float): Float {
    return kniBridge237(arg0, arg1)
}

fun erff(arg0: Float): Float {
    return kniBridge238(arg0)
}

fun __erff(arg0: Float): Float {
    return kniBridge239(arg0)
}

fun erfcf(arg0: Float): Float {
    return kniBridge240(arg0)
}

fun __erfcf(arg0: Float): Float {
    return kniBridge241(arg0)
}

fun lgammaf(arg0: Float): Float {
    return kniBridge242(arg0)
}

fun __lgammaf(arg0: Float): Float {
    return kniBridge243(arg0)
}

fun tgammaf(arg0: Float): Float {
    return kniBridge244(arg0)
}

fun __tgammaf(arg0: Float): Float {
    return kniBridge245(arg0)
}

fun gammaf(arg0: Float): Float {
    return kniBridge246(arg0)
}

fun __gammaf(arg0: Float): Float {
    return kniBridge247(arg0)
}

fun lgammaf_r(arg0: Float, __signgamp: CValuesRef<IntVar>?): Float {
    memScoped {
        return kniBridge248(arg0, __signgamp?.getPointer(memScope).rawValue)
    }
}

fun __lgammaf_r(arg0: Float, __signgamp: CValuesRef<IntVar>?): Float {
    memScoped {
        return kniBridge249(arg0, __signgamp?.getPointer(memScope).rawValue)
    }
}

fun rintf(__x: Float): Float {
    return kniBridge250(__x)
}

fun __rintf(__x: Float): Float {
    return kniBridge251(__x)
}

fun nextafterf(__x: Float, __y: Float): Float {
    return kniBridge252(__x, __y)
}

fun __nextafterf(__x: Float, __y: Float): Float {
    return kniBridge253(__x, __y)
}

fun remainderf(__x: Float, __y: Float): Float {
    return kniBridge254(__x, __y)
}

fun __remainderf(__x: Float, __y: Float): Float {
    return kniBridge255(__x, __y)
}

fun scalbnf(__x: Float, __n: Int): Float {
    return kniBridge256(__x, __n)
}

fun __scalbnf(__x: Float, __n: Int): Float {
    return kniBridge257(__x, __n)
}

fun ilogbf(__x: Float): Int {
    return kniBridge258(__x)
}

fun __ilogbf(__x: Float): Int {
    return kniBridge259(__x)
}

fun scalblnf(__x: Float, __n: Long): Float {
    return kniBridge260(__x, __n)
}

fun __scalblnf(__x: Float, __n: Long): Float {
    return kniBridge261(__x, __n)
}

fun nearbyintf(__x: Float): Float {
    return kniBridge262(__x)
}

fun __nearbyintf(__x: Float): Float {
    return kniBridge263(__x)
}

fun roundf(__x: Float): Float {
    return kniBridge264(__x)
}

fun __roundf(__x: Float): Float {
    return kniBridge265(__x)
}

fun truncf(__x: Float): Float {
    return kniBridge266(__x)
}

fun __truncf(__x: Float): Float {
    return kniBridge267(__x)
}

fun remquof(__x: Float, __y: Float, __quo: CValuesRef<IntVar>?): Float {
    memScoped {
        return kniBridge268(__x, __y, __quo?.getPointer(memScope).rawValue)
    }
}

fun __remquof(__x: Float, __y: Float, __quo: CValuesRef<IntVar>?): Float {
    memScoped {
        return kniBridge269(__x, __y, __quo?.getPointer(memScope).rawValue)
    }
}

fun lrintf(__x: Float): Long {
    return kniBridge270(__x)
}

fun __lrintf(__x: Float): Long {
    return kniBridge271(__x)
}

fun llrintf(__x: Float): Long {
    return kniBridge272(__x)
}

fun __llrintf(__x: Float): Long {
    return kniBridge273(__x)
}

fun lroundf(__x: Float): Long {
    return kniBridge274(__x)
}

fun __lroundf(__x: Float): Long {
    return kniBridge275(__x)
}

fun llroundf(__x: Float): Long {
    return kniBridge276(__x)
}

fun __llroundf(__x: Float): Long {
    return kniBridge277(__x)
}

fun fdimf(__x: Float, __y: Float): Float {
    return kniBridge278(__x, __y)
}

fun __fdimf(__x: Float, __y: Float): Float {
    return kniBridge279(__x, __y)
}

fun fmaxf(__x: Float, __y: Float): Float {
    return kniBridge280(__x, __y)
}

fun __fmaxf(__x: Float, __y: Float): Float {
    return kniBridge281(__x, __y)
}

fun fminf(__x: Float, __y: Float): Float {
    return kniBridge282(__x, __y)
}

fun __fminf(__x: Float, __y: Float): Float {
    return kniBridge283(__x, __y)
}

fun fmaf(__x: Float, __y: Float, __z: Float): Float {
    return kniBridge284(__x, __y, __z)
}

fun __fmaf(__x: Float, __y: Float, __z: Float): Float {
    return kniBridge285(__x, __y, __z)
}

fun scalbf(__x: Float, __n: Float): Float {
    return kniBridge286(__x, __n)
}

fun __scalbf(__x: Float, __n: Float): Float {
    return kniBridge287(__x, __n)
}

const val _MATH_H: Int = 1

const val _FEATURES_H: Int = 1

const val _DEFAULT_SOURCE: Int = 1

const val __USE_ISOC11: Int = 1

const val __USE_ISOC99: Int = 1

const val __USE_ISOC95: Int = 1

const val __USE_POSIX_IMPLICITLY: Int = 1

const val _POSIX_SOURCE: Int = 1

const val _POSIX_C_SOURCE: Long = 200809

const val __USE_POSIX: Int = 1

const val __USE_POSIX2: Int = 1

const val __USE_POSIX199309: Int = 1

const val __USE_POSIX199506: Int = 1

const val __USE_XOPEN2K: Int = 1

const val __USE_XOPEN2K8: Int = 1

const val _ATFILE_SOURCE: Int = 1

const val __USE_MISC: Int = 1

const val __USE_ATFILE: Int = 1

const val __USE_FORTIFY_LEVEL: Int = 0

const val __GLIBC_USE_DEPRECATED_GETS: Int = 0

const val _STDC_PREDEF_H: Int = 1

const val __STDC_IEC_559__: Int = 1

const val __STDC_IEC_559_COMPLEX__: Int = 1

const val __STDC_ISO_10646__: Long = 201706

const val __STDC_NO_THREADS__: Int = 1

const val __GNU_LIBRARY__: Int = 6

const val __GLIBC__: Int = 2

const val __GLIBC_MINOR__: Int = 27

const val _SYS_CDEFS_H: Int = 1

const val __glibc_c99_flexarr_available: Int = 1

const val __WORDSIZE: Int = 64

const val __WORDSIZE_TIME64_COMPAT32: Int = 1

const val __SYSCALL_WORDSIZE: Int = 64

const val __HAVE_GENERIC_SELECTION: Int = 1

const val __GLIBC_USE_LIB_EXT2: Int = 0

const val __GLIBC_USE_IEC_60559_BFP_EXT: Int = 0

const val __GLIBC_USE_IEC_60559_FUNCS_EXT: Int = 0

const val __GLIBC_USE_IEC_60559_TYPES_EXT: Int = 0

const val _BITS_TYPES_H: Int = 1

const val _BITS_TYPESIZES_H: Int = 1

const val __OFF_T_MATCHES_OFF64_T: Int = 1

const val __INO_T_MATCHES_INO64_T: Int = 1

const val __RLIM_T_MATCHES_RLIM64_T: Int = 1

const val __FD_SETSIZE: Int = 1024

const val _BITS_LIBM_SIMD_DECL_STUBS_H: Int = 1

const val __HAVE_FLOAT128: Int = 0

const val __HAVE_DISTINCT_FLOAT128: Int = 0

const val __HAVE_FLOAT64X: Int = 1

const val __HAVE_FLOAT64X_LONG_DOUBLE: Int = 1

const val __HAVE_FLOAT16: Int = 0

const val __HAVE_FLOAT32: Int = 1

const val __HAVE_FLOAT64: Int = 1

const val __HAVE_FLOAT32X: Int = 1

const val __HAVE_FLOAT128X: Int = 0

const val __HAVE_DISTINCT_FLOAT16: Int = 0

const val __HAVE_DISTINCT_FLOAT32: Int = 0

const val __HAVE_DISTINCT_FLOAT64: Int = 0

const val __HAVE_DISTINCT_FLOAT32X: Int = 0

const val __HAVE_DISTINCT_FLOAT64X: Int = 0

const val __HAVE_DISTINCT_FLOAT128X: Int = 0

const val __HAVE_FLOATN_NOT_TYPEDEF: Int = 0

val HUGE_VAL: Double get() = bitsToDouble(9218868437227405312) /* == Infinity */

val HUGE_VALF: Float get() = bitsToFloat(2139095040) /* == Infinity */


val INFINITY: Float get() = bitsToFloat(2139095040) /* == Infinity */

val NAN: Float get() = bitsToFloat(2143289344) /* == NaN */

const val __GLIBC_FLT_EVAL_METHOD: Int = 0

const val __FP_LOGB0_IS_MIN: Int = 1

const val __FP_LOGBNAN_IS_MIN: Int = 1

const val FP_ILOGB0: Int = -2147483648

const val FP_ILOGBNAN: Int = -2147483648

const val __MATH_DECLARE_LDOUBLE: Int = 1

const val FP_NAN: Int = 0

const val FP_INFINITE: Int = 1

const val FP_ZERO: Int = 2

const val FP_SUBNORMAL: Int = 3

const val FP_NORMAL: Int = 4

const val MATH_ERRNO: Int = 1

const val MATH_ERREXCEPT: Int = 2

const val math_errhandling: Int = 3

val M_E: Double get() = bitsToDouble(4613303445314885481) /* == 2.718281828459045 */

val M_LOG2E: Double get() = bitsToDouble(4609176140021203710) /* == 1.4426950408889634 */

val M_LOG10E: Double get() = bitsToDouble(4601495173785380110) /* == 0.4342944819032518 */

val M_LN2: Double get() = bitsToDouble(4604418534313441775) /* == 0.6931471805599453 */

val M_LN10: Double get() = bitsToDouble(4612367379483415830) /* == 2.302585092994046 */

val M_PI: Double get() = bitsToDouble(4614256656552045848) /* == 3.141592653589793 */

val M_PI_2: Double get() = bitsToDouble(4609753056924675352) /* == 1.5707963267948966 */

val M_PI_4: Double get() = bitsToDouble(4605249457297304856) /* == 0.7853981633974483 */

val M_1_PI: Double get() = bitsToDouble(4599405781057128579) /* == 0.3183098861837907 */

val M_2_PI: Double get() = bitsToDouble(4603909380684499075) /* == 0.6366197723675814 */

val M_2_SQRTPI: Double get() = bitsToDouble(4607760587169110893) /* == 1.1283791670955126 */

val M_SQRT2: Double get() = bitsToDouble(4609047870845172685) /* == 1.4142135623730951 */

val M_SQRT1_2: Double get() = bitsToDouble(4604544271217802189) /* == 0.7071067811865476 */

var signgam: Int
    get() = kniBridge288()
    set(value) { kniBridge289(value) }

@CStruct("struct { int p0[2]; }")
class __fsid_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    val __val: CArrayPointer<IntVar>
        get() = arrayMemberAt(0)
    
}


typealias __u_charVar = UByteVarOf<__u_char>
typealias __u_char = UByte

typealias __u_shortVar = UShortVarOf<__u_short>
typealias __u_short = UShort

typealias __u_intVar = UIntVarOf<__u_int>
typealias __u_int = UInt

typealias __u_longVar = ULongVarOf<__u_long>
typealias __u_long = ULong

typealias __int8_tVar = ByteVarOf<__int8_t>
typealias __int8_t = Byte

typealias __uint8_tVar = UByteVarOf<__uint8_t>
typealias __uint8_t = UByte

typealias __int16_tVar = ShortVarOf<__int16_t>
typealias __int16_t = Short

typealias __uint16_tVar = UShortVarOf<__uint16_t>
typealias __uint16_t = UShort

typealias __int32_tVar = IntVarOf<__int32_t>
typealias __int32_t = Int

typealias __uint32_tVar = UIntVarOf<__uint32_t>
typealias __uint32_t = UInt

typealias __int64_tVar = LongVarOf<__int64_t>
typealias __int64_t = Long

typealias __uint64_tVar = ULongVarOf<__uint64_t>
typealias __uint64_t = ULong

typealias __quad_tVar = LongVarOf<__quad_t>
typealias __quad_t = Long

typealias __u_quad_tVar = ULongVarOf<__u_quad_t>
typealias __u_quad_t = ULong

typealias __intmax_tVar = LongVarOf<__intmax_t>
typealias __intmax_t = Long

typealias __uintmax_tVar = ULongVarOf<__uintmax_t>
typealias __uintmax_t = ULong

typealias __dev_tVar = ULongVarOf<__dev_t>
typealias __dev_t = ULong

typealias __uid_tVar = UIntVarOf<__uid_t>
typealias __uid_t = UInt

typealias __gid_tVar = UIntVarOf<__gid_t>
typealias __gid_t = UInt

typealias __ino_tVar = ULongVarOf<__ino_t>
typealias __ino_t = ULong

typealias __ino64_tVar = ULongVarOf<__ino64_t>
typealias __ino64_t = ULong

typealias __mode_tVar = UIntVarOf<__mode_t>
typealias __mode_t = UInt

typealias __nlink_tVar = ULongVarOf<__nlink_t>
typealias __nlink_t = ULong

typealias __off_tVar = LongVarOf<__off_t>
typealias __off_t = Long

typealias __off64_tVar = LongVarOf<__off64_t>
typealias __off64_t = Long

typealias __pid_tVar = IntVarOf<__pid_t>
typealias __pid_t = Int

typealias __clock_tVar = LongVarOf<__clock_t>
typealias __clock_t = Long

typealias __rlim_tVar = ULongVarOf<__rlim_t>
typealias __rlim_t = ULong

typealias __rlim64_tVar = ULongVarOf<__rlim64_t>
typealias __rlim64_t = ULong

typealias __id_tVar = UIntVarOf<__id_t>
typealias __id_t = UInt

typealias __time_tVar = LongVarOf<__time_t>
typealias __time_t = Long

typealias __useconds_tVar = UIntVarOf<__useconds_t>
typealias __useconds_t = UInt

typealias __suseconds_tVar = LongVarOf<__suseconds_t>
typealias __suseconds_t = Long

typealias __daddr_tVar = IntVarOf<__daddr_t>
typealias __daddr_t = Int

typealias __key_tVar = IntVarOf<__key_t>
typealias __key_t = Int

typealias __clockid_tVar = IntVarOf<__clockid_t>
typealias __clockid_t = Int

typealias __timer_tVar = CPointerVarOf<__timer_t>
typealias __timer_t = COpaquePointer

typealias __blksize_tVar = LongVarOf<__blksize_t>
typealias __blksize_t = Long

typealias __blkcnt_tVar = LongVarOf<__blkcnt_t>
typealias __blkcnt_t = Long

typealias __blkcnt64_tVar = LongVarOf<__blkcnt64_t>
typealias __blkcnt64_t = Long

typealias __fsblkcnt_tVar = ULongVarOf<__fsblkcnt_t>
typealias __fsblkcnt_t = ULong

typealias __fsblkcnt64_tVar = ULongVarOf<__fsblkcnt64_t>
typealias __fsblkcnt64_t = ULong

typealias __fsfilcnt_tVar = ULongVarOf<__fsfilcnt_t>
typealias __fsfilcnt_t = ULong

typealias __fsfilcnt64_tVar = ULongVarOf<__fsfilcnt64_t>
typealias __fsfilcnt64_t = ULong

typealias __fsword_tVar = LongVarOf<__fsword_t>
typealias __fsword_t = Long

typealias __ssize_tVar = LongVarOf<__ssize_t>
typealias __ssize_t = Long

typealias __syscall_slong_tVar = LongVarOf<__syscall_slong_t>
typealias __syscall_slong_t = Long

typealias __syscall_ulong_tVar = ULongVarOf<__syscall_ulong_t>
typealias __syscall_ulong_t = ULong

typealias __loff_tVar = LongVarOf<__loff_t>
typealias __loff_t = __off64_t

typealias __caddr_tVar = CPointerVarOf<__caddr_t>
typealias __caddr_t = CPointer<ByteVar>

typealias __intptr_tVar = LongVarOf<__intptr_t>
typealias __intptr_t = Long

typealias __socklen_tVar = UIntVarOf<__socklen_t>
typealias __socklen_t = UInt

typealias __sig_atomic_tVar = IntVarOf<__sig_atomic_t>
typealias __sig_atomic_t = Int

typealias _Float32Var = FloatVarOf<_Float32>
typealias _Float32 = Float

typealias _Float64Var = DoubleVarOf<_Float64>
typealias _Float64 = Double

typealias _Float32xVar = DoubleVarOf<_Float32x>
typealias _Float32x = Double

typealias float_tVar = FloatVarOf<float_t>
typealias float_t = Float

typealias double_tVar = DoubleVarOf<double_t>
typealias double_t = Double

@SymbolName("math_kniBridge0")
private external fun kniBridge0(p0: Double): Int
@SymbolName("math_kniBridge1")
private external fun kniBridge1(p0: Double): Int
@SymbolName("math_kniBridge2")
private external fun kniBridge2(p0: Double): Int
@SymbolName("math_kniBridge3")
private external fun kniBridge3(p0: Double): Int
@SymbolName("math_kniBridge4")
private external fun kniBridge4(p0: Double): Int
@SymbolName("math_kniBridge5")
private external fun kniBridge5(p0: Double, p1: Double): Int
@SymbolName("math_kniBridge6")
private external fun kniBridge6(p0: Double): Int
@SymbolName("math_kniBridge7")
private external fun kniBridge7(p0: Double): Double
@SymbolName("math_kniBridge8")
private external fun kniBridge8(p0: Double): Double
@SymbolName("math_kniBridge9")
private external fun kniBridge9(p0: Double): Double
@SymbolName("math_kniBridge10")
private external fun kniBridge10(p0: Double): Double
@SymbolName("math_kniBridge11")
private external fun kniBridge11(p0: Double): Double
@SymbolName("math_kniBridge12")
private external fun kniBridge12(p0: Double): Double
@SymbolName("math_kniBridge13")
private external fun kniBridge13(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge14")
private external fun kniBridge14(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge15")
private external fun kniBridge15(p0: Double): Double
@SymbolName("math_kniBridge16")
private external fun kniBridge16(p0: Double): Double
@SymbolName("math_kniBridge17")
private external fun kniBridge17(p0: Double): Double
@SymbolName("math_kniBridge18")
private external fun kniBridge18(p0: Double): Double
@SymbolName("math_kniBridge19")
private external fun kniBridge19(p0: Double): Double
@SymbolName("math_kniBridge20")
private external fun kniBridge20(p0: Double): Double
@SymbolName("math_kniBridge21")
private external fun kniBridge21(p0: Double): Double
@SymbolName("math_kniBridge22")
private external fun kniBridge22(p0: Double): Double
@SymbolName("math_kniBridge23")
private external fun kniBridge23(p0: Double): Double
@SymbolName("math_kniBridge24")
private external fun kniBridge24(p0: Double): Double
@SymbolName("math_kniBridge25")
private external fun kniBridge25(p0: Double): Double
@SymbolName("math_kniBridge26")
private external fun kniBridge26(p0: Double): Double
@SymbolName("math_kniBridge27")
private external fun kniBridge27(p0: Double): Double
@SymbolName("math_kniBridge28")
private external fun kniBridge28(p0: Double): Double
@SymbolName("math_kniBridge29")
private external fun kniBridge29(p0: Double): Double
@SymbolName("math_kniBridge30")
private external fun kniBridge30(p0: Double): Double
@SymbolName("math_kniBridge31")
private external fun kniBridge31(p0: Double): Double
@SymbolName("math_kniBridge32")
private external fun kniBridge32(p0: Double): Double
@SymbolName("math_kniBridge33")
private external fun kniBridge33(p0: Double): Double
@SymbolName("math_kniBridge34")
private external fun kniBridge34(p0: Double): Double
@SymbolName("math_kniBridge35")
private external fun kniBridge35(p0: Double, p1: NativePtr): Double
@SymbolName("math_kniBridge36")
private external fun kniBridge36(p0: Double, p1: NativePtr): Double
@SymbolName("math_kniBridge37")
private external fun kniBridge37(p0: Double, p1: Int): Double
@SymbolName("math_kniBridge38")
private external fun kniBridge38(p0: Double, p1: Int): Double
@SymbolName("math_kniBridge39")
private external fun kniBridge39(p0: Double): Double
@SymbolName("math_kniBridge40")
private external fun kniBridge40(p0: Double): Double
@SymbolName("math_kniBridge41")
private external fun kniBridge41(p0: Double): Double
@SymbolName("math_kniBridge42")
private external fun kniBridge42(p0: Double): Double
@SymbolName("math_kniBridge43")
private external fun kniBridge43(p0: Double, p1: NativePtr): Double
@SymbolName("math_kniBridge44")
private external fun kniBridge44(p0: Double, p1: NativePtr): Double
@SymbolName("math_kniBridge45")
private external fun kniBridge45(p0: Double): Double
@SymbolName("math_kniBridge46")
private external fun kniBridge46(p0: Double): Double
@SymbolName("math_kniBridge47")
private external fun kniBridge47(p0: Double): Double
@SymbolName("math_kniBridge48")
private external fun kniBridge48(p0: Double): Double
@SymbolName("math_kniBridge49")
private external fun kniBridge49(p0: Double): Double
@SymbolName("math_kniBridge50")
private external fun kniBridge50(p0: Double): Double
@SymbolName("math_kniBridge51")
private external fun kniBridge51(p0: Double): Double
@SymbolName("math_kniBridge52")
private external fun kniBridge52(p0: Double): Double
@SymbolName("math_kniBridge53")
private external fun kniBridge53(p0: Double): Double
@SymbolName("math_kniBridge54")
private external fun kniBridge54(p0: Double): Double
@SymbolName("math_kniBridge55")
private external fun kniBridge55(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge56")
private external fun kniBridge56(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge57")
private external fun kniBridge57(p0: Double): Double
@SymbolName("math_kniBridge58")
private external fun kniBridge58(p0: Double): Double
@SymbolName("math_kniBridge59")
private external fun kniBridge59(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge60")
private external fun kniBridge60(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge61")
private external fun kniBridge61(p0: Double): Double
@SymbolName("math_kniBridge62")
private external fun kniBridge62(p0: Double): Double
@SymbolName("math_kniBridge63")
private external fun kniBridge63(p0: Double): Double
@SymbolName("math_kniBridge64")
private external fun kniBridge64(p0: Double): Double
@SymbolName("math_kniBridge65")
private external fun kniBridge65(p0: Double): Double
@SymbolName("math_kniBridge66")
private external fun kniBridge66(p0: Double): Double
@SymbolName("math_kniBridge67")
private external fun kniBridge67(p0: Double): Double
@SymbolName("math_kniBridge68")
private external fun kniBridge68(p0: Double): Double
@SymbolName("math_kniBridge69")
private external fun kniBridge69(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge70")
private external fun kniBridge70(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge71")
private external fun kniBridge71(p0: Double): Int
@SymbolName("math_kniBridge72")
private external fun kniBridge72(p0: Double): Int
@SymbolName("math_kniBridge73")
private external fun kniBridge73(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge74")
private external fun kniBridge74(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge75")
private external fun kniBridge75(p0: Double): Double
@SymbolName("math_kniBridge76")
private external fun kniBridge76(p0: Double): Double
@SymbolName("math_kniBridge77")
private external fun kniBridge77(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge78")
private external fun kniBridge78(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge79")
private external fun kniBridge79(p0: NativePtr): Double
@SymbolName("math_kniBridge80")
private external fun kniBridge80(p0: NativePtr): Double
@SymbolName("math_kniBridge81")
private external fun kniBridge81(p0: Double): Int
@SymbolName("math_kniBridge82")
private external fun kniBridge82(p0: Double): Double
@SymbolName("math_kniBridge83")
private external fun kniBridge83(p0: Double): Double
@SymbolName("math_kniBridge84")
private external fun kniBridge84(p0: Double): Double
@SymbolName("math_kniBridge85")
private external fun kniBridge85(p0: Double): Double
@SymbolName("math_kniBridge86")
private external fun kniBridge86(p0: Int, p1: Double): Double
@SymbolName("math_kniBridge87")
private external fun kniBridge87(p0: Int, p1: Double): Double
@SymbolName("math_kniBridge88")
private external fun kniBridge88(p0: Double): Double
@SymbolName("math_kniBridge89")
private external fun kniBridge89(p0: Double): Double
@SymbolName("math_kniBridge90")
private external fun kniBridge90(p0: Double): Double
@SymbolName("math_kniBridge91")
private external fun kniBridge91(p0: Double): Double
@SymbolName("math_kniBridge92")
private external fun kniBridge92(p0: Int, p1: Double): Double
@SymbolName("math_kniBridge93")
private external fun kniBridge93(p0: Int, p1: Double): Double
@SymbolName("math_kniBridge94")
private external fun kniBridge94(p0: Double): Double
@SymbolName("math_kniBridge95")
private external fun kniBridge95(p0: Double): Double
@SymbolName("math_kniBridge96")
private external fun kniBridge96(p0: Double): Double
@SymbolName("math_kniBridge97")
private external fun kniBridge97(p0: Double): Double
@SymbolName("math_kniBridge98")
private external fun kniBridge98(p0: Double): Double
@SymbolName("math_kniBridge99")
private external fun kniBridge99(p0: Double): Double
@SymbolName("math_kniBridge100")
private external fun kniBridge100(p0: Double): Double
@SymbolName("math_kniBridge101")
private external fun kniBridge101(p0: Double): Double
@SymbolName("math_kniBridge102")
private external fun kniBridge102(p0: Double): Double
@SymbolName("math_kniBridge103")
private external fun kniBridge103(p0: Double): Double
@SymbolName("math_kniBridge104")
private external fun kniBridge104(p0: Double, p1: NativePtr): Double
@SymbolName("math_kniBridge105")
private external fun kniBridge105(p0: Double, p1: NativePtr): Double
@SymbolName("math_kniBridge106")
private external fun kniBridge106(p0: Double): Double
@SymbolName("math_kniBridge107")
private external fun kniBridge107(p0: Double): Double
@SymbolName("math_kniBridge108")
private external fun kniBridge108(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge109")
private external fun kniBridge109(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge110")
private external fun kniBridge110(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge111")
private external fun kniBridge111(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge112")
private external fun kniBridge112(p0: Double, p1: Int): Double
@SymbolName("math_kniBridge113")
private external fun kniBridge113(p0: Double, p1: Int): Double
@SymbolName("math_kniBridge114")
private external fun kniBridge114(p0: Double): Int
@SymbolName("math_kniBridge115")
private external fun kniBridge115(p0: Double): Int
@SymbolName("math_kniBridge116")
private external fun kniBridge116(p0: Double, p1: Long): Double
@SymbolName("math_kniBridge117")
private external fun kniBridge117(p0: Double, p1: Long): Double
@SymbolName("math_kniBridge118")
private external fun kniBridge118(p0: Double): Double
@SymbolName("math_kniBridge119")
private external fun kniBridge119(p0: Double): Double
@SymbolName("math_kniBridge120")
private external fun kniBridge120(p0: Double): Double
@SymbolName("math_kniBridge121")
private external fun kniBridge121(p0: Double): Double
@SymbolName("math_kniBridge122")
private external fun kniBridge122(p0: Double): Double
@SymbolName("math_kniBridge123")
private external fun kniBridge123(p0: Double): Double
@SymbolName("math_kniBridge124")
private external fun kniBridge124(p0: Double, p1: Double, p2: NativePtr): Double
@SymbolName("math_kniBridge125")
private external fun kniBridge125(p0: Double, p1: Double, p2: NativePtr): Double
@SymbolName("math_kniBridge126")
private external fun kniBridge126(p0: Double): Long
@SymbolName("math_kniBridge127")
private external fun kniBridge127(p0: Double): Long
@SymbolName("math_kniBridge128")
private external fun kniBridge128(p0: Double): Long
@SymbolName("math_kniBridge129")
private external fun kniBridge129(p0: Double): Long
@SymbolName("math_kniBridge130")
private external fun kniBridge130(p0: Double): Long
@SymbolName("math_kniBridge131")
private external fun kniBridge131(p0: Double): Long
@SymbolName("math_kniBridge132")
private external fun kniBridge132(p0: Double): Long
@SymbolName("math_kniBridge133")
private external fun kniBridge133(p0: Double): Long
@SymbolName("math_kniBridge134")
private external fun kniBridge134(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge135")
private external fun kniBridge135(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge136")
private external fun kniBridge136(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge137")
private external fun kniBridge137(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge138")
private external fun kniBridge138(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge139")
private external fun kniBridge139(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge140")
private external fun kniBridge140(p0: Double, p1: Double, p2: Double): Double
@SymbolName("math_kniBridge141")
private external fun kniBridge141(p0: Double, p1: Double, p2: Double): Double
@SymbolName("math_kniBridge142")
private external fun kniBridge142(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge143")
private external fun kniBridge143(p0: Double, p1: Double): Double
@SymbolName("math_kniBridge144")
private external fun kniBridge144(p0: Float): Int
@SymbolName("math_kniBridge145")
private external fun kniBridge145(p0: Float): Int
@SymbolName("math_kniBridge146")
private external fun kniBridge146(p0: Float): Int
@SymbolName("math_kniBridge147")
private external fun kniBridge147(p0: Float): Int
@SymbolName("math_kniBridge148")
private external fun kniBridge148(p0: Float): Int
@SymbolName("math_kniBridge149")
private external fun kniBridge149(p0: Float, p1: Float): Int
@SymbolName("math_kniBridge150")
private external fun kniBridge150(p0: Float): Int
@SymbolName("math_kniBridge151")
private external fun kniBridge151(p0: Float): Float
@SymbolName("math_kniBridge152")
private external fun kniBridge152(p0: Float): Float
@SymbolName("math_kniBridge153")
private external fun kniBridge153(p0: Float): Float
@SymbolName("math_kniBridge154")
private external fun kniBridge154(p0: Float): Float
@SymbolName("math_kniBridge155")
private external fun kniBridge155(p0: Float): Float
@SymbolName("math_kniBridge156")
private external fun kniBridge156(p0: Float): Float
@SymbolName("math_kniBridge157")
private external fun kniBridge157(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge158")
private external fun kniBridge158(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge159")
private external fun kniBridge159(p0: Float): Float
@SymbolName("math_kniBridge160")
private external fun kniBridge160(p0: Float): Float
@SymbolName("math_kniBridge161")
private external fun kniBridge161(p0: Float): Float
@SymbolName("math_kniBridge162")
private external fun kniBridge162(p0: Float): Float
@SymbolName("math_kniBridge163")
private external fun kniBridge163(p0: Float): Float
@SymbolName("math_kniBridge164")
private external fun kniBridge164(p0: Float): Float
@SymbolName("math_kniBridge165")
private external fun kniBridge165(p0: Float): Float
@SymbolName("math_kniBridge166")
private external fun kniBridge166(p0: Float): Float
@SymbolName("math_kniBridge167")
private external fun kniBridge167(p0: Float): Float
@SymbolName("math_kniBridge168")
private external fun kniBridge168(p0: Float): Float
@SymbolName("math_kniBridge169")
private external fun kniBridge169(p0: Float): Float
@SymbolName("math_kniBridge170")
private external fun kniBridge170(p0: Float): Float
@SymbolName("math_kniBridge171")
private external fun kniBridge171(p0: Float): Float
@SymbolName("math_kniBridge172")
private external fun kniBridge172(p0: Float): Float
@SymbolName("math_kniBridge173")
private external fun kniBridge173(p0: Float): Float
@SymbolName("math_kniBridge174")
private external fun kniBridge174(p0: Float): Float
@SymbolName("math_kniBridge175")
private external fun kniBridge175(p0: Float): Float
@SymbolName("math_kniBridge176")
private external fun kniBridge176(p0: Float): Float
@SymbolName("math_kniBridge177")
private external fun kniBridge177(p0: Float): Float
@SymbolName("math_kniBridge178")
private external fun kniBridge178(p0: Float): Float
@SymbolName("math_kniBridge179")
private external fun kniBridge179(p0: Float, p1: NativePtr): Float
@SymbolName("math_kniBridge180")
private external fun kniBridge180(p0: Float, p1: NativePtr): Float
@SymbolName("math_kniBridge181")
private external fun kniBridge181(p0: Float, p1: Int): Float
@SymbolName("math_kniBridge182")
private external fun kniBridge182(p0: Float, p1: Int): Float
@SymbolName("math_kniBridge183")
private external fun kniBridge183(p0: Float): Float
@SymbolName("math_kniBridge184")
private external fun kniBridge184(p0: Float): Float
@SymbolName("math_kniBridge185")
private external fun kniBridge185(p0: Float): Float
@SymbolName("math_kniBridge186")
private external fun kniBridge186(p0: Float): Float
@SymbolName("math_kniBridge187")
private external fun kniBridge187(p0: Float, p1: NativePtr): Float
@SymbolName("math_kniBridge188")
private external fun kniBridge188(p0: Float, p1: NativePtr): Float
@SymbolName("math_kniBridge189")
private external fun kniBridge189(p0: Float): Float
@SymbolName("math_kniBridge190")
private external fun kniBridge190(p0: Float): Float
@SymbolName("math_kniBridge191")
private external fun kniBridge191(p0: Float): Float
@SymbolName("math_kniBridge192")
private external fun kniBridge192(p0: Float): Float
@SymbolName("math_kniBridge193")
private external fun kniBridge193(p0: Float): Float
@SymbolName("math_kniBridge194")
private external fun kniBridge194(p0: Float): Float
@SymbolName("math_kniBridge195")
private external fun kniBridge195(p0: Float): Float
@SymbolName("math_kniBridge196")
private external fun kniBridge196(p0: Float): Float
@SymbolName("math_kniBridge197")
private external fun kniBridge197(p0: Float): Float
@SymbolName("math_kniBridge198")
private external fun kniBridge198(p0: Float): Float
@SymbolName("math_kniBridge199")
private external fun kniBridge199(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge200")
private external fun kniBridge200(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge201")
private external fun kniBridge201(p0: Float): Float
@SymbolName("math_kniBridge202")
private external fun kniBridge202(p0: Float): Float
@SymbolName("math_kniBridge203")
private external fun kniBridge203(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge204")
private external fun kniBridge204(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge205")
private external fun kniBridge205(p0: Float): Float
@SymbolName("math_kniBridge206")
private external fun kniBridge206(p0: Float): Float
@SymbolName("math_kniBridge207")
private external fun kniBridge207(p0: Float): Float
@SymbolName("math_kniBridge208")
private external fun kniBridge208(p0: Float): Float
@SymbolName("math_kniBridge209")
private external fun kniBridge209(p0: Float): Float
@SymbolName("math_kniBridge210")
private external fun kniBridge210(p0: Float): Float
@SymbolName("math_kniBridge211")
private external fun kniBridge211(p0: Float): Float
@SymbolName("math_kniBridge212")
private external fun kniBridge212(p0: Float): Float
@SymbolName("math_kniBridge213")
private external fun kniBridge213(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge214")
private external fun kniBridge214(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge215")
private external fun kniBridge215(p0: Float): Int
@SymbolName("math_kniBridge216")
private external fun kniBridge216(p0: Float): Int
@SymbolName("math_kniBridge217")
private external fun kniBridge217(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge218")
private external fun kniBridge218(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge219")
private external fun kniBridge219(p0: Float): Float
@SymbolName("math_kniBridge220")
private external fun kniBridge220(p0: Float): Float
@SymbolName("math_kniBridge221")
private external fun kniBridge221(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge222")
private external fun kniBridge222(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge223")
private external fun kniBridge223(p0: NativePtr): Float
@SymbolName("math_kniBridge224")
private external fun kniBridge224(p0: NativePtr): Float
@SymbolName("math_kniBridge225")
private external fun kniBridge225(p0: Float): Int
@SymbolName("math_kniBridge226")
private external fun kniBridge226(p0: Float): Float
@SymbolName("math_kniBridge227")
private external fun kniBridge227(p0: Float): Float
@SymbolName("math_kniBridge228")
private external fun kniBridge228(p0: Float): Float
@SymbolName("math_kniBridge229")
private external fun kniBridge229(p0: Float): Float
@SymbolName("math_kniBridge230")
private external fun kniBridge230(p0: Int, p1: Float): Float
@SymbolName("math_kniBridge231")
private external fun kniBridge231(p0: Int, p1: Float): Float
@SymbolName("math_kniBridge232")
private external fun kniBridge232(p0: Float): Float
@SymbolName("math_kniBridge233")
private external fun kniBridge233(p0: Float): Float
@SymbolName("math_kniBridge234")
private external fun kniBridge234(p0: Float): Float
@SymbolName("math_kniBridge235")
private external fun kniBridge235(p0: Float): Float
@SymbolName("math_kniBridge236")
private external fun kniBridge236(p0: Int, p1: Float): Float
@SymbolName("math_kniBridge237")
private external fun kniBridge237(p0: Int, p1: Float): Float
@SymbolName("math_kniBridge238")
private external fun kniBridge238(p0: Float): Float
@SymbolName("math_kniBridge239")
private external fun kniBridge239(p0: Float): Float
@SymbolName("math_kniBridge240")
private external fun kniBridge240(p0: Float): Float
@SymbolName("math_kniBridge241")
private external fun kniBridge241(p0: Float): Float
@SymbolName("math_kniBridge242")
private external fun kniBridge242(p0: Float): Float
@SymbolName("math_kniBridge243")
private external fun kniBridge243(p0: Float): Float
@SymbolName("math_kniBridge244")
private external fun kniBridge244(p0: Float): Float
@SymbolName("math_kniBridge245")
private external fun kniBridge245(p0: Float): Float
@SymbolName("math_kniBridge246")
private external fun kniBridge246(p0: Float): Float
@SymbolName("math_kniBridge247")
private external fun kniBridge247(p0: Float): Float
@SymbolName("math_kniBridge248")
private external fun kniBridge248(p0: Float, p1: NativePtr): Float
@SymbolName("math_kniBridge249")
private external fun kniBridge249(p0: Float, p1: NativePtr): Float
@SymbolName("math_kniBridge250")
private external fun kniBridge250(p0: Float): Float
@SymbolName("math_kniBridge251")
private external fun kniBridge251(p0: Float): Float
@SymbolName("math_kniBridge252")
private external fun kniBridge252(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge253")
private external fun kniBridge253(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge254")
private external fun kniBridge254(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge255")
private external fun kniBridge255(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge256")
private external fun kniBridge256(p0: Float, p1: Int): Float
@SymbolName("math_kniBridge257")
private external fun kniBridge257(p0: Float, p1: Int): Float
@SymbolName("math_kniBridge258")
private external fun kniBridge258(p0: Float): Int
@SymbolName("math_kniBridge259")
private external fun kniBridge259(p0: Float): Int
@SymbolName("math_kniBridge260")
private external fun kniBridge260(p0: Float, p1: Long): Float
@SymbolName("math_kniBridge261")
private external fun kniBridge261(p0: Float, p1: Long): Float
@SymbolName("math_kniBridge262")
private external fun kniBridge262(p0: Float): Float
@SymbolName("math_kniBridge263")
private external fun kniBridge263(p0: Float): Float
@SymbolName("math_kniBridge264")
private external fun kniBridge264(p0: Float): Float
@SymbolName("math_kniBridge265")
private external fun kniBridge265(p0: Float): Float
@SymbolName("math_kniBridge266")
private external fun kniBridge266(p0: Float): Float
@SymbolName("math_kniBridge267")
private external fun kniBridge267(p0: Float): Float
@SymbolName("math_kniBridge268")
private external fun kniBridge268(p0: Float, p1: Float, p2: NativePtr): Float
@SymbolName("math_kniBridge269")
private external fun kniBridge269(p0: Float, p1: Float, p2: NativePtr): Float
@SymbolName("math_kniBridge270")
private external fun kniBridge270(p0: Float): Long
@SymbolName("math_kniBridge271")
private external fun kniBridge271(p0: Float): Long
@SymbolName("math_kniBridge272")
private external fun kniBridge272(p0: Float): Long
@SymbolName("math_kniBridge273")
private external fun kniBridge273(p0: Float): Long
@SymbolName("math_kniBridge274")
private external fun kniBridge274(p0: Float): Long
@SymbolName("math_kniBridge275")
private external fun kniBridge275(p0: Float): Long
@SymbolName("math_kniBridge276")
private external fun kniBridge276(p0: Float): Long
@SymbolName("math_kniBridge277")
private external fun kniBridge277(p0: Float): Long
@SymbolName("math_kniBridge278")
private external fun kniBridge278(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge279")
private external fun kniBridge279(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge280")
private external fun kniBridge280(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge281")
private external fun kniBridge281(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge282")
private external fun kniBridge282(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge283")
private external fun kniBridge283(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge284")
private external fun kniBridge284(p0: Float, p1: Float, p2: Float): Float
@SymbolName("math_kniBridge285")
private external fun kniBridge285(p0: Float, p1: Float, p2: Float): Float
@SymbolName("math_kniBridge286")
private external fun kniBridge286(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge287")
private external fun kniBridge287(p0: Float, p1: Float): Float
@SymbolName("math_kniBridge288")
private external fun kniBridge288(): Int
@SymbolName("math_kniBridge289")
private external fun kniBridge289(p0: Int): Unit
