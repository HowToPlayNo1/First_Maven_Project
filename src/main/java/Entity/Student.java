package Entity;


import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by le.shen on 2016/9/27.
 */
public class Student {
    private Integer id;

    private String name;
    private int age;
    private float shengao;
    private double money;
    private Date createDate;
    private char loveWord;
    private short shortKey;
    private boolean isRepeater;

    private BigInteger bigNum;
    private BigDecimal bigDecimal;
    private List<String> strList;
    private ArrayList<Integer> intList;

    private Array arr;

}
