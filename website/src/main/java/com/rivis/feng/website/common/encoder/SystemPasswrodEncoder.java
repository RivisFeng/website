package com.rivis.feng.website.common.encoder;

import com.rivis.feng.website.common.util.StringUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author Rivis
 * @date 2018/6/3 20:44
 * @description
 */
@Component
public class SystemPasswrodEncoder implements PasswordEncoder {
    /**
     * Encode the raw password. Generally, a good encoding algorithm applies a SHA-1 or
     * greater hash combined with an 8-byte or greater randomly generated salt.
     *
     * @param rawPassword
     */
    @Override
    public String encode(CharSequence rawPassword) {
        if (!StringUtil.stringIsNull(rawPassword.toString())) {
            return StringUtil.encrypt(rawPassword.toString());
        }
        return "";
    }

    /**
     * Verify the encoded password obtained from storage matches the submitted raw
     * password after it too is encoded. Returns true if the passwords match, false if
     * they do not. The stored password itself is never decoded.
     *
     * @param rawPassword     the raw password to encode and match
     * @param encodedPassword the encoded password from storage to compare with
     * @return true if the raw password, after encoding, matches the encoded password from
     * storage
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        try {
            return StringUtil.validatePassword(rawPassword.toString(), encodedPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
