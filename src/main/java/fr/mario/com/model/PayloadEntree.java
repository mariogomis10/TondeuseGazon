
package fr.mario.com.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PayloadEntree implements Serializable {

    @JsonProperty("dimensions")
    private Dimensions dimensions;
    
    @JsonProperty("mowers")
    private List<Mower> mowers = null;

    @JsonProperty("dimensions")
    public Dimensions getDimensions() {
        return dimensions;
    }

    @JsonProperty("dimensions")
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    @JsonProperty("mowers")
    public List<Mower> getMowers() {
        return mowers;
    }

    @JsonProperty("mowers")
    public void setMowers(List<Mower> mowers) {
        this.mowers = mowers;
    }

}
