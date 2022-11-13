package com.yp.sx.test;

import com.yp.sx.common.util.PassUtil;
import org.junit.jupiter.api.Test;

/**
 * @author yp
 * @since 2022/11/13
 **/
public class PassTest {

    @Test
    public void t1(){
        System.out.println(PassUtil.createAESKey());
    }
}
