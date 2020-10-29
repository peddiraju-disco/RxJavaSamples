package com.example.rxjavasamples.observable.emitters

import io.reactivex.Maybe

fun main() {

    Maybe.just("This is a Maybe")
        .subscribe(
            { value -> println("Received: $value") },
            { error -> println("Error: $error") },
            { println("Completed") }
        )
}