package com.laxmirestaurant.laxmirestaurant;

public class laxmiadapter
{
    int Image;
    String titlename,productprice;


    public laxmiadapter(int image, String titlename, String productprice) {
        Image = image;
        this.titlename = titlename;
        this.productprice = productprice;
    }


    public int getImage() {
        return Image;
    }

    public String getTitlename() {
        return titlename;
    }

    public String getProductprice() {
        return productprice;
    }
}
