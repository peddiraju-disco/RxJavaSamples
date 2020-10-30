package com.example.rxjavasamples.observable.operators

import io.reactivex.Observable

fun main() {

    getObservableFromList(listOf("SAMSUNG", "APPLE", "XIOMI"))
        .subscribe(
            { item -> println(item) },
            { error -> println(error) },
            { println("Completed") })

}

fun getObservableFromList(myList: List<String>) =
    Observable.create<String> { emitter ->
        myList.forEach { value ->
            if (value == "") {
                emitter.onError(Exception("There's no value to show"))
            }
            emitter.onNext(value)
        }
        emitter.onComplete()
    }