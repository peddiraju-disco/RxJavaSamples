package com.example.rxjavasamples.observable.operators

import io.reactivex.Observable

fun main() {

    var list= listOf("SAMSUNG", "APPLE", "XIOMI")

    Observable.just("Hey There!")
        .subscribe { value -> println(value) }

    Observable.just("SAMSUNG", "APPLE", "XIOMI")
        //.map { input -> throw RuntimeException() }
        .subscribe(
            { value -> println("Received: $value") }, // onNext
            { error -> println("Error: $error") },    // onError
            { println("Completed!") }                 // onComplete
        )

}