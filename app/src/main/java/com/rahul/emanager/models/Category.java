package com.rahul.emanager.models;

public class Category {
    private String categoryName;
    private int categoryImage;
    private int categoryColor;

    // Constructor with parameters
    public Category(String categoryName, int categoryImage, int categoryColor) {
        this.categoryName = categoryName;
        this.categoryImage = categoryImage;
        this.categoryColor = categoryColor;
    }

    // Getter and Setter for categoryName
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    // Getter and Setter for categoryImage
    public int getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(int categoryImage) {
        this.categoryImage = categoryImage;
    }

    // Getter and Setter for categoryColor
    public int getCategoryColor() {
        return categoryColor;
    }

    public void setCategoryColor(int categoryColor) {
        this.categoryColor = categoryColor;
    }
}
