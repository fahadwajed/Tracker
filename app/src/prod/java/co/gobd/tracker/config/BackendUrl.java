package co.gobd.tracker.config;

/**
 * Created by fahadwajed on 6/22/16.
 */
public class BackendUrl {
    private BackendUrl() {
    }

    // Tracking server of go fetch
    public static final class ShadowCat {
        public static final String BASE = "http://gofetch.cloudapp.net:1337/";
        public static final String PING = "api/ping";
    }

    // Main backend of go fetch
    public static final class TaskCat {
        // Production
        public static final String BASE = "http://gofetch.cloudapp.net/";

        // Path
        public static final String LOGIN = "token";
        public static final String GET_PROFILE = "api/Account/Profile";
        public static final String GET_REGISTER = "api/Account/Register";
        public static final String GET_ASSIGNED_JOBS = "api/Account/{userId}/jobs";

    }
}
