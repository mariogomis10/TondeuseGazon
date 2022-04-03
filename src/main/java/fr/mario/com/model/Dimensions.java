
package fr.mario.com.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dimensions implements Serializable {

    @JsonProperty("width")
    private Integer width;
    
    @JsonProperty("height")
    private Integer height;

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

}
