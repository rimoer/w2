package com.wyz.entity.estore;

public class Goods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.id
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.id_class
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    private Long id_class;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_name
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    private String goods_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.describe
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    private String describe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.id
     *
     * @return the value of t_goods.id
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.id
     *
     * @param id the value for t_goods.id
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.id_class
     *
     * @return the value of t_goods.id_class
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    public Long getId_class() {
        return id_class;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.id_class
     *
     * @param id_class the value for t_goods.id_class
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    public void setId_class(Long id_class) {
        this.id_class = id_class;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_name
     *
     * @return the value of t_goods.goods_name
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    public String getGoods_name() {
        return goods_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_name
     *
     * @param goods_name the value for t_goods.goods_name
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name == null ? null : goods_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.describe
     *
     * @return the value of t_goods.describe
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.describe
     *
     * @param describe the value for t_goods.describe
     *
     * @mbggenerated Sat Apr 14 10:14:08 CST 2012
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}