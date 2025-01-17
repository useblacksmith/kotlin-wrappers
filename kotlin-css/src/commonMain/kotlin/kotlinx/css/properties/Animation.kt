@file:Suppress("EnumEntryName")

package kotlinx.css.properties

import kotlinx.css.CssValue
import kotlinx.css.StyleList
import kotlinx.css.hyphenize

class IterationCount(override val value: String) : CssValue(value) {
    companion object {
        val infinite = IterationCount("infinite")
    }
}

val Int.times get() = IterationCount("$this")

enum class AnimationDirection {
    initial, inherit, unset,

    normal, reverse, alternate, alternateReverse;

    override fun toString() = name.hyphenize()
}

enum class FillMode {
    initial, inherit, unset,

    none, forwards, backwards, both;

    override fun toString() = name
}

enum class PlayState {
    initial, inherit, unset,

    running, paused;

    override fun toString() = name
}


class Animation(
    name: String,
    duration: Time = 0.s,
    timing: Timing = Timing.ease,
    delay: Time = 0.s,
    iterationCount: IterationCount = 1.times,
    direction: AnimationDirection = AnimationDirection.normal,
    fillMode: FillMode = FillMode.none,
    playState: PlayState = PlayState.running,
) : CssValue("$duration $timing $delay $iterationCount $direction $fillMode $playState $name")

class Animations : StyleList<Animation>(", ") {
    companion object {
        val none = Animations()
    }
}
