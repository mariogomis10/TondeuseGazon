
package fr.mario.com.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position implements Serializable{

    @JsonProperty("x")
    private Integer x;
    
    @JsonProperty("y")
    private Integer y;
    
    @JsonProperty("orientation")
    private String orientation;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

}
