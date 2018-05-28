package com.rivis.feng.website.common.handle;

import com.rivis.feng.website.common.enums.BaseEnum;
import com.rivis.feng.website.common.exception.UserException;
import com.rivis.feng.website.common.util.ResultDataUtil;
import com.rivis.feng.website.pojo.dto.ResultDataDto;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义异常处理机制
 *
 * @author Rivis
 * @date 2018/05/28
 */
@ControllerAdvice
public class SystemExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultDataDto systemHandle(Exception e) {
        if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ResultDataUtil.error(userException.getCode(),
                    userException.getMessage());
        } else {
            return ResultDataUtil.error(BaseEnum.ERROR.getCode(),
                    BaseEnum.ERROR.getMessage());
        }
    }
}
