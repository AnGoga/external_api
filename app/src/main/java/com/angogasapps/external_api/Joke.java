package com.angogasapps.external_api;

import com.google.gson.annotations.SerializedName;

public class Joke {
    public static final String TYPE_GIF = "gif";
    public static final String TYPE_VIDEO = "video";

    @SerializedName("id")
    private Integer id;

    @SerializedName("description")
    private String description;

    @SerializedName("votes")
    private Integer votes;

    @SerializedName("author")
    private String author;

    @SerializedName("date")
    private String date;

    @SerializedName("gifURL")
    private String gifURL;

    @SerializedName("gifSize")
    private Integer gifSize;

    @SerializedName("previewURL")
    private String previewURL;

    @SerializedName("videoURL")
    private String videoURL;

    @SerializedName("videoPath")
    private String videoPath;

    @SerializedName("videoSize")
    private Integer videoSize;

    @SerializedName("type")
    private String type;

    @SerializedName("width")
    private String width;

    @SerializedName("height")
    private String height;

    @SerializedName("commentsCount")
    private Integer commentsCount;

    @SerializedName("fileSize")
    private Integer fileSize;

    @SerializedName("canVote")
    private Boolean canVote;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGifURL() {
        return gifURL;
    }

    public void setGifURL(String gifURL) {
        this.gifURL = gifURL;
    }

    public Integer getGifSize() {
        return gifSize;
    }

    public void setGifSize(Integer gifSize) {
        this.gifSize = gifSize;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public Integer getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(Integer videoSize) {
        this.videoSize = videoSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Boolean getCanVote() {
        return canVote;
    }

    public void setCanVote(Boolean canVote) {
        this.canVote = canVote;
    }


    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", votes=" + votes +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", gifURL='" + gifURL + '\'' +
                ", gifSize=" + gifSize +
                ", previewURL='" + previewURL + '\'' +
                ", videoURL='" + videoURL + '\'' +
                ", videoPath='" + videoPath + '\'' +
                ", videoSize=" + videoSize +
                ", type='" + type + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", commentsCount=" + commentsCount +
                ", fileSize=" + fileSize +
                ", canVote=" + canVote +
                '}';
    }
}
