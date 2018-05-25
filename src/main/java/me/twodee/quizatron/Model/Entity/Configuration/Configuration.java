package me.twodee.quizatron.Model.Entity.Configuration;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Configuration implements Serializable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("organizer")
    @Expose
    private String organizer;
    @SerializedName("quiz")
    @Expose
    private Quiz quiz;
    @SerializedName("appearance")
    @Expose
    private Appearance appearance;

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getDescription() {
        return description;
    }

    public String getOrganizer() {
        return organizer;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public Appearance getAppearance() {
        return appearance;
    }
}