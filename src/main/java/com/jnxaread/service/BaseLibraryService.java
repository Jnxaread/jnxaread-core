package com.jnxaread.service;

import com.jnxaread.bean.Fiction;
import com.jnxaread.bean.Label;

/**
 * @author 未央
 * @create 2020-05-06 15:08
 */
public interface BaseLibraryService {

    int addFiction(Fiction newFiction);

    void addLabel(Label label);

}
