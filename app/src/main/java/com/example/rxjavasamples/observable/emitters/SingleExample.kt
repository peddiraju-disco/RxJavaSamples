package com.example.rxjavasamples.observable.emitters

import io.reactivex.Single

fun main() {

    Single.just("This is a Single")
        .subscribe(
            { success -> println("Value is: $success") },
            { e -> println("Error: $e") }
        )
}