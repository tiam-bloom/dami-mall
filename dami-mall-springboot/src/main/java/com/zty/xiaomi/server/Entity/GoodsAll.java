package com.zty.xiaomi.server.Entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GoodsAll {
    private int errno;
    List<GoodAll> data;
    public GoodsAll(){
        this.errno=0;
    }
}
