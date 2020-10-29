package com.example.rxjavasamples.schedulers

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

fun main() {

    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.io())
        .subscribe{ v -> println("Received: $v") }

    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.computation())
        .subscribe{ v -> println("Received: $v") }

    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.newThread())
        .subscribe{ v -> println("Received: $v") }

    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.single())
        .subscribe{ v -> println("Received: $v") }

    Observable.just("Apple", "Orange", "Banana")
        .subscribeOn(Schedulers.trampoline())
        .subscribe{ v -> println("Received: $v") }
}