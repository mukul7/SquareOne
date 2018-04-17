
package model;

public class ItemModel 
{
int sno;
String item_name;
String item_quantity;
String item_price;
String item_image;
String item_desc;
String item_visibility;
String category;
String path = "http://localhost/picture/";
    public String getCategory() {
        return category;
    }
    
    public String getImageUrl()
    {
        return (path+item_image);
    }
    

    public void setCategory(String category) {
        this.category = category;
    }


    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(String item_quantity) {
        this.item_quantity = item_quantity;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public String getItem_image() {
        return item_image;
    }

    public void setItem_image(String item_image) {
        this.item_image = item_image;
    }

    public String getItem_desc() {
        return item_desc;
    }

    public void setItem_desc(String item_desc) {
        this.item_desc = item_desc;
    }

    public String getItem_visibility() {
        return item_visibility;
    }

    public void setItem_visibility(String item_visibility) {
        this.item_visibility = item_visibility;
    }








}
