package com.example.rxjavasamples.observable.emitters

import io.reactivex.Completable

fun main() {

    Completable.create { emitter ->
        emitter.onComplete()
        emitter.onError(Exception())
    }
}