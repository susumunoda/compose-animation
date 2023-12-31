package com.susumunoda.compose.animation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween

private const val SLIDE_DURATION_MILLIS = 350

fun <T> AnimatedContentTransitionScope<T>.enterSlidingUp(
    durationMillis: Int = SLIDE_DURATION_MILLIS,
    targetOffset: (Int) -> Int = { it }
) =
    slideIntoContainer(
        towards = AnimatedContentTransitionScope.SlideDirection.Up,
        animationSpec = tween(
            durationMillis = durationMillis,
            easing = FastOutSlowInEasing
        ),
        targetOffset
    )

fun <T> AnimatedContentTransitionScope<T>.exitSlidingDown(
    durationMillis: Int = SLIDE_DURATION_MILLIS,
    targetOffset: (Int) -> Int = { it }
) =
    slideOutOfContainer(
        towards = AnimatedContentTransitionScope.SlideDirection.Down,
        animationSpec = tween(
            durationMillis = durationMillis,
            easing = FastOutSlowInEasing
        ),
        targetOffset
    )

fun <T> AnimatedContentTransitionScope<T>.enterSlidingLeft(
    durationMillis: Int = SLIDE_DURATION_MILLIS,
    targetOffset: (Int) -> Int = { it }
) =
    slideIntoContainer(
        towards = AnimatedContentTransitionScope.SlideDirection.Left,
        animationSpec = tween(
            durationMillis = durationMillis,
            easing = FastOutSlowInEasing
        ),
        targetOffset
    )

fun <T> AnimatedContentTransitionScope<T>.exitSlidingRight(
    durationMillis: Int = SLIDE_DURATION_MILLIS,
    targetOffset: (Int) -> Int = { it }
) =
    slideOutOfContainer(
        towards = AnimatedContentTransitionScope.SlideDirection.Right,
        animationSpec = tween(
            durationMillis = durationMillis,
            easing = FastOutSlowInEasing
        ),
        targetOffset
    )