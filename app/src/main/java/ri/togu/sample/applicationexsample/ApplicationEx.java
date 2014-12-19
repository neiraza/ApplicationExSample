package ri.togu.sample.applicationexsample;

import android.app.Application;

/**
 * Created by a13694 on 14/12/19.
 */
public class ApplicationEx extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifeCycleListener());
    }
}
