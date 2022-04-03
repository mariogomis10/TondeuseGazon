
package fr.mario.com.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mower implements Serializable {

    @JsonProperty("position")
    private Position position;
    
    @JsonProperty("instructions")
    private String instructions;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

}
