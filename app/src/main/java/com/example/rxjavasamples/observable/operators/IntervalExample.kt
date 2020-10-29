package com.example.rxjavasamples.observable.operators

import io.reactivex.Observable
import java.util.concurrent.TimeUnit


fun main() {

    Observable.intervalRange(
        10L,     // Start
        5L,      // Count
        0L,   // Initial Delay
        3L,      // Period
        TimeUnit.SECONDS
    ).subscribe { println("Result we just received: $it") }


    try {
        Thread.sleep(20000)
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }

}