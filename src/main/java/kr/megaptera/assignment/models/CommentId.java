package kr.megaptera.assignment.models;

import com.github.f4b6a3.tsid.TsidCreator;
import org.apache.logging.log4j.util.Strings;

import java.util.Objects;

public class CommentId {
    private String value;

    public CommentId(String value){
        this.value = value;
    }

    public static CommentId of(String value){
        return new CommentId(value);
    }

    public static CommentId generate() {
        return new CommentId(TsidCreator.getTsid().toString());
    }

    @Override
    public boolean equals(Object other) {
        CommentId otherCommentId = (CommentId) other;
        return Objects.equals(value, otherCommentId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return  value;
    }

    public int compare(CommentId id) {
        return value.compareTo(id.value);
    }
}
