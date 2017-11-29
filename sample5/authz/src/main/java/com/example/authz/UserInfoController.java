package com.example.authz;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @GetMapping("/userinfo")
    public Object userinfo(final Authentication a) {
        final Map<String, Object> map = new HashMap<>();
        map.put("name", a.getName());
        map.put("authorities", a.getAuthorities());
        return map;
    }
}
