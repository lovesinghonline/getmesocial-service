package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Resource
@RestController
@RequestMapping("/api/comments")
public class CommentResource {
    @Autowired
    private CommentService commentService;
    @PostMapping
    public Comment saveComment(@RequestBody @Valid Comment comment){
        return commentService.saveComment(comment);
    }
    @GetMapping()
    public List<Comment> getAllComment()
    {
        return commentService.getAllComment();
    }
    @PutMapping()
    public Comment updateCommentById(@RequestBody @Valid Comment comment){
        return commentService. updateCommentById(comment);
    }
    @DeleteMapping
    public void deleteComment(@RequestParam( name = "commentId") String commentId){
        commentService.deleteComment(commentId);
    }
    @GetMapping("/find")
    public List<Comment> getCommentByCreatedBy(@RequestParam(name ="CreatedBy") String createdby)
    {return commentService. getCommentByCreatedBy(createdby);
    }
}
