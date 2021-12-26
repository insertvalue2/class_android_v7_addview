package com.nomadlab.myaddview;

import java.util.ArrayList;

public class Fruit {
    String imageUrl;
    String name;
    String description;
    String price;

    public Fruit(String imageUrl, String name, String description, String price) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public static ArrayList<Fruit> getFruits() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("https://cdn.pixabay.com/photo/2017/08/23/06/50/lime-2671736_960_720.jpg", "레몬1", "원산지:한국", "1만원"));
        fruits.add(new Fruit("https://cdn.pixabay.com/photo/2017/08/23/06/50/lime-2671736_960_720.jpg", "레몬2", "원산지:한국", "1만원"));
        fruits.add(new Fruit("https://cdn.pixabay.com/photo/2017/08/23/06/50/lime-2671736_960_720.jpg", "레몬3", "원산지:한국", "1만원"));
        fruits.add(new Fruit("https://media.istockphoto.com/photos/modern-woman-working-and-picking-blueberries-on-a-organic-farm-woman-picture-id1272759286?b=1&k=20&m=1272759286&s=170667a&w=0&h=tp55cylgaycn580F4TPxaclS7yUE6WXZ1m-fnhUj5vE=", "레몬4", "원산지:한국", "1만원"));
        fruits.add(new Fruit("https://cdn.pixabay.com/photo/2017/08/23/06/50/lime-2671736_960_720.jpg", "레몬1", "원산지:한국", "1만원"));
        fruits.add(new Fruit("https://cdn.pixabay.com/photo/2017/08/23/06/50/lime-2671736_960_720.jpg", "레몬2", "원산지:한국", "1만원"));
        fruits.add(new Fruit("https://cdn.pixabay.com/photo/2017/08/23/06/50/lime-2671736_960_720.jpg", "레몬3", "원산지:한국", "1만원"));
        fruits.add(new Fruit("https://media.istockphoto.com/photos/modern-woman-working-and-picking-blueberries-on-a-organic-farm-woman-picture-id1272759286?b=1&k=20&m=1272759286&s=170667a&w=0&h=tp55cylgaycn580F4TPxaclS7yUE6WXZ1m-fnhUj5vE=", "레몬4", "원산지:한국", "1만원"));
        return fruits;
    }
}
