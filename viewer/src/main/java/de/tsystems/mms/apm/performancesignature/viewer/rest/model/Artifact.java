package de.tsystems.mms.apm.performancesignature.viewer.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Artifact {

    @SerializedName("displayPath")
    @Expose
    private String displayPath;
    @SerializedName("fileName")
    @Expose
    private String fileName;
    @SerializedName("relativePath")
    @Expose
    private String relativePath;

    public String getDisplayPath() {
        return displayPath;
    }

    public void setDisplayPath(String displayPath) {
        this.displayPath = displayPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("displayPath", displayPath).append("fileName", fileName).append("relativePath", relativePath).toString();
    }
}
