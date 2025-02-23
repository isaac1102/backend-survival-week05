package kr.megaptera.assignment.models;

public class Comment {
    private CommentId id;
    private PostId postId;
    private String author;
    private String content;

    public Comment(PostId postId, String author, String content) {
        this.id = CommentId.generate();
        this.postId = postId;
        this.author = author;
        this.content = content;
    }

    public Comment(CommentId id, PostId postId, String author, String content){
        this.id = id;
        this.postId = postId;
        this.author = author;
        this.content = content;
    }

    public CommentId id(){
        return id;
    }

    public PostId postId(){
        return postId;
    }

    public String author(){
        return author;
    }

    public String content(){
        return content;
    }

    public void update(String content){
        this.content = content;
    }
}
