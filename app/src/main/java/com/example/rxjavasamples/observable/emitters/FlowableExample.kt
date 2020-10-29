package com.example.rxjavasamples.observable.emitters

import io.reactivex.Flowable

fun main() {

    Flowable.just("This is a Flowable")
        .subscribe(
            { value -> println("Received: $value") },
            { error -> println("Error: $error") },
            { println("Completed") }
        )
}