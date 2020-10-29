package com.example.rxjavasamples.observable.operators

import io.reactivex.Observable

fun main() {

    Observable.fromArray("SAMSUNG", "APPLE", "XIOMI")
        .subscribe { println(it) }

    Observable.fromIterable(listOf("SAMSUNG", "APPLE", "XIOMI"))
        .subscribe(
            { value -> println("Received: $value") },      // onNext
            { error -> println("Error: $error") },         // onError
            { println("Completed") }                       // onComplete
        )
}