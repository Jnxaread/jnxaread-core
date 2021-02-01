package com.jnxaread.bean.wrap;

import com.jnxaread.bean.Project;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author 未央
 * @Create 2021-02-01 23:08
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProjectWrap extends Project {
    private String username;
}
