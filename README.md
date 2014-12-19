ApplicationExSample
===================

Application classを拡張してみた。
全てのActivityにて、各ライフサイクル完了時に呼ばれてるぽい

* registeractivitylifecyclecallbacksを実装して、Listenerにぶっこんだ。
[Application#registerActivityLifecycleCallbacks](http://developer.android.com/reference/android/app/Application.html#registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks))
