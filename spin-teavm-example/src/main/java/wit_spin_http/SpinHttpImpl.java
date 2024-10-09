package wit_spin_http;

import java.util.ArrayList;

import static java.nio.charset.StandardCharsets.UTF_8;

public class SpinHttpImpl {
    public static SpinHttp.Response handleHttpRequest(SpinHttp.Request request) {
        final int status = 200;
        final String contentType = "text/plain;charset=UTF-8";

        final String query = request.uri.substring(request.uri.lastIndexOf('/') + 1);

        final int precision;
        if (query == null || query.isEmpty()) {
            precision = 5;
        } else {
            precision = Integer.parseInt(query);
        }

        final String body = RandomWork.doSomeRandomWork(precision);

        return new SpinHttp.Response(
                (short) status,
                new ArrayList<>() {
                    {
                        add(new SpinHttp.Tuple2<>("content-type", contentType));
                    }
                },
                body.getBytes(UTF_8));
    }
}
