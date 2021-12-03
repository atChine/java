package beans;

import java.math.BigDecimal;

/**
 * @ClassName: Goods
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/12/2 15:44
 * @URL：https://github.com/GaoHaiNB
 */
public class Goods {
    private Integer id;
    private String name;
    private String por;
    private BigDecimal price;

    public Goods() {
    }

    public Goods(Integer id, String name, String por, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.por = por;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPor() {
        return por;
    }

    public void setPor(String por) {
        this.por = por;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", por='" + por + '\'' +
                ", price=" + price +
                '}';
    }
}
