package com.example.rxjavasamples.observable.operators

import io.reactivex.Observable
import java.util.concurrent.TimeUnit


fun main() {

    Observable.intervalRange(
        10L,
        5L,
        0L,
        1L,
        TimeUnit.SECONDS
    ).subscribe { println("Result we just received: $it") }


    try {
        Thread.sleep(20000)
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }

}