package org.apache.http.cookie;

public interface CookieAttributeHandler {
    boolean match(Cookie cookie, CookieOrigin cookieOrigin);

    void parse(SetCookie setCookie, String str);

    void validate(Cookie cookie, CookieOrigin cookieOrigin);
}
