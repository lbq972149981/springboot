package com.example.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("book.properties")
@ConfigurationProperties(prefix = "book")
public class BookBean {
   private String name;
   private String author;
   private String price;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getPrice() {
      return price;
   }

   public void setPrice(String price) {
      this.price = price;
   }
}
