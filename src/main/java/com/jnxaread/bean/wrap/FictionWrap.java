package com.jnxaread.bean.wrap;

import com.jnxaread.bean.Fiction;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author 未央
 * @create 2020-05-07 10:02
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FictionWrap extends Fiction {

    private String category;

    private String username;

    private Date lastTime;

    private Integer lastNumber;

    private String lastChapter;

    private String[] tags;
}
