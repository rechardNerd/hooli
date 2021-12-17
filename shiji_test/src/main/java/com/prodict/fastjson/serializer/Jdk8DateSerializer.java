package com.prodict.fastjson.serializer;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Jdk8DateSerializer implements ObjectSerializer {

    public static final Jdk8DateSerializer instance = new Jdk8DateSerializer();

    protected final static String       defaultPattern  = "yyyy-mm-dd HH:mm:ss";
    protected final static DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern(defaultPattern);
    protected final static DateTimeFormatter defaultFormatter_23 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    protected final static DateTimeFormatter formatter_dt19_tw   = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    protected final static DateTimeFormatter formatter_dt19_cn   = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm:ss");
    protected final static DateTimeFormatter formatter_dt19_cn_1 = DateTimeFormatter.ofPattern("yyyy年M月d日 H时m分s秒");
    protected final static DateTimeFormatter formatter_dt19_kr   = DateTimeFormatter.ofPattern("yyyy년M월d일 HH:mm:ss");
    protected final static DateTimeFormatter formatter_dt19_us   = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    protected final static DateTimeFormatter formatter_dt19_eur  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    protected final static DateTimeFormatter formatter_dt19_de   = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    protected final static DateTimeFormatter formatter_dt19_in   = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    protected final static DateTimeFormatter formatter_d8        = DateTimeFormatter.ofPattern("yyyyMMdd");
    protected final static DateTimeFormatter formatter_d10_tw    = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    protected final static DateTimeFormatter formatter_d10_cn    = DateTimeFormatter.ofPattern("yyyy年M月d日");
    protected final static DateTimeFormatter formatter_d10_kr    = DateTimeFormatter.ofPattern("yyyy년M월d일");
    protected final static DateTimeFormatter formatter_d10_us    = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    protected final static DateTimeFormatter formatter_d10_eur   = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    protected final static DateTimeFormatter formatter_d10_de    = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    protected final static DateTimeFormatter formatter_d10_in    = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    protected final static DateTimeFormatter ISO_FIXED_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

    protected final static String formatter_iso8601_pattern     = "yyyy-MM-dd HH:mm:ss";
    protected final static String formatter_iso8601_pattern_23     = "yyyy-MM-dd HH:mm:ss.SSS";
    protected final static String formatter_iso8601_pattern_29     = "yyyy-MM-dd HH:mm:ss.SSSSSSSSS";
    protected final static DateTimeFormatter formatter_iso8601  = DateTimeFormatter.ofPattern(formatter_iso8601_pattern);

    public Jdk8DateSerializer(){

    }

    @Override
    public void write(JSONSerializer jsonSerializer, Object o, Object o1, Type type, int i) throws IOException {

    }
}
