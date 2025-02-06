package com.marcuscspereira.desafio01.entities;

public class Order {

  private Integer code;
  private double basic;
  private double discount;

  public Order() {}

  public Order(Integer code, double basic, double discount) {
    this.code = code;
    this.basic = basic;
    this.discount = discount;
  }
  
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }
  public double getBasic() {
    return basic;
  }
  public void setBasic(double basic) {
    this.basic = basic;
  }
  public double getDiscount() {
    return discount;
  }
  public void setDiscount(double discount) {
    this.discount = discount;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((code == null) ? 0 : code.hashCode());
    long temp;
    temp = Double.doubleToLongBits(basic);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(discount);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Order other = (Order) obj;
    if (code == null) {
      if (other.code != null)
        return false;
    } else if (!code.equals(other.code))
      return false;
    if (Double.doubleToLongBits(basic) != Double.doubleToLongBits(other.basic))
      return false;
    if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
      return false;
    return true;
  }
  
}
